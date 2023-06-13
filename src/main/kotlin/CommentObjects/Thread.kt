package CommentObjects

data class Thread(
    val count: Int = 99,
    val items: Array<String> = arrayOf("items"),
    val canPost: Boolean = true,
    val showReplyButton: Boolean = true,
    val groupsCanPost: Boolean = true

) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Thread

        if (count != other.count) return false
        if (!items.contentEquals(other.items)) return false
        if (canPost != other.canPost) return false
        if (showReplyButton != other.showReplyButton) return false
        return groupsCanPost == other.groupsCanPost
    }

    override fun hashCode(): Int {
        var result = count
        result = 31 * result + items.contentHashCode()
        result = 31 * result + canPost.hashCode()
        result = 31 * result + showReplyButton.hashCode()
        result = 31 * result + groupsCanPost.hashCode()
        return result
    }
}