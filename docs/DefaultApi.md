# DefaultApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPassword**](DefaultApi.md#getPassword) | **GET** /get_password | Retrieves password information |


<a id="getPassword"></a>
# **getPassword**
> GetPassword200Response getPassword(accountId, accountName, accountTitle, accountType, accountCategory, ticketId, reason)

Retrieves password information

### Example
```java
// Import classes:
import com.securden.client.ApiClient;
import com.securden.client.ApiException;
import com.securden.client.Configuration;
import com.securden.client.models.*;
import com.securden.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long accountId = 56L; // Long | 
    String accountName = "accountName_example"; // String | 
    String accountTitle = "accountTitle_example"; // String | 
    String accountType = "accountType_example"; // String | 
    int accountCategory = "accountCategory_example"; //int
    String ticketId = "1244L"; // String |
    String reason = "for testing"; //String |

    try {
      GetPassword200Response result = apiInstance.getPassword(accountId, accountName, accountTitle, accountType, accountCategory, ticketId, reason);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getPassword");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | [**Long**](.md)|  | [optional] |
| **accountName** | **String**|  | [optional] |
| **accountTitle** | **String**|  | [optional] |
| **accountType** | **String**|  | [optional] |
| **accountCategory** | **int**| |[optional] |

### Return type

[**GetPassword200Response**](GetPassword200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |

