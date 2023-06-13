import Exceptions.PostNotFoundException
import Exceptions.WrongReportParameterCommentIdException
import Exceptions.WrongReportParameterOwnerIdException
import Exceptions.WrongReportParameterReasonException
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {
    @Before
    fun clearBeforeTest() {
        WallService.clear()
        WallService.add(Post(donut = null))
    }

    @Test
    fun updateTrue() {
        val post = Post(1, donut = null)
        assertTrue(WallService.update(post))
    }

    @Test
    fun updateFalse() {
        val post = Post(0, donut = null)
        assertFalse(WallService.update(post))
    }

    @Test
    fun add() {
        val post = WallService.add(Post(donut = null))
        assertEquals(2, post.id)
    }

    @Test
    fun createCommentTest() {
        val postId = 1
        val commentParameter = CommentOnWall()
        assertEquals(CommentOnWall(5, 10), WallService.createComment(postId, commentParameter))

    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        WallService.createComment(5, CommentOnWall())
    }

    @Test
    fun reportCommentTest() {
        val postOwnerId = 2
        val commentId = 5
        val reason = 5
        assertEquals(true, WallService.reportComment(postOwnerId, commentId, reason))
    }


    @Test(expected = WrongReportParameterOwnerIdException::class)
    fun WrongReportParameterOwnerIdExceptionTest() {
        WallService.reportComment(1, 5, 1)
    }

    @Test(expected = WrongReportParameterReasonException::class)
    fun WrongReportParameterReasonExceptionTest() {
        WallService.reportComment(2, 5, 10)
    }

    @Test(expected = WrongReportParameterCommentIdException::class)
    fun WrongReportParameterCommentIdExceptionTest() {
        WallService.reportComment(2, 111, 1)
    }
}