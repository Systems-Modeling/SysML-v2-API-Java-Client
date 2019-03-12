# sysml-api-client

SysML v2 API and Services
- API version: 1.0.0

REST/HTTP binding (PSM) for the SysML v2 standard API.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.omg.sysml</groupId>
  <artifactId>sysml-api-client</artifactId>
  <version>0.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.omg.sysml:sysml-api-client:0.1.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/sysml-api-client-0.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.omg.sysml.*;
import org.omg.sysml.auth.*;
import org.omg.sysml.model.*;
import org.omg.sysml.api.ElementApi;

import java.io.File;
import java.util.*;

public class ElementApiExample {

    public static void main(String[] args) {
        
        ElementApi apiInstance = new ElementApi();
        Element element = new Element(); // Element | 
        try {
            Element result = apiInstance.createElement(element);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ElementApi#createElement");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ElementApi* | [**createElement**](docs/ElementApi.md#createElement) | **POST** /element | Add a new element
*ElementApi* | [**getElement**](docs/ElementApi.md#getElement) | **GET** /element/{id} | Get element by its ID
*ElementApi* | [**getElements**](docs/ElementApi.md#getElements) | **GET** /element | Get all elements
*ElementApi* | [**getElementsInModel**](docs/ElementApi.md#getElementsInModel) | **GET** /element/model/{model_id} | Get all elements in the model
*ModelApi* | [**createModel**](docs/ModelApi.md#createModel) | **POST** /model | Add a new model
*ModelApi* | [**getModel**](docs/ModelApi.md#getModel) | **GET** /model/{id} | Get model by its ID
*ModelApi* | [**getModels**](docs/ModelApi.md#getModels) | **GET** /model | Get all models
*RelationshipApi* | [**createRelationship**](docs/RelationshipApi.md#createRelationship) | **POST** /relationship | Add a new relationship
*RelationshipApi* | [**getRelationship**](docs/RelationshipApi.md#getRelationship) | **GET** /relationship/{id} | Get relationship by its ID
*RelationshipApi* | [**getRelationships**](docs/RelationshipApi.md#getRelationships) | **GET** /relationship | Get all relationships
*RelationshipApi* | [**getRelationshipsByElement**](docs/RelationshipApi.md#getRelationshipsByElement) | **GET** /relationship/element/{element_id} | Get all relationships with the given element as either source or target
*RelationshipApi* | [**getRelationshipsBySource**](docs/RelationshipApi.md#getRelationshipsBySource) | **GET** /relationship/source/{source_id} | Get all relationships with the given element as the source
*RelationshipApi* | [**getRelationshipsByTarget**](docs/RelationshipApi.md#getRelationshipsByTarget) | **GET** /relationship/target/{target_id} | Get all relationships with the given element as the target


## Documentation for Models

 - [Element](docs/Element.md)
 - [Error](docs/Error.md)
 - [Model](docs/Model.md)
 - [Relationship](docs/Relationship.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


