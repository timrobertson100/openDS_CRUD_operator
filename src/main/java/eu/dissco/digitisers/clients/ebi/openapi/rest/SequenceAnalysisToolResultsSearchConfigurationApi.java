/*
 * The EBI Search: RESTful Web services
 * This is an API documentation for [EBI Search](https://www.ebi.ac.uk/ebisearch) RESTful Web services.
 *
 * The version of the OpenAPI document: all
 * Contact: www-prod@ebi.ac.uk
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package eu.dissco.digitisers.clients.ebi.openapi.rest;

import eu.dissco.digitisers.clients.ebi.openapi.ApiCallback;
import eu.dissco.digitisers.clients.ebi.openapi.ApiClient;
import eu.dissco.digitisers.clients.ebi.openapi.ApiException;
import eu.dissco.digitisers.clients.ebi.openapi.ApiResponse;
import eu.dissco.digitisers.clients.ebi.openapi.Configuration;
import eu.dissco.digitisers.clients.ebi.openapi.Pair;
import eu.dissco.digitisers.clients.ebi.openapi.ProgressRequestBody;
import eu.dissco.digitisers.clients.ebi.openapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import eu.dissco.digitisers.clients.ebi.openapi.model.WSError;
import eu.dissco.digitisers.clients.ebi.openapi.model.WSSeqToolsHelp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SequenceAnalysisToolResultsSearchConfigurationApi {
    private ApiClient localVarApiClient;

    public SequenceAnalysisToolResultsSearchConfigurationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SequenceAnalysisToolResultsSearchConfigurationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for sequencingToolResultsSearchHelp1
     * @param domain  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Invalid parameters </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> A list of configured tools </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sequencingToolResultsSearchHelp1Call(String domain, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{domain}/seqtoolresults/help"
            .replaceAll("\\{" + "domain" + "\\}", localVarApiClient.escapeString(domain.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/xml", "application/json", "text/csv", "text/tab-separated-values"
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
    private okhttp3.Call sequencingToolResultsSearchHelp1ValidateBeforeCall(String domain, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new ApiException("Missing the required parameter 'domain' when calling sequencingToolResultsSearchHelp1(Async)");
        }
        

        okhttp3.Call localVarCall = sequencingToolResultsSearchHelp1Call(domain, _callback);
        return localVarCall;

    }

    /**
     * Sequencing tool results search configuration
     * It returns information about Sequencing Tool configured in the system and available to be used
     * @param domain  (required)
     * @return WSSeqToolsHelp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Invalid parameters </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> A list of configured tools </td><td>  -  </td></tr>
     </table>
     */
    public WSSeqToolsHelp sequencingToolResultsSearchHelp1(String domain) throws ApiException {
        ApiResponse<WSSeqToolsHelp> localVarResp = sequencingToolResultsSearchHelp1WithHttpInfo(domain);
        return localVarResp.getData();
    }

    /**
     * Sequencing tool results search configuration
     * It returns information about Sequencing Tool configured in the system and available to be used
     * @param domain  (required)
     * @return ApiResponse&lt;WSSeqToolsHelp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Invalid parameters </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> A list of configured tools </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WSSeqToolsHelp> sequencingToolResultsSearchHelp1WithHttpInfo(String domain) throws ApiException {
        okhttp3.Call localVarCall = sequencingToolResultsSearchHelp1ValidateBeforeCall(domain, null);
        Type localVarReturnType = new TypeToken<WSSeqToolsHelp>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Sequencing tool results search configuration (asynchronously)
     * It returns information about Sequencing Tool configured in the system and available to be used
     * @param domain  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Invalid parameters </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> A list of configured tools </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sequencingToolResultsSearchHelp1Async(String domain, final ApiCallback<WSSeqToolsHelp> _callback) throws ApiException {

        okhttp3.Call localVarCall = sequencingToolResultsSearchHelp1ValidateBeforeCall(domain, _callback);
        Type localVarReturnType = new TypeToken<WSSeqToolsHelp>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
