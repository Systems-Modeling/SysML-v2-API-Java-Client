# ElementApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createElement**](ElementApi.md#createElement) | **POST** /element | Add a new element
[**getElement**](ElementApi.md#getElement) | **GET** /element/{id} | Get element by its ID
[**getElements**](ElementApi.md#getElements) | **GET** /element | Get all elements
[**getElementsInModel**](ElementApi.md#getElementsInModel) | **GET** /element/model/{model_id} | Get all elements in the model


<a name="createElement"></a>
# **createElement**
> Element createElement(element)

Add a new element

### Example
```java
// Import classes:
//import org.omg.sysml.ApiException;
//import org.omg.sysml.api.ElementApi;


ElementApi apiInstance = new ElementApi();
Element element = new Element(); // Element | 
try {
    Element result = apiInstance.createElement(element);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElementApi#createElement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **element** | [**Element**](Element.md)|  |

### Return type

[**Element**](Element.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getElement"></a>
# **getElement**
> Element getElement(id)

Get element by its ID

### Example
```java
// Import classes:
//import org.omg.sysml.ApiException;
//import org.omg.sysml.api.ElementApi;


ElementApi apiInstance = new ElementApi();
String id = "id_example"; // String | ID of the element
try {
    Element result = apiInstance.getElement(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElementApi#getElement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the element |

### Return type

[**Element**](Element.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getElements"></a>
# **getElements**
> List&lt;Element&gt; getElements()

Get all elements

### Example
```java
// Import classes:
//import org.omg.sysml.ApiException;
//import org.omg.sysml.api.ElementApi;


ElementApi apiInstance = new ElementApi();
try {
    List<Element> result = apiInstance.getElements();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElementApi#getElements");
    e.printStackTrace();
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

<a name="getElementsInModel"></a>
# **getElementsInModel**
> Element getElementsInModel(modelId)

Get all elements in the model

### Example
```java
// Import classes:
//import org.omg.sysml.ApiException;
//import org.omg.sysml.api.ElementApi;


ElementApi apiInstance = new ElementApi();
String modelId = "modelId_example"; // String | ID of the model
try {
    Element result = apiInstance.getElementsInModel(modelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElementApi#getElementsInModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **String**| ID of the model |

### Return type

[**Element**](Element.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

