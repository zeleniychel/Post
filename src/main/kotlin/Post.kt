data class Post(
        val id: Int = 1,
        val ownerId: Int = 2,
        val fromId: Int = 3,
        val createdBy: Int =4,
        val date: Int = 5,
        val text: String = "Hello",
        val friendOnly: Boolean = false,
        val canDelete: Boolean = true,
        val canEdit: Boolean = false,
        val isPinned: Boolean = true,
        val comments: Comment = Comment()
)