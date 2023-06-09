package PostObjects

import java.util.Objects

data class Donut(
    val isDonat: Boolean = true,
    val paidDuration: Int = 3600,
    val canPublishFreeCopy: Boolean = false,
    val editMod: String = "all"
)
