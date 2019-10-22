# RelationshipApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRelationship**](RelationshipApi.md#createRelationship) | **POST** /relationships | Add a new relationship
[**getRelationship**](RelationshipApi.md#getRelationship) | **GET** /relationships/{identifier} | Get relationship by its ID
[**getRelationships**](RelationshipApi.md#getRelationships) | **GET** /relationships | Get all relationships
[**getRelationshipsByProject**](RelationshipApi.md#getRelationshipsByProject) | **GET** /projects/{project_identifier}/relationships | Get all relationships in the project


<a name="createRelationship"></a>
# **createRelationship**
> Relationship createRelationship(body)

Add a new relationship

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.RelationshipApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RelationshipApi apiInstance = new RelationshipApi(defaultClient);
    Relationship body = new Relationship(); // Relationship | 
    try {
      Relationship result = apiInstance.createRelationship(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationshipApi#createRelationship");
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
 **body** | [**Relationship**](Relationship.md)|  |

### Return type

[**Relationship**](Relationship.md)

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

<a name="getRelationship"></a>
# **getRelationship**
> Relationship getRelationship(identifier)

Get relationship by its ID

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.RelationshipApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RelationshipApi apiInstance = new RelationshipApi(defaultClient);
    String identifier = "identifier_example"; // String | ID of the relationship
    try {
      Relationship result = apiInstance.getRelationship(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationshipApi#getRelationship");
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
 **identifier** | **String**| ID of the relationship |

### Return type

[**Relationship**](Relationship.md)

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

<a name="getRelationships"></a>
# **getRelationships**
> List&lt;Relationship&gt; getRelationships()

Get all relationships

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.RelationshipApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RelationshipApi apiInstance = new RelationshipApi(defaultClient);
    try {
      List<Relationship> result = apiInstance.getRelationships();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationshipApi#getRelationships");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Relationship&gt;**](Relationship.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**415** | The requested content type is not acceptable. |  -  |
**500** | Internal server error. |  -  |
**0** | Unexpected response. |  -  |

<a name="getRelationshipsByProject"></a>
# **getRelationshipsByProject**
> List&lt;Relationship&gt; getRelationshipsByProject(projectIdentifier)

Get all relationships in the project

### Example
```java
// Import classes:
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.Configuration;
import org.omg.sysml.models.*;
import org.omg.sysml.api.RelationshipApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RelationshipApi apiInstance = new RelationshipApi(defaultClient);
    String projectIdentifier = "projectIdentifier_example"; // String | ID of the project
    try {
      List<Relationship> result = apiInstance.getRelationshipsByProject(projectIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationshipApi#getRelationshipsByProject");
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
 **projectIdentifier** | **String**| ID of the project |

### Return type

[**List&lt;Relationship&gt;**](Relationship.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**415** | The requested content type is not acceptable. |  -  |
**500** | Internal server error. |  -  |
**0** | Unexpected response. |  -  |

