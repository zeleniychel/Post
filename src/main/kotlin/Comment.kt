data class Comment(
        val count: Int = 2,
        val canPost: Boolean = true,
        val groupsCanPost: Boolean = true,
        val canClose: Boolean = false,
        val canOpen: Boolean = false
)
