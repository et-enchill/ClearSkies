package com.joejoenchill.clearskies.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Coord(

    @SerializedName("lon")
    val lon: Double,

    @SerializedName("lat")
    val lat: Double
): Serializable