
fun main() {
    val post = Post(donut = null)
    WallService.add(post)
    print(WallService.crateComment(0, CommentOnWall()))

}

object WallService {

    private var posts = emptyArray<Post>()
    private var id = 0
    private var commentsArray = emptyArray<CommentOnWall>()

    fun add (post: Post) :Post {
        posts += post.copy(id = ++id, comments = post.comments.copy())
        return posts.last()
    }

    fun update(post: Post) :Boolean {
        for ((index, postI) in posts.withIndex()) {
            if (postI.id == post.id) {
                posts[index] = post.copy(comments = post.comments.copy())
                return true
            }
        }
        return false
    }
    fun clear () {
        posts = emptyArray<Post>()
        id = 0
    }
    fun crateComment (postId: Int, comment: CommentOnWall): CommentOnWall {
        for (post in posts) {
            if (post.id == postId) {
                commentsArray += comment.copy()
                return commentsArray.last()
            }
        }
        throw PostNotFoundException("No post with $postId")

    }
}