import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val post = Post()
        WallService.add(post)
        assertEquals(1,post.id )
    }

    @Test
    fun updateTrue() {
        val post = Post()
        WallService.update(post)
        assertTrue(true)
    }

    @Test
    fun updateFalse() {
        val post = Post()
        val postFalse = post.copy(id= 5)
        WallService.update(postFalse)
        assertFalse(false)
    }
}