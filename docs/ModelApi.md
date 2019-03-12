# ModelApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createModel**](ModelApi.md#createModel) | **POST** /model | Add a new model
[**getModel**](ModelApi.md#getModel) | **GET** /model/{id} | Get model by its ID
[**getModels**](ModelApi.md#getModels) | **GET** /model | Get all models


<a name="createModel"></a>
# **createModel**
> Model createModel(model)

Add a new model

### Example
```java
// Import classes:
//import org.omg.sysml.ApiException;
//import org.omg.sysml.api.ModelApi;


ModelApi apiInstance = new ModelApi();
Model model = new Model(); // Model | 
try {
    Model result = apiInstance.createModel(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#createModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**Model**](Model.md)|  | [optional]

### Return type

[**Model**](Model.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getModel"></a>
# **getModel**
> Model getModel(id)

Get model by its ID

### Example
```java
// Import classes:
//import org.omg.sysml.ApiException;
//import org.omg.sysml.api.ModelApi;


ModelApi apiInstance = new ModelApi();
String id = "id_example"; // String | ID of the model
try {
    Model result = apiInstance.getModel(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#getModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the model |

### Return type

[**Model**](Model.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getModels"></a>
# **getModels**
> List&lt;Model&gt; getModels()

Get all models

### Example
```java
// Import classes:
//import org.omg.sysml.ApiException;
//import org.omg.sysml.api.ModelApi;


ModelApi apiInstance = new ModelApi();
try {
    List<Model> result = apiInstance.getModels();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#getModels");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Model&gt;**](Model.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

