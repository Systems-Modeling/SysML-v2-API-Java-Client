# TagApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTagByProjectAndId**](TagApi.md#deleteTagByProjectAndId) | **DELETE** /projects/{projectId}/tags/{tagId} | Delete tag by project and ID
[**getTagByProjectAndId**](TagApi.md#getTagByProjectAndId) | **GET** /projects/{projectId}/tags/{tagId} | Get tag by project and ID
[**getTagsByProject**](TagApi.md#getTagsByProject) | **GET** /projects/{projectId}/tags | Get tags by project
[**postTagByProject**](TagApi.md#postTagByProject) | **POST** /projects/{projectId}/tags | Create tag by project


<a name="deleteTagByProjectAndId"></a>
# **deleteTagByProjectAndId**
> Tag deleteTagByProjectAndId(projectId, tagId)

Delete tag by project and ID

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.TagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TagApi apiInstance = new TagApi(defaultClient);
    UUID projectId = new UUID(); // UUID | ID of the project
    UUID tagId = new UUID(); // UUID | ID of the tag
    try {
      Tag result = apiInstance.deleteTagByProjectAndId(projectId, tagId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#deleteTagByProjectAndId");
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
 **tagId** | [**UUID**](.md)| ID of the tag |

### Return type

[**Tag**](Tag.md)

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

<a name="getTagByProjectAndId"></a>
# **getTagByProjectAndId**
> Tag getTagByProjectAndId(projectId, tagId)

Get tag by project and ID

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.TagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TagApi apiInstance = new TagApi(defaultClient);
    UUID projectId = new UUID(); // UUID | ID of the project
    UUID tagId = new UUID(); // UUID | ID of the tag
    try {
      Tag result = apiInstance.getTagByProjectAndId(projectId, tagId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#getTagByProjectAndId");
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
 **tagId** | [**UUID**](.md)| ID of the tag |

### Return type

[**Tag**](Tag.md)

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

<a name="getTagsByProject"></a>
# **getTagsByProject**
> List&lt;Tag&gt; getTagsByProject(projectId, pageAfter, pageBefore, pageSize)

Get tags by project

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.TagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TagApi apiInstance = new TagApi(defaultClient);
    UUID projectId = new UUID(); // UUID | ID of the project
    String pageAfter = "pageAfter_example"; // String | Page after
    String pageBefore = "pageBefore_example"; // String | Page before
    Integer pageSize = 56; // Integer | Page size
    try {
      List<Tag> result = apiInstance.getTagsByProject(projectId, pageAfter, pageBefore, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#getTagsByProject");
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

[**List&lt;Tag&gt;**](Tag.md)

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

<a name="postTagByProject"></a>
# **postTagByProject**
> Branch postTagByProject(projectId, body)

Create tag by project

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.TagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TagApi apiInstance = new TagApi(defaultClient);
    UUID projectId = new UUID(); // UUID | ID of the project
    Tag body = new Tag(); // Tag | 
    try {
      Branch result = apiInstance.postTagByProject(projectId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#postTagByProject");
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
 **body** | [**Tag**](Tag.md)|  |

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

