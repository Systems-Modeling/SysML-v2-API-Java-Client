/*
 * SysML v2 API and Services
 * REST/HTTP binding (PSM) for the SysML v2 standard API.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.omg.sysml.api;

import org.omg.sysml.ApiException;
import org.omg.sysml.model.Element;
import org.omg.sysml.model.Error;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ElementApi
 */
@Ignore
public class ElementApiTest {

    private final ElementApi api = new ElementApi();

    
    /**
     * Get element by project, commit and ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getElementByProjectCommitIdTest() throws ApiException {
        UUID projectId = null;
        UUID commitId = null;
        UUID elementId = null;
        Element response = api.getElementByProjectCommitId(projectId, commitId, elementId);

        // TODO: test validations
    }
    
    /**
     * Get elements by project and commit
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getElementsByProjectCommitTest() throws ApiException {
        UUID projectId = null;
        UUID commitId = null;
        String pageAfter = null;
        String pageBefore = null;
        Integer pageSize = null;
        List<Element> response = api.getElementsByProjectCommit(projectId, commitId, pageAfter, pageBefore, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get root elements by project and commit
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRootsByProjectCommitTest() throws ApiException {
        UUID projectId = null;
        UUID commitId = null;
        String pageAfter = null;
        String pageBefore = null;
        Integer pageSize = null;
        List<Element> response = api.getRootsByProjectCommit(projectId, commitId, pageAfter, pageBefore, pageSize);

        // TODO: test validations
    }
    
}
