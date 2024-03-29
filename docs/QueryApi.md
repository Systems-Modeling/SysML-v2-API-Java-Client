# QueryApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteQueryByProjectAndId**](QueryApi.md#deleteQueryByProjectAndId) | **DELETE** /projects/{projectId}/queries/{queryId} | Delete query by project and ID
[**getQueriesByProject**](QueryApi.md#getQueriesByProject) | **GET** /projects/{projectId}/queries | Get queries by project
[**getQueryByProjectAndId**](QueryApi.md#getQueryByProjectAndId) | **GET** /projects/{projectId}/queries/{queryId} | Get query by project and ID
[**getQueryResultsByProjectIdQuery**](QueryApi.md#getQueryResultsByProjectIdQuery) | **GET** /projects/{projectId}/query-results | Get query results by project and query definition
[**getQueryResultsByProjectIdQueryId**](QueryApi.md#getQueryResultsByProjectIdQueryId) | **GET** /projects/{projectId}/queries/{queryId}/results | Get query results by project and query
[**getQueryResultsByProjectIdQueryPost**](QueryApi.md#getQueryResultsByProjectIdQueryPost) | **POST** /projects/{projectId}/query-results | Get query results by project and query definition via POST
[**postQueryByProject**](QueryApi.md#postQueryByProject) | **POST** /projects/{projectId}/queries | Create query by project


<a name="deleteQueryByProjectAndId"></a>
# **deleteQueryByProjectAndId**
> Query deleteQueryByProjectAndId(projectId, queryId)

Delete query by project and ID

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.QueryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QueryApi apiInstance = new QueryApi(defaultClient);
    UUID projectId = new UUID(); // UUID | ID of the project
    UUID queryId = new UUID(); // UUID | ID of the query
    try {
      Query result = apiInstance.deleteQueryByProjectAndId(projectId, queryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryApi#deleteQueryByProjectAndId");
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
 **queryId** | [**UUID**](.md)| ID of the query |

### Return type

[**Query**](Query.md)

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

<a name="getQueriesByProject"></a>
# **getQueriesByProject**
> List&lt;Query&gt; getQueriesByProject(projectId, pageAfter, pageBefore, pageSize)

Get queries by project

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.QueryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QueryApi apiInstance = new QueryApi(defaultClient);
    UUID projectId = new UUID(); // UUID | ID of the project
    String pageAfter = "pageAfter_example"; // String | Page after
    String pageBefore = "pageBefore_example"; // String | Page before
    Integer pageSize = 56; // Integer | Page size
    try {
      List<Query> result = apiInstance.getQueriesByProject(projectId, pageAfter, pageBefore, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryApi#getQueriesByProject");
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

[**List&lt;Query&gt;**](Query.md)

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

<a name="getQueryByProjectAndId"></a>
# **getQueryByProjectAndId**
> Query getQueryByProjectAndId(projectId, queryId)

Get query by project and ID

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.QueryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QueryApi apiInstance = new QueryApi(defaultClient);
    UUID projectId = new UUID(); // UUID | ID of the project
    UUID queryId = new UUID(); // UUID | ID of the query
    try {
      Query result = apiInstance.getQueryByProjectAndId(projectId, queryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryApi#getQueryByProjectAndId");
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
 **queryId** | [**UUID**](.md)| ID of the query |

### Return type

[**Query**](Query.md)

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

<a name="getQueryResultsByProjectIdQuery"></a>
# **getQueryResultsByProjectIdQuery**
> List&lt;Element&gt; getQueryResultsByProjectIdQuery(projectId, body, commitId)

Get query results by project and query definition

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.QueryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QueryApi apiInstance = new QueryApi(defaultClient);
    UUID projectId = new UUID(); // UUID | ID of the project
    Query body = new Query(); // Query | 
    UUID commitId = new UUID(); // UUID | ID of the commit - defaults to head of project
    try {
      List<Element> result = apiInstance.getQueryResultsByProjectIdQuery(projectId, body, commitId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryApi#getQueryResultsByProjectIdQuery");
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
 **body** | [**Query**](Query.md)|  |
 **commitId** | [**UUID**](.md)| ID of the commit - defaults to head of project | [optional]

### Return type

[**List&lt;Element&gt;**](Element.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/ld+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**404** | Not found. |  -  |
**415** | The requested content type is not acceptable. |  -  |
**500** | Internal server error. |  -  |
**0** | Unexpected response. |  -  |

<a name="getQueryResultsByProjectIdQueryId"></a>
# **getQueryResultsByProjectIdQueryId**
> List&lt;Element&gt; getQueryResultsByProjectIdQueryId(projectId, queryId, commitId)

Get query results by project and query

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.QueryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QueryApi apiInstance = new QueryApi(defaultClient);
    UUID projectId = new UUID(); // UUID | ID of the project
    UUID queryId = new UUID(); // UUID | ID of the query
    UUID commitId = new UUID(); // UUID | ID of the commit - defaults to head of project
    try {
      List<Element> result = apiInstance.getQueryResultsByProjectIdQueryId(projectId, queryId, commitId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryApi#getQueryResultsByProjectIdQueryId");
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
 **queryId** | [**UUID**](.md)| ID of the query |
 **commitId** | [**UUID**](.md)| ID of the commit - defaults to head of project | [optional]

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

<a name="getQueryResultsByProjectIdQueryPost"></a>
# **getQueryResultsByProjectIdQueryPost**
> List&lt;Element&gt; getQueryResultsByProjectIdQueryPost(projectId, body, commitId)

Get query results by project and query definition via POST

For compatibility with clients that don&#39;t support GET requests with a body

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.QueryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QueryApi apiInstance = new QueryApi(defaultClient);
    UUID projectId = new UUID(); // UUID | ID of the project
    Query body = new Query(); // Query | 
    UUID commitId = new UUID(); // UUID | ID of the commit - defaults to head of project
    try {
      List<Element> result = apiInstance.getQueryResultsByProjectIdQueryPost(projectId, body, commitId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryApi#getQueryResultsByProjectIdQueryPost");
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
 **body** | [**Query**](Query.md)|  |
 **commitId** | [**UUID**](.md)| ID of the commit - defaults to head of project | [optional]

### Return type

[**List&lt;Element&gt;**](Element.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/ld+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**404** | Not found. |  -  |
**415** | The requested content type is not acceptable. |  -  |
**500** | Internal server error. |  -  |
**0** | Unexpected response. |  -  |

<a name="postQueryByProject"></a>
# **postQueryByProject**
> Query postQueryByProject(projectId, body)

Create query by project

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.QueryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    QueryApi apiInstance = new QueryApi(defaultClient);
    UUID projectId = new UUID(); // UUID | ID of the project
    Query body = new Query(); // Query | 
    try {
      Query result = apiInstance.postQueryByProject(projectId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryApi#postQueryByProject");
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
 **body** | [**Query**](Query.md)|  |

### Return type

[**Query**](Query.md)

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

