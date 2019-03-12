# RelationshipApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRelationship**](RelationshipApi.md#createRelationship) | **POST** /relationship | Add a new relationship
[**getRelationship**](RelationshipApi.md#getRelationship) | **GET** /relationship/{id} | Get relationship by its ID
[**getRelationships**](RelationshipApi.md#getRelationships) | **GET** /relationship | Get all relationships
[**getRelationshipsByElement**](RelationshipApi.md#getRelationshipsByElement) | **GET** /relationship/element/{element_id} | Get all relationships with the given element as either source or target
[**getRelationshipsBySource**](RelationshipApi.md#getRelationshipsBySource) | **GET** /relationship/source/{source_id} | Get all relationships with the given element as the source
[**getRelationshipsByTarget**](RelationshipApi.md#getRelationshipsByTarget) | **GET** /relationship/target/{target_id} | Get all relationships with the given element as the target


<a name="createRelationship"></a>
# **createRelationship**
> Relationship createRelationship(relationship)

Add a new relationship

### Example
```java
// Import classes:
//import org.omg.sysml.ApiException;
//import org.omg.sysml.api.RelationshipApi;


RelationshipApi apiInstance = new RelationshipApi();
Relationship relationship = new Relationship(); // Relationship | 
try {
    Relationship result = apiInstance.createRelationship(relationship);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationshipApi#createRelationship");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relationship** | [**Relationship**](Relationship.md)|  |

### Return type

[**Relationship**](Relationship.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRelationship"></a>
# **getRelationship**
> Relationship getRelationship(id)

Get relationship by its ID

### Example
```java
// Import classes:
//import org.omg.sysml.ApiException;
//import org.omg.sysml.api.RelationshipApi;


RelationshipApi apiInstance = new RelationshipApi();
String id = "id_example"; // String | ID of the relationship
try {
    Relationship result = apiInstance.getRelationship(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationshipApi#getRelationship");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the relationship |

### Return type

[**Relationship**](Relationship.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRelationships"></a>
# **getRelationships**
> List&lt;Relationship&gt; getRelationships()

Get all relationships

### Example
```java
// Import classes:
//import org.omg.sysml.ApiException;
//import org.omg.sysml.api.RelationshipApi;


RelationshipApi apiInstance = new RelationshipApi();
try {
    List<Relationship> result = apiInstance.getRelationships();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationshipApi#getRelationships");
    e.printStackTrace();
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

<a name="getRelationshipsByElement"></a>
# **getRelationshipsByElement**
> List&lt;Relationship&gt; getRelationshipsByElement(elementId)

Get all relationships with the given element as either source or target

### Example
```java
// Import classes:
//import org.omg.sysml.ApiException;
//import org.omg.sysml.api.RelationshipApi;


RelationshipApi apiInstance = new RelationshipApi();
String elementId = "elementId_example"; // String | ID of the element that is the source or target of relationships
try {
    List<Relationship> result = apiInstance.getRelationshipsByElement(elementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationshipApi#getRelationshipsByElement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **elementId** | **String**| ID of the element that is the source or target of relationships |

### Return type

[**List&lt;Relationship&gt;**](Relationship.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRelationshipsBySource"></a>
# **getRelationshipsBySource**
> List&lt;Relationship&gt; getRelationshipsBySource(sourceId)

Get all relationships with the given element as the source

### Example
```java
// Import classes:
//import org.omg.sysml.ApiException;
//import org.omg.sysml.api.RelationshipApi;


RelationshipApi apiInstance = new RelationshipApi();
String sourceId = "sourceId_example"; // String | ID of the element that is the source of relationships
try {
    List<Relationship> result = apiInstance.getRelationshipsBySource(sourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationshipApi#getRelationshipsBySource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourceId** | **String**| ID of the element that is the source of relationships |

### Return type

[**List&lt;Relationship&gt;**](Relationship.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRelationshipsByTarget"></a>
# **getRelationshipsByTarget**
> List&lt;Relationship&gt; getRelationshipsByTarget(targetId)

Get all relationships with the given element as the target

### Example
```java
// Import classes:
//import org.omg.sysml.ApiException;
//import org.omg.sysml.api.RelationshipApi;


RelationshipApi apiInstance = new RelationshipApi();
String targetId = "targetId_example"; // String | ID of the element that is the target of relationships
try {
    List<Relationship> result = apiInstance.getRelationshipsByTarget(targetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationshipApi#getRelationshipsByTarget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetId** | **String**| ID of the element that is the target of relationships |

### Return type

[**List&lt;Relationship&gt;**](Relationship.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

