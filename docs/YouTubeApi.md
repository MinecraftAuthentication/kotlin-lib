# YouTubeApi

All URIs are relative to *https://api.minecraftauth.me/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**userIsMemberAtTierYouTube**](YouTubeApi.md#userIsMemberAtTierYouTube) | **GET** /{fromPlatform}/{fromUserId}/youtube/member/{tier} | User is member at tier |
| [**userIsMemberYouTube**](YouTubeApi.md#userIsMemberYouTube) | **GET** /{fromPlatform}/{fromUserId}/youtube/member | User is member |
| [**userIsSubscribedYouTube**](YouTubeApi.md#userIsSubscribedYouTube) | **GET** /{fromPlatform}/{fromUserId}/youtube | User is subscribed |


<a id="userIsMemberAtTierYouTube"></a>
# **userIsMemberAtTierYouTube**
> userIsMemberAtTierYouTube(fromPlatform, fromUserId, tier, xSignature)

User is member at tier

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = YouTubeApi()
val fromPlatform : kotlin.String = fromPlatform_example // kotlin.String | 
val fromUserId : kotlin.String = fromUserId_example // kotlin.String | 
val tier : kotlin.String = tier_example // kotlin.String | 
val xSignature : kotlin.String = xSignature_example // kotlin.String | 
try {
    apiInstance.userIsMemberAtTierYouTube(fromPlatform, fromUserId, tier, xSignature)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#userIsMemberAtTierYouTube")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#userIsMemberAtTierYouTube")
    e.printStackTrace()
}
```

### Parameters
| **fromPlatform** | **kotlin.String**|  | |
| **fromUserId** | **kotlin.String**|  | |
| **tier** | **kotlin.String**|  | |
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

<a id="userIsMemberYouTube"></a>
# **userIsMemberYouTube**
> userIsMemberYouTube(fromPlatform, fromUserId, xSignature)

User is member

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = YouTubeApi()
val fromPlatform : kotlin.String = fromPlatform_example // kotlin.String | 
val fromUserId : kotlin.String = fromUserId_example // kotlin.String | 
val xSignature : kotlin.String = xSignature_example // kotlin.String | 
try {
    apiInstance.userIsMemberYouTube(fromPlatform, fromUserId, xSignature)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#userIsMemberYouTube")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#userIsMemberYouTube")
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

<a id="userIsSubscribedYouTube"></a>
# **userIsSubscribedYouTube**
> userIsSubscribedYouTube(fromPlatform, fromUserId, xSignature)

User is subscribed

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = YouTubeApi()
val fromPlatform : kotlin.String = fromPlatform_example // kotlin.String | 
val fromUserId : kotlin.String = fromUserId_example // kotlin.String | 
val xSignature : kotlin.String = xSignature_example // kotlin.String | 
try {
    apiInstance.userIsSubscribedYouTube(fromPlatform, fromUserId, xSignature)
} catch (e: ClientException) {
    println("4xx response calling YouTubeApi#userIsSubscribedYouTube")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YouTubeApi#userIsSubscribedYouTube")
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

