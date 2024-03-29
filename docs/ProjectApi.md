# ProjectApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteProjectById**](ProjectApi.md#deleteProjectById) | **DELETE** /projects/{projectId} | Delete project by ID
[**getProjectById**](ProjectApi.md#getProjectById) | **GET** /projects/{projectId} | Get project by ID
[**getProjects**](ProjectApi.md#getProjects) | **GET** /projects | Get projects
[**postProject**](ProjectApi.md#postProject) | **POST** /projects | Create project
[**putProjectById**](ProjectApi.md#putProjectById) | **PUT** /projects/{projectId} | Update project by ID


<a name="deleteProjectById"></a>
# **deleteProjectById**
> Project deleteProjectById(projectId)

Delete project by ID

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.ProjectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProjectApi apiInstance = new ProjectApi(defaultClient);
    UUID projectId = new UUID(); // UUID | ID of the project
    try {
      Project result = apiInstance.deleteProjectById(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#deleteProjectById");
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

[**Project**](Project.md)

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

<a name="getProjectById"></a>
# **getProjectById**
> Project getProjectById(projectId)

Get project by ID

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.ProjectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProjectApi apiInstance = new ProjectApi(defaultClient);
    UUID projectId = new UUID(); // UUID | ID of the project
    try {
      Project result = apiInstance.getProjectById(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#getProjectById");
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

[**Project**](Project.md)

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

<a name="getProjects"></a>
# **getProjects**
> List&lt;Project&gt; getProjects(pageAfter, pageBefore, pageSize)

Get projects

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.ProjectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProjectApi apiInstance = new ProjectApi(defaultClient);
    String pageAfter = "pageAfter_example"; // String | Page after
    String pageBefore = "pageBefore_example"; // String | Page before
    Integer pageSize = 56; // Integer | Page size
    try {
      List<Project> result = apiInstance.getProjects(pageAfter, pageBefore, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#getProjects");
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
 **pageAfter** | **String**| Page after | [optional]
 **pageBefore** | **String**| Page before | [optional]
 **pageSize** | **Integer**| Page size | [optional]

### Return type

[**List&lt;Project&gt;**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/ld+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**415** | The requested content type is not acceptable. |  -  |
**500** | Internal server error. |  -  |
**0** | Unexpected response. |  -  |

<a name="postProject"></a>
# **postProject**
> Project postProject(body)

Create project

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.ProjectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProjectApi apiInstance = new ProjectApi(defaultClient);
    Project body = new Project(); // Project | 
    try {
      Project result = apiInstance.postProject(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#postProject");
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
 **body** | [**Project**](Project.md)|  | [optional]

### Return type

[**Project**](Project.md)

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

<a name="putProjectById"></a>
# **putProjectById**
> Project putProjectById(projectId, body)

Update project by ID

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.ProjectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ProjectApi apiInstance = new ProjectApi(defaultClient);
    UUID projectId = new UUID(); // UUID | ID of the project
    Project body = new Project(); // Project | 
    try {
      Project result = apiInstance.putProjectById(projectId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#putProjectById");
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
 **body** | [**Project**](Project.md)|  | [optional]

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/ld+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**415** | The requested content type is not acceptable. |  -  |
**500** | Internal server error. |  -  |
**0** | Unexpected response. |  -  |

