package services;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

import models.Post;
import models.User;

import org.springframework.stereotype.Service;

import services.PostService;

@Service
public class PostServiceStubImpl implements PostService {
    private ArrayList<Post> posts = new ArrayList<Post>() {{
    	add(new Post(1L, "First Post",
    	        "This blog is going to be a collection of programming tips, advice, and any fatherhood advice I can provide. I decided to create this blog because I wanted to keep my skills sharp in other areas I don't get to focus on in a daily basis. I've been working in the .NET / C# world for a while now. However, I got to work in Java a few years ago and I'm becoming more intrigued with open source technologies. This blog is written in Java built around the Spring MVC framework. I'm using Bootstrap for styling the User Interface and I’ll be storing the posts in MySQL. I created an Amazon EC2 Linux machine that has Tomcat installed and is hosting the blog. I will be updating the code on my GitHub repository so stay tuned for more blog posts as I finish up more of the site.",
    	        new User(10L, "afrasier", "Arron Frasier")));
    }};

    @Override
    public Post findById(Long id) {
        return this.posts.stream()
                .filter(p -> Objects.equals(p.getId(), id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Post create(Post post) {
        post.setId(this.posts.stream().mapToLong(
                p -> p.getId()).max().getAsLong() + 1);
        this.posts.add(post);
        return post;
    }

    @Override
    public Post edit(Post post) {
        for (int i = 0; i < this.posts.size(); i++) {
            if (Objects.equals(this.posts.get(i).getId(), post.getId())) {
                this.posts.set(i, post);
                return post;
            }
        }
        throw new RuntimeException("Post not found: " + post.getId());
    }

    @Override
    public void deleteById(Long id) {
        for (int i = 0; i < this.posts.size(); i++) {
            if (Objects.equals(this.posts.get(i).getId(), id)) {
                this.posts.remove(i);
                return;
            }
        }
        throw new RuntimeException("Post not found: " + id);
    }

	@Override
	public java.util.List<Post> findAll() {
		return this.posts;
	}

	@Override
	public java.util.List<Post> findLatest5() {
		return this.posts.stream()
                .sorted((a, b) -> b.getDate().compareTo(a.getDate()))
                .limit(5)
                .collect(Collectors.toList());
	}
}