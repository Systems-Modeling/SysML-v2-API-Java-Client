# ProjectApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProject**](ProjectApi.md#createProject) | **POST** /projects | Add a new project
[**getProject**](ProjectApi.md#getProject) | **GET** /projects/{identifier} | Get project by its ID
[**getProjects**](ProjectApi.md#getProjects) | **GET** /projects | Get all projects


<a name="createProject"></a>
# **createProject**
> Project createProject(project)

Add a new project

### Example
```java
// Import classes:
//import org.omg.sysml.ApiException;
//import org.omg.sysml.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
Project project = new Project(); // Project | 
try {
    Project result = apiInstance.createProject(project);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#createProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project** | [**Project**](Project.md)|  | [optional]

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProject"></a>
# **getProject**
> Project getProject(identifier)

Get project by its ID

### Example
```java
// Import classes:
//import org.omg.sysml.ApiException;
//import org.omg.sysml.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String identifier = "identifier_example"; // String | ID of the project
try {
    Project result = apiInstance.getProject(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| ID of the project |

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProjects"></a>
# **getProjects**
> List&lt;Project&gt; getProjects()

Get all projects

### Example
```java
// Import classes:
//import org.omg.sysml.ApiException;
//import org.omg.sysml.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
try {
    List<Project> result = apiInstance.getProjects();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getProjects");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Project&gt;**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

