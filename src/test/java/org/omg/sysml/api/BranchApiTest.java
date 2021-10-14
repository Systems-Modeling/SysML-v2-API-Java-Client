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
import org.omg.sysml.model.Branch;
import org.omg.sysml.model.Error;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BranchApi
 */
@Ignore
public class BranchApiTest {

    private final BranchApi api = new BranchApi();

    
    /**
     * Delete branch by project and ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBranchByProjectAndIdTest() throws ApiException {
        UUID projectId = null;
        UUID branchId = null;
        Branch response = api.deleteBranchByProjectAndId(projectId, branchId);

        // TODO: test validations
    }
    
    /**
     * Get branches by project
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBranchesByProjectTest() throws ApiException {
        UUID projectId = null;
        String pageAfter = null;
        String pageBefore = null;
        Integer pageSize = null;
        List<Branch> response = api.getBranchesByProject(projectId, pageAfter, pageBefore, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get branch by project and ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBranchesByProjectAndIdTest() throws ApiException {
        UUID projectId = null;
        UUID branchId = null;
        Branch response = api.getBranchesByProjectAndId(projectId, branchId);

        // TODO: test validations
    }
    
    /**
     * Create branch by project
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postBranchByProjectTest() throws ApiException {
        UUID projectId = null;
        Branch body = null;
        Branch response = api.postBranchByProject(projectId, body);

        // TODO: test validations
    }
    
}
