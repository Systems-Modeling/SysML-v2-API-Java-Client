# BranchApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBranchesByProject**](BranchApi.md#getBranchesByProject) | **GET** /projects/{projectId}/branches | Get branches by project
[**getBranchesByProjectAndId**](BranchApi.md#getBranchesByProjectAndId) | **GET** /projects/{projectId}/branches/{branchId} | Get branch by project and ID
[**postBranchByProject**](BranchApi.md#postBranchByProject) | **POST** /projects/{projectId}/branches | Create branch by project


<a name="getBranchesByProject"></a>
# **getBranchesByProject**
> List&lt;Branch&gt; getBranchesByProject(projectId, pageAfter, pageBefore, pageSize)

Get branches by project

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.BranchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BranchApi apiInstance = new BranchApi(defaultClient);
    UUID projectId = new UUID(); // UUID | ID of the project
    String pageAfter = "pageAfter_example"; // String | Page after
    String pageBefore = "pageBefore_example"; // String | Page before
    Integer pageSize = 56; // Integer | Page size
    try {
      List<Branch> result = apiInstance.getBranchesByProject(projectId, pageAfter, pageBefore, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchApi#getBranchesByProject");
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
 **pageAfter** | **String**| Page after | [optional]
 **pageBefore** | **String**| Page before | [optional]
 **pageSize** | **Integer**| Page size | [optional]

### Return type

[**List&lt;Branch&gt;**](Branch.md)

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

<a name="getBranchesByProjectAndId"></a>
# **getBranchesByProjectAndId**
> Branch getBranchesByProjectAndId(projectId, branchId)

Get branch by project and ID

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.BranchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BranchApi apiInstance = new BranchApi(defaultClient);
    UUID projectId = new UUID(); // UUID | ID of the project
    UUID branchId = new UUID(); // UUID | ID of the branch
    try {
      Branch result = apiInstance.getBranchesByProjectAndId(projectId, branchId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchApi#getBranchesByProjectAndId");
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
 **branchId** | [**UUID**](.md)| ID of the branch |

### Return type

[**Branch**](Branch.md)

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

<a name="postBranchByProject"></a>
# **postBranchByProject**
> Branch postBranchByProject(projectId, body)

Create branch by project

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.BranchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BranchApi apiInstance = new BranchApi(defaultClient);
    UUID projectId = new UUID(); // UUID | ID of the project
    Branch body = new Branch(); // Branch | 
    try {
      Branch result = apiInstance.postBranchByProject(projectId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchApi#postBranchByProject");
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
 **body** | [**Branch**](Branch.md)|  |

### Return type

[**Branch**](Branch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/ld+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**415** | The requested content type is not acceptable. |  -  |
**500** | Internal server error. |  -  |
**0** | Unexpected response. |  -  |

