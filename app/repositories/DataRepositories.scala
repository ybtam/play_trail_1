package repositories

import models.{Comment, Post}

class DataRepositories {
  private val posts = Seq(
    Post(1, "This is a blog post"),
    Post(2, "Another blog post with awesome content")
  )

  private val comments = Seq(
    Comment(1, 1, "This is an awesome blog post", "Fantastic Mr Fox"),
    Comment(2, 1, "Thanks for the insights", "Jane Doe"),
    Comment(3, 2, "Great, thanks for this post", "Joe Bloggs")
  )

  def getPost(postId: Int): Option[Post] = posts.collectFirst{
    case p if p.id == postId => p
  }

  def getComments(postId: Int): Seq[Comment] = comments.collect{
    case c if c.postId == postId => c
  }
}
