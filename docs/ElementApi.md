# ElementApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createElement**](ElementApi.md#createElement) | **POST** /elements | Add a new element
[**getElement**](ElementApi.md#getElement) | **GET** /elements/{identifier} | Get element by its ID
[**getElementByProjectAndId**](ElementApi.md#getElementByProjectAndId) | **GET** /projects/{project_identifier}/elements/{element_identifier} | Get element by project ID and its ID
[**getElements**](ElementApi.md#getElements) | **GET** /elements | Get all elements
[**getElementsInProject**](ElementApi.md#getElementsInProject) | **GET** /projects/{project_identifier}/elements | Get all elements in the project


<a name="createElement"></a>
# **createElement**
> Element createElement(body)

Add a new element

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
    Map<String, Object> body = null; // Map<String, Object> | 
    try {
      Element result = apiInstance.createElement(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElementApi#createElement");
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
 **body** | [**Map&lt;String, Object&gt;**](Object.md)|  |

### Return type

[**Element**](Element.md)

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

<a name="getElement"></a>
# **getElement**
> Element getElement(identifier)

Get element by its ID

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
    String identifier = "identifier_example"; // String | ID of the element
    try {
      Element result = apiInstance.getElement(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElementApi#getElement");
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
 **identifier** | **String**| ID of the element |

### Return type

[**Element**](Element.md)

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

<a name="getElementByProjectAndId"></a>
# **getElementByProjectAndId**
> Element getElementByProjectAndId(projectIdentifier, elementIdentifier)

Get element by project ID and its ID

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
    String projectIdentifier = "projectIdentifier_example"; // String | ID of the project
    String elementIdentifier = "elementIdentifier_example"; // String | ID of the element
    try {
      Element result = apiInstance.getElementByProjectAndId(projectIdentifier, elementIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElementApi#getElementByProjectAndId");
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
 **elementIdentifier** | **String**| ID of the element |

### Return type

[**Element**](Element.md)

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

<a name="getElements"></a>
# **getElements**
> List&lt;Element&gt; getElements()

Get all elements

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
    try {
      List<Element> result = apiInstance.getElements();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElementApi#getElements");
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

[**List&lt;Element&gt;**](Element.md)

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

<a name="getElementsInProject"></a>
# **getElementsInProject**
> Element getElementsInProject(projectIdentifier)

Get all elements in the project

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
    String projectIdentifier = "projectIdentifier_example"; // String | ID of the project
    try {
      Element result = apiInstance.getElementsInProject(projectIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElementApi#getElementsInProject");
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

[**Element**](Element.md)

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

