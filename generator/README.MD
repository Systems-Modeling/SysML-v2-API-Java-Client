# Running the generator

### Prerequisites
 1. Install docker
 2. Pull the [openapitools/openapi-generator-cli](https://hub.docker.com/r/openapitools/openapi-generator-cli/) docker image with the command `docker pull openapitools/openapi-generator-cli`

### Generating client code
From the root directory of this project run

`docker run --rm -v "${PWD}:/local"  openapitools/openapi-generator-cli  generate --config=local/config.json`

### Template modifications

1. Added the annotation `@JsonAdapter({{classname}}.CustomTypeAdapterFactory.class)` to all model classes.
This annotation is needed for Gson to properly parse object
2. in anof_model.mustache and oneOf_model.mustache
as oposed to the default template DelegateAdapters
has been replaced with the actual adapters so the parser can properly parse sub-schemas.

### Name mapping

 * renamed additionalProperties field to
hasAdditionalProperties in the generated code
to avoid collision with the default container that
holds the additional properties for a model object

