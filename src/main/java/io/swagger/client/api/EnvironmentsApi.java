/*
 * LaunchDarkly REST API
 * Build custom integrations with the LaunchDarkly REST API
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@launchdarkly.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.Environment;
import io.swagger.client.model.EnvironmentBody;
import io.swagger.client.model.PatchDelta;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnvironmentsApi {
    private ApiClient apiClient;

    public EnvironmentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EnvironmentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteEnvironment
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteEnvironmentCall(String projectKey, String environmentKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/environments/{projectKey}/{environmentKey}"
            .replaceAll("\\{" + "projectKey" + "\\}", apiClient.escapeString(projectKey.toString()))
            .replaceAll("\\{" + "environmentKey" + "\\}", apiClient.escapeString(environmentKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
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

        String[] localVarAuthNames = new String[] { "Token" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteEnvironmentValidateBeforeCall(String projectKey, String environmentKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectKey' is set
        if (projectKey == null) {
            throw new ApiException("Missing the required parameter 'projectKey' when calling deleteEnvironment(Async)");
        }
        
        // verify the required parameter 'environmentKey' is set
        if (environmentKey == null) {
            throw new ApiException("Missing the required parameter 'environmentKey' when calling deleteEnvironment(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteEnvironmentCall(projectKey, environmentKey, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete an environment by ID
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteEnvironment(String projectKey, String environmentKey) throws ApiException {
        deleteEnvironmentWithHttpInfo(projectKey, environmentKey);
    }

    /**
     * Delete an environment by ID
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteEnvironmentWithHttpInfo(String projectKey, String environmentKey) throws ApiException {
        com.squareup.okhttp.Call call = deleteEnvironmentValidateBeforeCall(projectKey, environmentKey, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete an environment by ID (asynchronously)
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteEnvironmentAsync(String projectKey, String environmentKey, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteEnvironmentValidateBeforeCall(projectKey, environmentKey, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getEnvironment
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEnvironmentCall(String projectKey, String environmentKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/environments/{projectKey}/{environmentKey}"
            .replaceAll("\\{" + "projectKey" + "\\}", apiClient.escapeString(projectKey.toString()))
            .replaceAll("\\{" + "environmentKey" + "\\}", apiClient.escapeString(environmentKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
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

        String[] localVarAuthNames = new String[] { "Token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEnvironmentValidateBeforeCall(String projectKey, String environmentKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectKey' is set
        if (projectKey == null) {
            throw new ApiException("Missing the required parameter 'projectKey' when calling getEnvironment(Async)");
        }
        
        // verify the required parameter 'environmentKey' is set
        if (environmentKey == null) {
            throw new ApiException("Missing the required parameter 'environmentKey' when calling getEnvironment(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getEnvironmentCall(projectKey, environmentKey, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get an environment given a project and key.
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key (required)
     * @return Environment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Environment getEnvironment(String projectKey, String environmentKey) throws ApiException {
        ApiResponse<Environment> resp = getEnvironmentWithHttpInfo(projectKey, environmentKey);
        return resp.getData();
    }

    /**
     * Get an environment given a project and key.
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key (required)
     * @return ApiResponse&lt;Environment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Environment> getEnvironmentWithHttpInfo(String projectKey, String environmentKey) throws ApiException {
        com.squareup.okhttp.Call call = getEnvironmentValidateBeforeCall(projectKey, environmentKey, null, null);
        Type localVarReturnType = new TypeToken<Environment>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get an environment given a project and key. (asynchronously)
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEnvironmentAsync(String projectKey, String environmentKey, final ApiCallback<Environment> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEnvironmentValidateBeforeCall(projectKey, environmentKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Environment>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for patchEnvironment
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key (required)
     * @param patchDelta http://jsonpatch.com/ (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call patchEnvironmentCall(String projectKey, String environmentKey, List<PatchDelta> patchDelta, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = patchDelta;
        
        // create path and map variables
        String localVarPath = "/environments/{projectKey}/{environmentKey}"
            .replaceAll("\\{" + "projectKey" + "\\}", apiClient.escapeString(projectKey.toString()))
            .replaceAll("\\{" + "environmentKey" + "\\}", apiClient.escapeString(environmentKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
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

        String[] localVarAuthNames = new String[] { "Token" };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call patchEnvironmentValidateBeforeCall(String projectKey, String environmentKey, List<PatchDelta> patchDelta, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectKey' is set
        if (projectKey == null) {
            throw new ApiException("Missing the required parameter 'projectKey' when calling patchEnvironment(Async)");
        }
        
        // verify the required parameter 'environmentKey' is set
        if (environmentKey == null) {
            throw new ApiException("Missing the required parameter 'environmentKey' when calling patchEnvironment(Async)");
        }
        
        // verify the required parameter 'patchDelta' is set
        if (patchDelta == null) {
            throw new ApiException("Missing the required parameter 'patchDelta' when calling patchEnvironment(Async)");
        }
        
        
        com.squareup.okhttp.Call call = patchEnvironmentCall(projectKey, environmentKey, patchDelta, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Modify an environment by ID
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key (required)
     * @param patchDelta http://jsonpatch.com/ (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void patchEnvironment(String projectKey, String environmentKey, List<PatchDelta> patchDelta) throws ApiException {
        patchEnvironmentWithHttpInfo(projectKey, environmentKey, patchDelta);
    }

    /**
     * Modify an environment by ID
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key (required)
     * @param patchDelta http://jsonpatch.com/ (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> patchEnvironmentWithHttpInfo(String projectKey, String environmentKey, List<PatchDelta> patchDelta) throws ApiException {
        com.squareup.okhttp.Call call = patchEnvironmentValidateBeforeCall(projectKey, environmentKey, patchDelta, null, null);
        return apiClient.execute(call);
    }

    /**
     * Modify an environment by ID (asynchronously)
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentKey The environment key (required)
     * @param patchDelta http://jsonpatch.com/ (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call patchEnvironmentAsync(String projectKey, String environmentKey, List<PatchDelta> patchDelta, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = patchEnvironmentValidateBeforeCall(projectKey, environmentKey, patchDelta, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postEnvironment
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentBody New environment (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postEnvironmentCall(String projectKey, EnvironmentBody environmentBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = environmentBody;
        
        // create path and map variables
        String localVarPath = "/environments/{projectKey}"
            .replaceAll("\\{" + "projectKey" + "\\}", apiClient.escapeString(projectKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
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

        String[] localVarAuthNames = new String[] { "Token" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postEnvironmentValidateBeforeCall(String projectKey, EnvironmentBody environmentBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectKey' is set
        if (projectKey == null) {
            throw new ApiException("Missing the required parameter 'projectKey' when calling postEnvironment(Async)");
        }
        
        // verify the required parameter 'environmentBody' is set
        if (environmentBody == null) {
            throw new ApiException("Missing the required parameter 'environmentBody' when calling postEnvironment(Async)");
        }
        
        
        com.squareup.okhttp.Call call = postEnvironmentCall(projectKey, environmentBody, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a new environment in a specified project with a given name, key, and swatch color.
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentBody New environment (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postEnvironment(String projectKey, EnvironmentBody environmentBody) throws ApiException {
        postEnvironmentWithHttpInfo(projectKey, environmentBody);
    }

    /**
     * Create a new environment in a specified project with a given name, key, and swatch color.
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentBody New environment (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postEnvironmentWithHttpInfo(String projectKey, EnvironmentBody environmentBody) throws ApiException {
        com.squareup.okhttp.Call call = postEnvironmentValidateBeforeCall(projectKey, environmentBody, null, null);
        return apiClient.execute(call);
    }

    /**
     * Create a new environment in a specified project with a given name, key, and swatch color. (asynchronously)
     * 
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param environmentBody New environment (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postEnvironmentAsync(String projectKey, EnvironmentBody environmentBody, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postEnvironmentValidateBeforeCall(projectKey, environmentBody, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
