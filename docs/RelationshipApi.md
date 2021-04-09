# RelationshipApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRelationshipsByProjectCommitRelatedElement**](RelationshipApi.md#getRelationshipsByProjectCommitRelatedElement) | **GET** /projects/{projectId}/commits/{commitId}/elements/{relatedElementId}/relationships | Get relationships by project, commit, and related element


<a name="getRelationshipsByProjectCommitRelatedElement"></a>
# **getRelationshipsByProjectCommitRelatedElement**
> List&lt;Relationship&gt; getRelationshipsByProjectCommitRelatedElement(projectId, commitId, relatedElementId, direction, pageAfter, pageBefore, pageSize)

Get relationships by project, commit, and related element

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
    UUID projectId = new UUID(); // UUID | ID of the project
    UUID commitId = new UUID(); // UUID | ID of the commit
    UUID relatedElementId = new UUID(); // UUID | ID of the related element
    String direction = "both"; // String | Filter for relationships that are incoming (in), outgoing (out), or both relative to the related element
    String pageAfter = "pageAfter_example"; // String | Page after
    String pageBefore = "pageBefore_example"; // String | Page before
    Integer pageSize = 56; // Integer | Page size
    try {
      List<Relationship> result = apiInstance.getRelationshipsByProjectCommitRelatedElement(projectId, commitId, relatedElementId, direction, pageAfter, pageBefore, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationshipApi#getRelationshipsByProjectCommitRelatedElement");
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
 **commitId** | [**UUID**](.md)| ID of the commit |
 **relatedElementId** | [**UUID**](.md)| ID of the related element |
 **direction** | **String**| Filter for relationships that are incoming (in), outgoing (out), or both relative to the related element | [optional] [default to both] [enum: in, out, both]
 **pageAfter** | **String**| Page after | [optional]
 **pageBefore** | **String**| Page before | [optional]
 **pageSize** | **Integer**| Page size | [optional]

### Return type

[**List&lt;Relationship&gt;**](Relationship.md)

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

