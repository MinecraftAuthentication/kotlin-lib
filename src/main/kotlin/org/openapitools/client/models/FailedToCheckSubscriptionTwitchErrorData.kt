/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.ApplicationNotFoundErrorData

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param broadcaster 
 * @param viewer 
 */


data class FailedToCheckSubscriptionTwitchErrorData (

    @Json(name = "broadcaster")
    val broadcaster: ApplicationNotFoundErrorData? = null,

    @Json(name = "viewer")
    val viewer: ApplicationNotFoundErrorData? = null

) {


}

