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

import org.openapitools.client.models.NoPatronsFoundErrorDataPatreon

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param patreon 
 */


data class NoPatronsFoundErrorData (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "patreon")
    val patreon: NoPatronsFoundErrorDataPatreon? = null

) {


}

