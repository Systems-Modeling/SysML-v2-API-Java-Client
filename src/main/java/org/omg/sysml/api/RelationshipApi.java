/*
 * SysML v2 API and Services
 * REST/HTTP binding (PSM) for the SysML v2 standard API.
 *
 * OpenAPI spec version: 1.0.0
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


import org.omg.sysml.model.Error;
import org.omg.sysml.model.Relationship;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RelationshipApi {
    private ApiClient apiClient;

    public RelationshipApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RelationshipApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createRelationship
     * @param relationship  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createRelationshipCall(Relationship relationship, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = relationship;

        // create path and map variables
        String localVarPath = "/relationship";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createRelationshipValidateBeforeCall(Relationship relationship, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'relationship' is set
        if (relationship == null) {
            throw new ApiException("Missing the required parameter 'relationship' when calling createRelationship(Async)");
        }
        

        com.squareup.okhttp.Call call = createRelationshipCall(relationship, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Add a new relationship
     * 
     * @param relationship  (required)
     * @return Relationship
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Relationship createRelationship(Relationship relationship) throws ApiException {
        ApiResponse<Relationship> resp = createRelationshipWithHttpInfo(relationship);
        return resp.getData();
    }

    /**
     * Add a new relationship
     * 
     * @param relationship  (required)
     * @return ApiResponse&lt;Relationship&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Relationship> createRelationshipWithHttpInfo(Relationship relationship) throws ApiException {
        com.squareup.okhttp.Call call = createRelationshipValidateBeforeCall(relationship, null, null);
        Type localVarReturnType = new TypeToken<Relationship>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add a new relationship (asynchronously)
     * 
     * @param relationship  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createRelationshipAsync(Relationship relationship, final ApiCallback<Relationship> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createRelationshipValidateBeforeCall(relationship, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Relationship>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getRelationship
     * @param id ID of the relationship (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRelationshipCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/relationship/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRelationshipValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getRelationship(Async)");
        }
        

        com.squareup.okhttp.Call call = getRelationshipCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get relationship by its ID
     * 
     * @param id ID of the relationship (required)
     * @return Relationship
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Relationship getRelationship(String id) throws ApiException {
        ApiResponse<Relationship> resp = getRelationshipWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get relationship by its ID
     * 
     * @param id ID of the relationship (required)
     * @return ApiResponse&lt;Relationship&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Relationship> getRelationshipWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getRelationshipValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<Relationship>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get relationship by its ID (asynchronously)
     * 
     * @param id ID of the relationship (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRelationshipAsync(String id, final ApiCallback<Relationship> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getRelationshipValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Relationship>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getRelationships
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRelationshipsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/relationship";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRelationshipsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getRelationshipsCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get all relationships
     * 
     * @return List&lt;Relationship&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Relationship> getRelationships() throws ApiException {
        ApiResponse<List<Relationship>> resp = getRelationshipsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get all relationships
     * 
     * @return ApiResponse&lt;List&lt;Relationship&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Relationship>> getRelationshipsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getRelationshipsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<Relationship>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all relationships (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRelationshipsAsync(final ApiCallback<List<Relationship>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getRelationshipsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Relationship>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getRelationshipsByElement
     * @param elementId ID of the element that is the source or target of relationships (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRelationshipsByElementCall(String elementId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/relationship/element/{element_id}"
            .replaceAll("\\{" + "element_id" + "\\}", apiClient.escapeString(elementId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRelationshipsByElementValidateBeforeCall(String elementId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'elementId' is set
        if (elementId == null) {
            throw new ApiException("Missing the required parameter 'elementId' when calling getRelationshipsByElement(Async)");
        }
        

        com.squareup.okhttp.Call call = getRelationshipsByElementCall(elementId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get all relationships with the given element as either source or target
     * 
     * @param elementId ID of the element that is the source or target of relationships (required)
     * @return List&lt;Relationship&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Relationship> getRelationshipsByElement(String elementId) throws ApiException {
        ApiResponse<List<Relationship>> resp = getRelationshipsByElementWithHttpInfo(elementId);
        return resp.getData();
    }

    /**
     * Get all relationships with the given element as either source or target
     * 
     * @param elementId ID of the element that is the source or target of relationships (required)
     * @return ApiResponse&lt;List&lt;Relationship&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Relationship>> getRelationshipsByElementWithHttpInfo(String elementId) throws ApiException {
        com.squareup.okhttp.Call call = getRelationshipsByElementValidateBeforeCall(elementId, null, null);
        Type localVarReturnType = new TypeToken<List<Relationship>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all relationships with the given element as either source or target (asynchronously)
     * 
     * @param elementId ID of the element that is the source or target of relationships (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRelationshipsByElementAsync(String elementId, final ApiCallback<List<Relationship>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getRelationshipsByElementValidateBeforeCall(elementId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Relationship>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getRelationshipsBySource
     * @param sourceId ID of the element that is the source of relationships (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRelationshipsBySourceCall(String sourceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/relationship/source/{source_id}"
            .replaceAll("\\{" + "source_id" + "\\}", apiClient.escapeString(sourceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRelationshipsBySourceValidateBeforeCall(String sourceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'sourceId' is set
        if (sourceId == null) {
            throw new ApiException("Missing the required parameter 'sourceId' when calling getRelationshipsBySource(Async)");
        }
        

        com.squareup.okhttp.Call call = getRelationshipsBySourceCall(sourceId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get all relationships with the given element as the source
     * 
     * @param sourceId ID of the element that is the source of relationships (required)
     * @return List&lt;Relationship&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Relationship> getRelationshipsBySource(String sourceId) throws ApiException {
        ApiResponse<List<Relationship>> resp = getRelationshipsBySourceWithHttpInfo(sourceId);
        return resp.getData();
    }

    /**
     * Get all relationships with the given element as the source
     * 
     * @param sourceId ID of the element that is the source of relationships (required)
     * @return ApiResponse&lt;List&lt;Relationship&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Relationship>> getRelationshipsBySourceWithHttpInfo(String sourceId) throws ApiException {
        com.squareup.okhttp.Call call = getRelationshipsBySourceValidateBeforeCall(sourceId, null, null);
        Type localVarReturnType = new TypeToken<List<Relationship>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all relationships with the given element as the source (asynchronously)
     * 
     * @param sourceId ID of the element that is the source of relationships (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRelationshipsBySourceAsync(String sourceId, final ApiCallback<List<Relationship>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getRelationshipsBySourceValidateBeforeCall(sourceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Relationship>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getRelationshipsByTarget
     * @param targetId ID of the element that is the target of relationships (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRelationshipsByTargetCall(String targetId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/relationship/target/{target_id}"
            .replaceAll("\\{" + "target_id" + "\\}", apiClient.escapeString(targetId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRelationshipsByTargetValidateBeforeCall(String targetId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'targetId' is set
        if (targetId == null) {
            throw new ApiException("Missing the required parameter 'targetId' when calling getRelationshipsByTarget(Async)");
        }
        

        com.squareup.okhttp.Call call = getRelationshipsByTargetCall(targetId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get all relationships with the given element as the target
     * 
     * @param targetId ID of the element that is the target of relationships (required)
     * @return List&lt;Relationship&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Relationship> getRelationshipsByTarget(String targetId) throws ApiException {
        ApiResponse<List<Relationship>> resp = getRelationshipsByTargetWithHttpInfo(targetId);
        return resp.getData();
    }

    /**
     * Get all relationships with the given element as the target
     * 
     * @param targetId ID of the element that is the target of relationships (required)
     * @return ApiResponse&lt;List&lt;Relationship&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Relationship>> getRelationshipsByTargetWithHttpInfo(String targetId) throws ApiException {
        com.squareup.okhttp.Call call = getRelationshipsByTargetValidateBeforeCall(targetId, null, null);
        Type localVarReturnType = new TypeToken<List<Relationship>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all relationships with the given element as the target (asynchronously)
     * 
     * @param targetId ID of the element that is the target of relationships (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRelationshipsByTargetAsync(String targetId, final ApiCallback<List<Relationship>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getRelationshipsByTargetValidateBeforeCall(targetId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Relationship>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}