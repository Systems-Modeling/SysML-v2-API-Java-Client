# CommitApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCommitByProjectAndId**](CommitApi.md#getCommitByProjectAndId) | **GET** /projects/{projectId}/commits/{commitId} | Get commit by project and ID
[**getCommitsByProject**](CommitApi.md#getCommitsByProject) | **GET** /projects/{projectId}/commits | Get commits by project
[**getHeadCommitByProject**](CommitApi.md#getHeadCommitByProject) | **GET** /projects/{projectId}/head | Get head commit by project
[**postCommitByProject**](CommitApi.md#postCommitByProject) | **POST** /projects/{projectId}/commits | Create commit by project


<a name="getCommitByProjectAndId"></a>
# **getCommitByProjectAndId**
> Commit getCommitByProjectAndId(projectId, commitId)

Get commit by project and ID

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.CommitApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CommitApi apiInstance = new CommitApi(defaultClient);
    String projectId = "projectId_example"; // String | ID of the project
    String commitId = "commitId_example"; // String | ID of the commit
    try {
      Commit result = apiInstance.getCommitByProjectAndId(projectId, commitId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommitApi#getCommitByProjectAndId");
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
 **projectId** | **String**| ID of the project |
 **commitId** | **String**| ID of the commit |

### Return type

[**Commit**](Commit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**404** | Not found. |  -  |
**415** | The requested content type is not acceptable. |  -  |
**500** | Internal server error. |  -  |
**0** | Unexpected response. |  -  |

<a name="getCommitsByProject"></a>
# **getCommitsByProject**
> Commit getCommitsByProject(projectId)

Get commits by project

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.CommitApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CommitApi apiInstance = new CommitApi(defaultClient);
    UUID projectId = new UUID(); // UUID | ID of the project
    try {
      Commit result = apiInstance.getCommitsByProject(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommitApi#getCommitsByProject");
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

### Return type

[**Commit**](Commit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**404** | Not found. |  -  |
**415** | The requested content type is not acceptable. |  -  |
**500** | Internal server error. |  -  |
**0** | Unexpected response. |  -  |

<a name="getHeadCommitByProject"></a>
# **getHeadCommitByProject**
> Commit getHeadCommitByProject(projectId)

Get head commit by project

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.CommitApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CommitApi apiInstance = new CommitApi(defaultClient);
    String projectId = "projectId_example"; // String | ID of the project
    try {
      Commit result = apiInstance.getHeadCommitByProject(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommitApi#getHeadCommitByProject");
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
 **projectId** | **String**| ID of the project |

### Return type

[**Commit**](Commit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**404** | Not found. |  -  |
**415** | The requested content type is not acceptable. |  -  |
**500** | Internal server error. |  -  |
**0** | Unexpected response. |  -  |

<a name="postCommitByProject"></a>
# **postCommitByProject**
> Commit postCommitByProject(projectId, body)

Create commit by project

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.CommitApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CommitApi apiInstance = new CommitApi(defaultClient);
    UUID projectId = new UUID(); // UUID | ID of the project
    Commit body = new Commit(); // Commit | 
    try {
      Commit result = apiInstance.postCommitByProject(projectId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommitApi#postCommitByProject");
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
 **body** | [**Commit**](Commit.md)|  |

### Return type

[**Commit**](Commit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**415** | The requested content type is not acceptable. |  -  |
**500** | Internal server error. |  -  |
**0** | Unexpected response. |  -  |

