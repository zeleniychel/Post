import Exceptions.PostNotFoundException
import Exceptions.WrongReportParameterCommentIdException
import Exceptions.WrongReportParameterOwnerIdException
import Exceptions.WrongReportParameterReasonException

fun main() {
    val post = Post(donut = null)
    WallService.add(post)
    try{
        WallService.reportComment(2,2,1)
    } catch (e: RuntimeException) {
        print(e.message)
    }

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
    fun createComment (postId: Int, comment: CommentOnWall): CommentOnWall {
        for (post in posts) {
            if (post.id == postId) {
                commentsArray += comment.copy()
                return commentsArray.last()
            }
        }
        throw PostNotFoundException("No post with $postId")

    }

    fun reportComment (postOwnerId: Int, commentId:Int, reason: Int): Boolean {
        var checkId = 0
        var checkCommentId = 0
        var checkReason = -1
        for (post in posts) {
            if (postOwnerId == post.ownerId) {
                checkId = postOwnerId
                if (commentId == post.comments.id) {
                    checkCommentId = commentId
                    if (reason in 0..8) {
                        checkReason = reason
                    }
                }
            }
        }
        if (checkId == 0) throw WrongReportParameterOwnerIdException("Wrong owner ID $postOwnerId")
        if (checkCommentId == 0) throw WrongReportParameterCommentIdException("Wrong comment ID $commentId")
        if (checkReason == -1) throw WrongReportParameterReasonException("Wrong reason $reason")
        else return true
    }
}