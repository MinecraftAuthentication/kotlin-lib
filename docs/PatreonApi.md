# PatreonApi

All URIs are relative to *https://api.minecraftauth.me/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**userIsPatreonMember**](PatreonApi.md#userIsPatreonMember) | **GET** /{fromPlatform}/{fromUserId}/patreon | User is member |
| [**userIsPatreonMemberAtTier**](PatreonApi.md#userIsPatreonMemberAtTier) | **GET** /{fromPlatform}/{fromUserId}/patreon/tier/{tierName} | User is member at tier |


<a id="userIsPatreonMember"></a>
# **userIsPatreonMember**
> userIsPatreonMember(fromPlatform, fromUserId, xSignature)

User is member

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PatreonApi()
val fromPlatform : kotlin.String = fromPlatform_example // kotlin.String | 
val fromUserId : kotlin.String = fromUserId_example // kotlin.String | 
val xSignature : kotlin.String = xSignature_example // kotlin.String | 
try {
    apiInstance.userIsPatreonMember(fromPlatform, fromUserId, xSignature)
} catch (e: ClientException) {
    println("4xx response calling PatreonApi#userIsPatreonMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PatreonApi#userIsPatreonMember")
    e.printStackTrace()
}
```

### Parameters
| **fromPlatform** | **kotlin.String**|  | |
| **fromUserId** | **kotlin.String**|  | |
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

<a id="userIsPatreonMemberAtTier"></a>
# **userIsPatreonMemberAtTier**
> userIsPatreonMemberAtTier(fromPlatform, fromUserId, tierName, xSignature)

User is member at tier

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PatreonApi()
val fromPlatform : kotlin.String = fromPlatform_example // kotlin.String | 
val fromUserId : kotlin.String = fromUserId_example // kotlin.String | 
val tierName : kotlin.String = tierName_example // kotlin.String | 
val xSignature : kotlin.String = xSignature_example // kotlin.String | 
try {
    apiInstance.userIsPatreonMemberAtTier(fromPlatform, fromUserId, tierName, xSignature)
} catch (e: ClientException) {
    println("4xx response calling PatreonApi#userIsPatreonMemberAtTier")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PatreonApi#userIsPatreonMemberAtTier")
    e.printStackTrace()
}
```

### Parameters
| **fromPlatform** | **kotlin.String**|  | |
| **fromUserId** | **kotlin.String**|  | |
| **tierName** | **kotlin.String**|  | |
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

