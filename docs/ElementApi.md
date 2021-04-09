# ElementApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getElementByProjectCommitId**](ElementApi.md#getElementByProjectCommitId) | **GET** /projects/{projectId}/commits/{commitId}/elements/{elementId} | Get element by project, commit and ID
[**getElementsByProjectCommit**](ElementApi.md#getElementsByProjectCommit) | **GET** /projects/{projectId}/commits/{commitId}/elements | Get elements by project and commit
[**getRootsByProjectCommit**](ElementApi.md#getRootsByProjectCommit) | **GET** /projects/{projectId}/commits/{commitId}/roots | Get root elements by project and commit


<a name="getElementByProjectCommitId"></a>
# **getElementByProjectCommitId**
> Element getElementByProjectCommitId(projectId, commitId, elementId)

Get element by project, commit and ID

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.ElementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ElementApi apiInstance = new ElementApi(defaultClient);
    UUID projectId = new UUID(); // UUID | ID of the project
    UUID commitId = new UUID(); // UUID | ID of the commit
    UUID elementId = new UUID(); // UUID | ID of the element
    try {
      Element result = apiInstance.getElementByProjectCommitId(projectId, commitId, elementId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElementApi#getElementByProjectCommitId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**UUID**](.md)| ID of the project |
 **commitId** | [**UUID**](.md)| ID of the commit |
 **elementId** | [**UUID**](.md)| ID of the element |

### Return type

[**Element**](Element.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/ld+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**404** | Not found. |  -  |
**415** | The requested content type is not acceptable. |  -  |
**500** | Internal server error. |  -  |
**0** | Unexpected response. |  -  |

<a name="getElementsByProjectCommit"></a>
# **getElementsByProjectCommit**
> List&lt;Element&gt; getElementsByProjectCommit(projectId, commitId, pageAfter, pageBefore, pageSize)

Get elements by project and commit

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.ElementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ElementApi apiInstance = new ElementApi(defaultClient);
    UUID projectId = new UUID(); // UUID | ID of the project
    UUID commitId = new UUID(); // UUID | ID of the commit
    String pageAfter = "pageAfter_example"; // String | Page after
    String pageBefore = "pageBefore_example"; // String | Page before
    Integer pageSize = 56; // Integer | Page size
    try {
      List<Element> result = apiInstance.getElementsByProjectCommit(projectId, commitId, pageAfter, pageBefore, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElementApi#getElementsByProjectCommit");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**UUID**](.md)| ID of the project |
 **commitId** | [**UUID**](.md)| ID of the commit |
 **pageAfter** | **String**| Page after | [optional]
 **pageBefore** | **String**| Page before | [optional]
 **pageSize** | **Integer**| Page size | [optional]

### Return type

[**List&lt;Element&gt;**](Element.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/ld+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**404** | Not found. |  -  |
**415** | The requested content type is not acceptable. |  -  |
**500** | Internal server error. |  -  |
**0** | Unexpected response. |  -  |

<a name="getRootsByProjectCommit"></a>
# **getRootsByProjectCommit**
> List&lt;Element&gt; getRootsByProjectCommit(projectId, commitId, pageAfter, pageBefore, pageSize)

Get root elements by project and commit

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.ElementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ElementApi apiInstance = new ElementApi(defaultClient);
    UUID projectId = new UUID(); // UUID | ID of the project
    UUID commitId = new UUID(); // UUID | ID of the commit
    String pageAfter = "pageAfter_example"; // String | Page after
    String pageBefore = "pageBefore_example"; // String | Page before
    Integer pageSize = 56; // Integer | Page size
    try {
      List<Element> result = apiInstance.getRootsByProjectCommit(projectId, commitId, pageAfter, pageBefore, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElementApi#getRootsByProjectCommit");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**UUID**](.md)| ID of the project |
 **commitId** | [**UUID**](.md)| ID of the commit |
 **pageAfter** | **String**| Page after | [optional]
 **pageBefore** | **String**| Page before | [optional]
 **pageSize** | **Integer**| Page size | [optional]

### Return type

[**List&lt;Element&gt;**](Element.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/ld+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**404** | Not found. |  -  |
**415** | The requested content type is not acceptable. |  -  |
**500** | Internal server error. |  -  |
**0** | Unexpected response. |  -  |

