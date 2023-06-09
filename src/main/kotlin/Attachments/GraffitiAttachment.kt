package Attachments

import Attachment

data class GraffitiAttachment(override val type: String = "graffiti", val graffiti: Graffiti) : Attachment

data class Graffiti (
    val id: Int =4536,
    val ownerId: Int = 346,
    val url: String = "URL",
    val width: Int = 453,
    val height: Int = 346
)
