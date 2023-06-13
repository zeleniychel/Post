package PostObjects

data class Geo(
    val type: String = "city",
    val coordinates: String = "47° 13' с. ш. 39° 43' в. д.",
    val place: String = "central park"
)
