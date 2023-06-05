fun main() {
    WallService.add(Post ())
    print(WallService.posts[0])

}

object WallService {

    var posts = emptyArray<Post>()
    private var id = 0

    fun add (post: Post) :Post {
        posts += post.copy(id = ++id)
        return posts.last()
    }

    fun update(post: Post) :Boolean {
        for ((index, postI) in posts.withIndex()) {
            if (postI.id == post.id) {
                posts[index] = post
                return true
            }
        }
        return false
    }
    fun clear () {
        posts = emptyArray()
        id = 0
    }
}