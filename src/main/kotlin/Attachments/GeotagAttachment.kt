package Attachments

import Attachment

data class GeotagAttachment (override val type: String = "geotag", val geotag: Geotag) : Attachment

data class Geotag (
    val type: String = "type",
    val coordinates: Coordinates = Coordinates(),
    val place: Place = Place(),

)
data class Coordinates (
    val latitude: Int = 12,
    val longitude: Int = 54
)

data class Place (
    val id: Int = 3333,
    val title: String = "title",
    val latitude: Int = 13,
    val longitude: Int = 11,
    val created: Int = 23,
    val icon: String = "url",
    val country: String ="country",
    val city: String = "city"
)