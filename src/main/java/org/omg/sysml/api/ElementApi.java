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

import org.omg.sysml.ApiCallback;
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.ApiResponse;
import org.omg.sysml.Configuration;
import org.omg.sysml.Pair;
import org.omg.sysml.ProgressRequestBody;
import org.omg.sysml.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.omg.sysml.model.Element;
import org.omg.sysml.model.Error;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementApi {
    private ApiClient localVarApiClient;

    public ElementApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ElementApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getElementByProjectCommitId
     * @param projectId ID of the project (required)
     * @param commitId ID of the commit (required)
     * @param elementId ID of the element (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The requested content type is not acceptable. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getElementByProjectCommitIdCall(UUID projectId, UUID commitId, UUID elementId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/projects/{projectId}/commits/{commitId}/elements/{elementId}"
            .replaceAll("\\{" + "projectId" + "\\}", localVarApiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "commitId" + "\\}", localVarApiClient.escapeString(commitId.toString()))
            .replaceAll("\\{" + "elementId" + "\\}", localVarApiClient.escapeString(elementId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/ld+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getElementByProjectCommitIdValidateBeforeCall(UUID projectId, UUID commitId, UUID elementId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling getElementByProjectCommitId(Async)");
        }
        
        // verify the required parameter 'commitId' is set
        if (commitId == null) {
            throw new ApiException("Missing the required parameter 'commitId' when calling getElementByProjectCommitId(Async)");
        }
        
        // verify the required parameter 'elementId' is set
        if (elementId == null) {
            throw new ApiException("Missing the required parameter 'elementId' when calling getElementByProjectCommitId(Async)");
        }
        

        okhttp3.Call localVarCall = getElementByProjectCommitIdCall(projectId, commitId, elementId, _callback);
        return localVarCall;

    }

    /**
     * Get element by project, commit and ID
     * 
     * @param projectId ID of the project (required)
     * @param commitId ID of the commit (required)
     * @param elementId ID of the element (required)
     * @return Element
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The requested content type is not acceptable. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected response. </td><td>  -  </td></tr>
     </table>
     */
    public Element getElementByProjectCommitId(UUID projectId, UUID commitId, UUID elementId) throws ApiException {
        ApiResponse<Element> localVarResp = getElementByProjectCommitIdWithHttpInfo(projectId, commitId, elementId);
        return localVarResp.getData();
    }

    /**
     * Get element by project, commit and ID
     * 
     * @param projectId ID of the project (required)
     * @param commitId ID of the commit (required)
     * @param elementId ID of the element (required)
     * @return ApiResponse&lt;Element&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The requested content type is not acceptable. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Element> getElementByProjectCommitIdWithHttpInfo(UUID projectId, UUID commitId, UUID elementId) throws ApiException {
        okhttp3.Call localVarCall = getElementByProjectCommitIdValidateBeforeCall(projectId, commitId, elementId, null);
        Type localVarReturnType = new TypeToken<Element>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get element by project, commit and ID (asynchronously)
     * 
     * @param projectId ID of the project (required)
     * @param commitId ID of the commit (required)
     * @param elementId ID of the element (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The requested content type is not acceptable. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getElementByProjectCommitIdAsync(UUID projectId, UUID commitId, UUID elementId, final ApiCallback<Element> _callback) throws ApiException {

        okhttp3.Call localVarCall = getElementByProjectCommitIdValidateBeforeCall(projectId, commitId, elementId, _callback);
        Type localVarReturnType = new TypeToken<Element>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getElementsByProjectCommit
     * @param projectId ID of the project (required)
     * @param commitId ID of the commit (required)
     * @param pageAfter Page after (optional)
     * @param pageBefore Page before (optional)
     * @param pageSize Page size (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The requested content type is not acceptable. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getElementsByProjectCommitCall(UUID projectId, UUID commitId, String pageAfter, String pageBefore, Integer pageSize, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/projects/{projectId}/commits/{commitId}/elements"
            .replaceAll("\\{" + "projectId" + "\\}", localVarApiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "commitId" + "\\}", localVarApiClient.escapeString(commitId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pageAfter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page[after]", pageAfter));
        }

        if (pageBefore != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page[before]", pageBefore));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page[size]", pageSize));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/ld+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getElementsByProjectCommitValidateBeforeCall(UUID projectId, UUID commitId, String pageAfter, String pageBefore, Integer pageSize, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling getElementsByProjectCommit(Async)");
        }
        
        // verify the required parameter 'commitId' is set
        if (commitId == null) {
            throw new ApiException("Missing the required parameter 'commitId' when calling getElementsByProjectCommit(Async)");
        }
        

        okhttp3.Call localVarCall = getElementsByProjectCommitCall(projectId, commitId, pageAfter, pageBefore, pageSize, _callback);
        return localVarCall;

    }

    /**
     * Get elements by project and commit
     * 
     * @param projectId ID of the project (required)
     * @param commitId ID of the commit (required)
     * @param pageAfter Page after (optional)
     * @param pageBefore Page before (optional)
     * @param pageSize Page size (optional)
     * @return List&lt;Element&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The requested content type is not acceptable. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected response. </td><td>  -  </td></tr>
     </table>
     */
    public List<Element> getElementsByProjectCommit(UUID projectId, UUID commitId, String pageAfter, String pageBefore, Integer pageSize) throws ApiException {
        ApiResponse<List<Element>> localVarResp = getElementsByProjectCommitWithHttpInfo(projectId, commitId, pageAfter, pageBefore, pageSize);
        return localVarResp.getData();
    }

    /**
     * Get elements by project and commit
     * 
     * @param projectId ID of the project (required)
     * @param commitId ID of the commit (required)
     * @param pageAfter Page after (optional)
     * @param pageBefore Page before (optional)
     * @param pageSize Page size (optional)
     * @return ApiResponse&lt;List&lt;Element&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The requested content type is not acceptable. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Element>> getElementsByProjectCommitWithHttpInfo(UUID projectId, UUID commitId, String pageAfter, String pageBefore, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = getElementsByProjectCommitValidateBeforeCall(projectId, commitId, pageAfter, pageBefore, pageSize, null);
        Type localVarReturnType = new TypeToken<List<Element>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get elements by project and commit (asynchronously)
     * 
     * @param projectId ID of the project (required)
     * @param commitId ID of the commit (required)
     * @param pageAfter Page after (optional)
     * @param pageBefore Page before (optional)
     * @param pageSize Page size (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The requested content type is not acceptable. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getElementsByProjectCommitAsync(UUID projectId, UUID commitId, String pageAfter, String pageBefore, Integer pageSize, final ApiCallback<List<Element>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getElementsByProjectCommitValidateBeforeCall(projectId, commitId, pageAfter, pageBefore, pageSize, _callback);
        Type localVarReturnType = new TypeToken<List<Element>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getRootsByProjectCommit
     * @param projectId ID of the project (required)
     * @param commitId ID of the commit (required)
     * @param pageAfter Page after (optional)
     * @param pageBefore Page before (optional)
     * @param pageSize Page size (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The requested content type is not acceptable. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRootsByProjectCommitCall(UUID projectId, UUID commitId, String pageAfter, String pageBefore, Integer pageSize, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/projects/{projectId}/commits/{commitId}/roots"
            .replaceAll("\\{" + "projectId" + "\\}", localVarApiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "commitId" + "\\}", localVarApiClient.escapeString(commitId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pageAfter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page[after]", pageAfter));
        }

        if (pageBefore != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page[before]", pageBefore));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page[size]", pageSize));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/ld+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getRootsByProjectCommitValidateBeforeCall(UUID projectId, UUID commitId, String pageAfter, String pageBefore, Integer pageSize, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling getRootsByProjectCommit(Async)");
        }
        
        // verify the required parameter 'commitId' is set
        if (commitId == null) {
            throw new ApiException("Missing the required parameter 'commitId' when calling getRootsByProjectCommit(Async)");
        }
        

        okhttp3.Call localVarCall = getRootsByProjectCommitCall(projectId, commitId, pageAfter, pageBefore, pageSize, _callback);
        return localVarCall;

    }

    /**
     * Get root elements by project and commit
     * 
     * @param projectId ID of the project (required)
     * @param commitId ID of the commit (required)
     * @param pageAfter Page after (optional)
     * @param pageBefore Page before (optional)
     * @param pageSize Page size (optional)
     * @return List&lt;Element&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The requested content type is not acceptable. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected response. </td><td>  -  </td></tr>
     </table>
     */
    public List<Element> getRootsByProjectCommit(UUID projectId, UUID commitId, String pageAfter, String pageBefore, Integer pageSize) throws ApiException {
        ApiResponse<List<Element>> localVarResp = getRootsByProjectCommitWithHttpInfo(projectId, commitId, pageAfter, pageBefore, pageSize);
        return localVarResp.getData();
    }

    /**
     * Get root elements by project and commit
     * 
     * @param projectId ID of the project (required)
     * @param commitId ID of the commit (required)
     * @param pageAfter Page after (optional)
     * @param pageBefore Page before (optional)
     * @param pageSize Page size (optional)
     * @return ApiResponse&lt;List&lt;Element&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The requested content type is not acceptable. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Element>> getRootsByProjectCommitWithHttpInfo(UUID projectId, UUID commitId, String pageAfter, String pageBefore, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = getRootsByProjectCommitValidateBeforeCall(projectId, commitId, pageAfter, pageBefore, pageSize, null);
        Type localVarReturnType = new TypeToken<List<Element>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get root elements by project and commit (asynchronously)
     * 
     * @param projectId ID of the project (required)
     * @param commitId ID of the commit (required)
     * @param pageAfter Page after (optional)
     * @param pageBefore Page before (optional)
     * @param pageSize Page size (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The requested content type is not acceptable. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRootsByProjectCommitAsync(UUID projectId, UUID commitId, String pageAfter, String pageBefore, Integer pageSize, final ApiCallback<List<Element>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRootsByProjectCommitValidateBeforeCall(projectId, commitId, pageAfter, pageBefore, pageSize, _callback);
        Type localVarReturnType = new TypeToken<List<Element>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
