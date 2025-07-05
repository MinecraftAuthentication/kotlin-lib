# DiscordApi

All URIs are relative to *https://api.minecraftauth.me/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**myApplications**](DiscordApi.md#myApplications) | **GET** /{fromPlatform}/{fromUserId}/discord/{serverId} | User in guild |
| [**userHasRoleInGuild**](DiscordApi.md#userHasRoleInGuild) | **GET** /{fromPlatform}/{fromUserId}/discord/{serverId}/role/{roleId} | User has role |


<a id="myApplications"></a>
# **myApplications**
> myApplications(fromPlatform, fromUserId, serverId, xSignature)

User in guild

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscordApi()
val fromPlatform : kotlin.String = fromPlatform_example // kotlin.String | 
val fromUserId : kotlin.String = fromUserId_example // kotlin.String | 
val serverId : kotlin.String = serverId_example // kotlin.String | 
val xSignature : kotlin.String = xSignature_example // kotlin.String | 
try {
    apiInstance.myApplications(fromPlatform, fromUserId, serverId, xSignature)
} catch (e: ClientException) {
    println("4xx response calling DiscordApi#myApplications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscordApi#myApplications")
    e.printStackTrace()
}
```

### Parameters
| **fromPlatform** | **kotlin.String**|  | |
| **fromUserId** | **kotlin.String**|  | |
| **serverId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xSignature** | **kotlin.String**|  | |

### Return type

null (empty response body)

### Authorization


Configure appId:
    ApiClient.apiKey["X-Application-ID"] = ""
    ApiClient.apiKeyPrefix["X-Application-ID"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="userHasRoleInGuild"></a>
# **userHasRoleInGuild**
> userHasRoleInGuild(fromPlatform, fromUserId, serverId, roleId, xSignature)

User has role

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscordApi()
val fromPlatform : kotlin.String = fromPlatform_example // kotlin.String | 
val fromUserId : kotlin.String = fromUserId_example // kotlin.String | 
val serverId : kotlin.String = serverId_example // kotlin.String | 
val roleId : kotlin.String = roleId_example // kotlin.String | 
val xSignature : kotlin.String = xSignature_example // kotlin.String | 
try {
    apiInstance.userHasRoleInGuild(fromPlatform, fromUserId, serverId, roleId, xSignature)
} catch (e: ClientException) {
    println("4xx response calling DiscordApi#userHasRoleInGuild")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscordApi#userHasRoleInGuild")
    e.printStackTrace()
}
```

### Parameters
| **fromPlatform** | **kotlin.String**|  | |
| **fromUserId** | **kotlin.String**|  | |
| **serverId** | **kotlin.String**|  | |
| **roleId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xSignature** | **kotlin.String**|  | |

### Return type

null (empty response body)

### Authorization


Configure appId:
    ApiClient.apiKey["X-Application-ID"] = ""
    ApiClient.apiKeyPrefix["X-Application-ID"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

