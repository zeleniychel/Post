package Attachments

import Attachment

data class AudioAttachment (override val type: String = "audio", val audio: Audio) : Attachment

data class Audio (
    val id: Int = 333,
    val ownerId: Int =54545,
    val artist: String = "artist",
    val title: String = "title",
    val duration: Int = 55,
    val url: String = "URL",
    val lyricsId: String = "lyrics id",
    val albumId: String = "album id",
    val genreId: Int = 1,
    val date: Int = 34679,
    val noSearch: Boolean = false,
    val isHq: Boolean = true,
)
