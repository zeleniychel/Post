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
        assertEquals(2,post.id )
    }
}