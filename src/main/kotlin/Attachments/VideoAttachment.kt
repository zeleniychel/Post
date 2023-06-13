package Attachments

import Attachment
import PostObjects.Likes
import PostObjects.Reposts


data class VideoAttachment(override val type: String = "video", val video: Video) : Attachment
data class Video(
    val id: Int = 444,
    val ownerId: Int = 32,
    val title: String = "title",
    val description: String = "description",
    val duration: Int = 60,
    val image: Array<VideoImage> = arrayOf(VideoImage(100, "url", 200, 300)),
    val firstFrame: Array<VideoFirstFrame> = arrayOf((VideoFirstFrame(350, "url2", 400))),
    val date: Int = 125,
    val addingDate: Int = 764,
    val views: Int = 99999,
    val localViews: Int = 1,
    val player: String = "player",
    val platform: String = "platform",
    val canAdd: Boolean = true,
    val isPrivate: Boolean = true,
    val accessKey: String = "key",
    val processing: Int = 1,
    val isFavorite: Boolean = true,
    val canComment: Boolean = true,
    val canEdit: Boolean = true,
    val canLike: Boolean = true,
    val canRepost: Boolean = true,
    val canSubscribe: Boolean = true,
    val canAddToFaves: Boolean = true,
    val canAttachLink: Boolean = true,
    val height: Int = 100,
    val width: Int = 334,
    val userId: Int = 55554,
    val converting: Boolean = true,
    val added: Boolean = true,
    val isSubscribed: Boolean = true,
    val repeat: Int = 2,
    val type: String = "type",
    val balance: Int = 5,
    val liveStatus: String = "status",
    val live: Int = 5,
    val upcoming: Int = 6,
    val spectators: Int = 7,
    val likes: Likes = Likes(),
    val reposts: Reposts = Reposts()


)

data class VideoImage(
    val height: Int = 123,
    val url: String = "URL",
    val width: Int = 435,
    val withPadding: Int = 2346
)

data class VideoFirstFrame(
    val height: Int = 435,
    val url: String = "URL",
    val width: Int = 345,
)