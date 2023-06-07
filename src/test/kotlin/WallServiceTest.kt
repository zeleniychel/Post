import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {
    @Before
    fun clearBeforeTest() {
        WallService.clear()
        WallService.add(Post())
    }
    @Test
    fun updateTrue() {
        val post = Post(1)
        assertTrue(WallService.update(post))
    }
    @Test
    fun updateFalse() {
        val post = Post(0)
        assertFalse(WallService.update(post))
    }
    @Test
    fun add() {
        val post = WallService.add(Post())
        assertEquals(2,post.id )
    }
}