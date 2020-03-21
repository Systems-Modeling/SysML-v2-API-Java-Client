//usr/bin/env jshell --show-version "$0" "$@"; exit $?
/env -class-path ~/SysML-v2-API-Java-Client/build/libs/sysml-v2-api-client-2020-03-all.jar

import java.util.Arrays;
import java.util.UUID;

import org.omg.sysml.ApiClient;
import org.omg.sysml.api.*;
import org.omg.sysml.model.*;

var apiClient = new ApiClient();
apiClient.setBasePath("http://localhost:9000");

var project = new Project();
project.setName("MyProject");

var projectApi = new ProjectApi(apiClient);
var projectResponse = projectApi.postProject(project);
System.out.println("--- Project ---");
System.out.println(projectResponse);

var firstBlock = new Element();
firstBlock.put("@type", "Block");
// Fluent API getters/setters also supported
var firstIdentity = new ElementIdentity().id(UUID.fromString("b92bb8e8-740b-4eee-b621-91a82be67d6a"));
var firstElementVersion = new ElementVersion().data(firstBlock).identity(firstIdentity);
var secondBlock = new Element();
secondBlock.put("@type", "Block");
var secondIdentity = new ElementIdentity().id(UUID.fromString("a429229d-333a-4f2d-89b4-82354d29109d"));
var secondElementVersion = new ElementVersion().data(secondBlock).identity(secondIdentity);
var firstCommit = new Commit().changes(Arrays.asList(firstElementVersion, secondElementVersion));

var commitApi = new CommitApi(apiClient);
var firstCommitResponse = commitApi.postCommitByProject(projectResponse.getId(), firstCommit);
System.out.println("--- First Commit ---");
System.out.println(firstCommitResponse);

var generalization = new Element();
generalization.put("@type", "Generalization");
var firstBlockIdentified = new Identified().identifier(UUID.fromString("b92bb8e8-740b-4eee-b621-91a82be67d6a"));
generalization.put("source", Arrays.asList(firstBlockIdentified));
var secondBlockIdentified = new Identified().identifier(UUID.fromString("a429229d-333a-4f2d-89b4-82354d29109d"));
generalization.put("target", Arrays.asList(secondBlockIdentified));
// Note that no ElementIdentity is provided. Server will generate one when not provided.
var generalizationElementVersion = new ElementVersion().data(generalization);
var firstCommitRecord = new Record().id(firstCommitResponse.getId());
var secondCommit = new Commit().previousCommit(firstCommitRecord).changes(Arrays.asList(generalizationElementVersion));
var secondCommitResponse = commitApi.postCommitByProject(projectResponse.getId(), secondCommit);
System.out.println("--- Second Commit ---");
System.out.println(secondCommitResponse);

/exit