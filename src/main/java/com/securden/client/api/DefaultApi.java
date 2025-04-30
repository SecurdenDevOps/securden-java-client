
package com.securden.client.api;

import com.securden.client.ApiCallback;
import com.securden.client.ApiClient;
import com.securden.client.ApiException;
import com.securden.client.ApiResponse;
import com.securden.client.Configuration;
import com.securden.client.Pair;
import com.securden.client.ProgressRequestBody;
import com.securden.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.securden.client.model.GetPassword200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getPassword
     * @param accountId  (optional)
     * @param accountName  (optional)
     * @param accountTitle  (optional)
     * @param accountType  (optional)
     * @param accountCategory (optional)
     * @param ticketId  (optional)
     * @param reason  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPasswordGetCall(Long accountId, String accountName, String accountTitle, String accountType, int accountCategory, String ticketId, String reason, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/secretsmanagement/get_password_via_tools";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (accountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_id", accountId));
        }

        if (accountName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_name", accountName));
        }

        if (accountTitle != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_title", accountTitle));
        }

        if (accountType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_type", accountType));
        }

        if (accountCategory != 0) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_category", accountCategory));
        }

        if (ticketId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ticket_id", ticketId));
        }

        if (reason != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("reason", reason));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPasswordGetValidateBeforeCall(Long accountId, String accountName, String accountTitle, String accountType, int accountCategory, String ticketId, String reason, final ApiCallback _callback) throws ApiException {
        return getPasswordGetCall(accountId, accountName, accountTitle, accountType, accountCategory, ticketId, reason, _callback);

    }

    /**
     * Retrieves password information
     * 
     * @param accountId  (optional)
     * @param accountName  (optional)
     * @param accountTitle  (optional)
     * @param accountType  (optional)
     * @param accountCategory (optional)
     * @param ticketId  (optional)
     * @param reason  (optional)
     * @return GetPassword200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public GetPassword200Response getPassword(Long accountId, String accountName, String accountTitle, String accountType, int accountCategory, String reason, String ticketId) throws ApiException {
        ApiResponse<GetPassword200Response> localVarResp = getPasswordGetWithHttpInfo(accountId, accountName, accountTitle, accountType, accountCategory, ticketId, reason);
        return localVarResp.getData();
    }

    /**
     * Retrieves password information
     * 
     * @param accountId  (optional)
     * @param accountName  (optional)
     * @param accountTitle  (optional)
     * @param accountType  (optional)
     * @param accountCategory (optional)
     * @param ticketId  (optional)
     * @param reason  (optional)
     * @return ApiResponse&lt;GetPassword200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetPassword200Response> getPasswordGetWithHttpInfo(Long accountId, String accountName, String accountTitle, String accountType, int accountCategory, String ticketId, String reason) throws ApiException {
        okhttp3.Call localVarCall = getPasswordGetValidateBeforeCall(accountId, accountName, accountTitle, accountType, accountCategory, ticketId, reason, null);
        Type localVarReturnType = new TypeToken<GetPassword200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieves password information (asynchronously)
     * 
     * @param accountId  (optional)
     * @param accountName  (optional)
     * @param accountTitle  (optional)
     * @param accountType  (optional)
     * @param accountCategory (optional)
     * @param ticketId  (optional)
     * @param reason  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPasswordGetAsync(Long accountId, String accountName, String accountTitle, String accountType, int accountCategory, String ticketId, String reason, final ApiCallback<GetPassword200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPasswordGetValidateBeforeCall(accountId, accountName, accountTitle, accountType, accountCategory, ticketId, reason, _callback);
        Type localVarReturnType = new TypeToken<GetPassword200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
