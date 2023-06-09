package PostObjects

data class Likes(
    val count: Int = 999,
    val userLikes: Boolean = true,
    val canLike: Boolean = true,
    val canPublish: Boolean = false
)
