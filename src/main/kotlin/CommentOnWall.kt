import Attachments.Audio
import Attachments.AudioAttachment
import CommentObjects.Thread

data class CommentOnWall(
    val id: Int = 5,
    val fromId: Int = 10,
    val date: Int = 123,
    val text: String = "text",
    val replyToUser: Int = 1,
    val replyToComment: Int = 2,
    val attachment: Attachment = AudioAttachment("audio", Audio()),
    val thread: Thread = Thread()
)