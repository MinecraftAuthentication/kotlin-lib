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

import org.openapitools.client.models.GuildNotAuthorizedError

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param error 
 * @param status 
 */


data class GuildNotAuthorized (

    @Json(name = "error")
    val error: GuildNotAuthorizedError? = null,

    @Json(name = "status")
    val status: kotlin.String? = null

) {


}

