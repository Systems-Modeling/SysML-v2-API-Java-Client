# sysml-v2-api-client

SysML v2 API and Services
- API version: 1.0.0

REST/HTTP binding (PSM) for the SysML v2 standard API.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.omg.sysml</groupId>
  <artifactId>sysml-v2-api-client</artifactId>
  <version>2020-03</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.omg.sysml:sysml-v2-api-client:2020-03"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/sysml-v2-api-client-2020-03.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.CommitApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CommitApi apiInstance = new CommitApi(defaultClient);
    String projectId = "projectId_example"; // String | ID of the project
    String commitId = "commitId_example"; // String | ID of the commit
    try {
      Commit result = apiInstance.getCommitByProjectAndId(projectId, commitId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommitApi#getCommitByProjectAndId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CommitApi* | [**getCommitByProjectAndId**](docs/CommitApi.md#getCommitByProjectAndId) | **GET** /projects/{projectId}/commits/{commitId} | Get commit by project and ID
*CommitApi* | [**getCommitsByProject**](docs/CommitApi.md#getCommitsByProject) | **GET** /projects/{projectId}/commits | Get commits by project
*CommitApi* | [**getHeadCommitByProject**](docs/CommitApi.md#getHeadCommitByProject) | **GET** /projects/{projectId}/head | Get head commit by project
*CommitApi* | [**postCommitByProject**](docs/CommitApi.md#postCommitByProject) | **POST** /projects/{projectId}/commits | Create commit by project
*ElementApi* | [**getElementByProjectCommitId**](docs/ElementApi.md#getElementByProjectCommitId) | **GET** /projects/{projectId}/commits/{commitId}/elements/{elementId} | Get element by project, commit and ID
*ElementApi* | [**getElementsByProjectCommit**](docs/ElementApi.md#getElementsByProjectCommit) | **GET** /projects/{projectId}/commits/{commitId}/elements | Get elements by project and commit
*ProjectApi* | [**getProjectById**](docs/ProjectApi.md#getProjectById) | **GET** /projects/{projectId} | Get project by ID
*ProjectApi* | [**getProjects**](docs/ProjectApi.md#getProjects) | **GET** /projects | Get projects
*ProjectApi* | [**postProject**](docs/ProjectApi.md#postProject) | **POST** /projects | Create project
*RelationshipApi* | [**getRelationshipsByProjectCommitRelatedElement**](docs/RelationshipApi.md#getRelationshipsByProjectCommitRelatedElement) | **GET** /projects/{projectId}/commits/{commitId}/elements/{relatedElementId}/relationships | Get relationships by project, commit, and related element.


## Documentation for Models

 - [Commit](docs/Commit.md)
 - [CommitAllOf](docs/CommitAllOf.md)
 - [Element](docs/Element.md)
 - [ElementAllOf](docs/ElementAllOf.md)
 - [ElementIdentity](docs/ElementIdentity.md)
 - [ElementIdentityAllOf](docs/ElementIdentityAllOf.md)
 - [ElementVersion](docs/ElementVersion.md)
 - [ElementVersionAllOf](docs/ElementVersionAllOf.md)
 - [Error](docs/Error.md)
 - [Identified](docs/Identified.md)
 - [Project](docs/Project.md)
 - [ProjectAllOf](docs/ProjectAllOf.md)
 - [Record](docs/Record.md)
 - [Relationship](docs/Relationship.md)
 - [RelationshipAllOf](docs/RelationshipAllOf.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



