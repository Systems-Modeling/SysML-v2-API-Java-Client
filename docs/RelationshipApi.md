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
> Relationship getRelationship(identifier)

Get relationship by its ID

### Example
```java
// Import classes:
//import org.omg.sysml.ApiException;
//import org.omg.sysml.api.RelationshipApi;


RelationshipApi apiInstance = new RelationshipApi();
String identifier = "identifier_example"; // String | ID of the relationship
try {
    Relationship result = apiInstance.getRelationship(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationshipApi#getRelationship");
    e.printStackTrace();
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

<a name="getRelationshipsByProject"></a>
# **getRelationshipsByProject**
> List&lt;Relationship&gt; getRelationshipsByProject(projectIdentifier)

Get all relationships in the project

### Example
```java
// Import classes:
//import org.omg.sysml.ApiException;
//import org.omg.sysml.api.RelationshipApi;


RelationshipApi apiInstance = new RelationshipApi();
String projectIdentifier = "projectIdentifier_example"; // String | ID of the project
try {
    List<Relationship> result = apiInstance.getRelationshipsByProject(projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationshipApi#getRelationshipsByProject");
    e.printStackTrace();
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

