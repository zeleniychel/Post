import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {
    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }
    @Test
    fun updateTrue() {
        val post = Post(0)
        WallService.update(post)
        assertTrue(true)
    }
    @Test
    fun updateFalse() {
        val post = Post(2)
        WallService.update(post)
        assertFalse(false)
    }
    @Test
    fun add() {
        val post = Post()
        WallService.add(post)
        assertEquals(1,post.id )
    }
}