# TwitchApi

All URIs are relative to *https://api.minecraftauth.me/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**userIsFollowingTwitch**](TwitchApi.md#userIsFollowingTwitch) | **GET** /{fromPlatform}/{fromUserId}/twitch | User is following |
| [**userIsSubscribedAtTier**](TwitchApi.md#userIsSubscribedAtTier) | **GET** /{fromPlatform}/{fromUserId}/twitch/subscriber/{tier} | User is subsribed at tier |
| [**userIsSubscribedTwitch**](TwitchApi.md#userIsSubscribedTwitch) | **GET** /{fromPlatform}/{fromUserId}/twitch/subscriber | User is subscribed |


<a id="userIsFollowingTwitch"></a>
# **userIsFollowingTwitch**
> userIsFollowingTwitch(fromPlatform, fromUserId, xSignature)

User is following

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TwitchApi()
val fromPlatform : kotlin.String = fromPlatform_example // kotlin.String | 
val fromUserId : kotlin.String = fromUserId_example // kotlin.String | 
val xSignature : kotlin.String = xSignature_example // kotlin.String | 
try {
    apiInstance.userIsFollowingTwitch(fromPlatform, fromUserId, xSignature)
} catch (e: ClientException) {
    println("4xx response calling TwitchApi#userIsFollowingTwitch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitchApi#userIsFollowingTwitch")
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

<a id="userIsSubscribedAtTier"></a>
# **userIsSubscribedAtTier**
> userIsSubscribedAtTier(fromPlatform, fromUserId, tier, xSignature)

User is subsribed at tier

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TwitchApi()
val fromPlatform : kotlin.String = fromPlatform_example // kotlin.String | 
val fromUserId : kotlin.String = fromUserId_example // kotlin.String | 
val tier : kotlin.String = tier_example // kotlin.String | 
val xSignature : kotlin.String = xSignature_example // kotlin.String | 
try {
    apiInstance.userIsSubscribedAtTier(fromPlatform, fromUserId, tier, xSignature)
} catch (e: ClientException) {
    println("4xx response calling TwitchApi#userIsSubscribedAtTier")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitchApi#userIsSubscribedAtTier")
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

<a id="userIsSubscribedTwitch"></a>
# **userIsSubscribedTwitch**
> userIsSubscribedTwitch(fromPlatform, fromUserId, xSignature)

User is subscribed

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TwitchApi()
val fromPlatform : kotlin.String = fromPlatform_example // kotlin.String | 
val fromUserId : kotlin.String = fromUserId_example // kotlin.String | 
val xSignature : kotlin.String = xSignature_example // kotlin.String | 
try {
    apiInstance.userIsSubscribedTwitch(fromPlatform, fromUserId, xSignature)
} catch (e: ClientException) {
    println("4xx response calling TwitchApi#userIsSubscribedTwitch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TwitchApi#userIsSubscribedTwitch")
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

