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
    	add(new Post(2L, "Calling APIs made simple",
    	        "I used to always find the concept of calling external services from my application a bit of a daunting task. I was not sure how to format my request, call the actual service, and format the response I get back into something my application can use. I liked to be in control of everything in my application and relying on someone else seemed like a tough task. However, after working on an application that has at least 20 external dependencies I was forced to confront this. The truth of the matter is that it is fairly simple to call an external service from your application. <br> <br>For this example I wanted to use cool and fairly simple service. I stumbled across <a href='https://swapi.co/' target='_blank'>SWAPI The Star Wars API</a> and thought it would be a cool example to use. The service is very simple to use and returns all sorts of details about the Star Wars Universe. If you want a list of Star Wars characters you call https://swapi.co/api/people. If you want to details on Luke Skywalker you call this <a href='https://swapi.co/api/people/1' target='_blank'>url</a>. This works with any of the Star Wars characters if you have the specific ID of the character you want details from. This works the same way if you want vehicles or planets. You simply specify the url for the data you want (<a href='https://swapi.co/api/planets' target='_blank'>Planets</a> or <a href='https://swapi.co/api/starships' target='_blank'>Starships</a>). <br> <br>The API is very simple to use and the code is even simpler to setup. I just use a Newtonsoft Nuget Package for converting my json to a specific object. I installed NUnit and NUnit Test adapter for creating the tests for my code. Once you have these Nuget packages installed you are to code your communication to the SWAPI. <br> <br>The initial code I have in my service to get the characters is getting the json response back from SWAPI. This can be accomplished by using WebClient and calling the DownloadString method since we are getting json back. The next step is to convert the Json response back to an object that my code can use. Newtonsoft handles this very easily. You simply create your C# objects that have the same members as your json response. Then you call the JsonConvert.DeserializeObject method and specify the object you want to map the json to. <br> <br> <img src= 'resources/core/images/Star Wars API 1.png' alt='Star Wars 1' class='img-responsive'> <br> <br> Then you are done! We only wrote 6 lines of code and created two objects to use. We coded communication to an external service in our application in a very short amount of time. The last step would be to create some unit tests to verify your responses you get back which I have included in the repository. The code for this solution can be found on my Github page at <a href='https://github.com/afrasier02/Star-Wars-API' target='_blank'>Star Wars API</a>. <br> <br> <img src='resources/core/images/Star Wars API 2.png' alt='Star Wars 2' class='img-responsive'> <br> <br> <img src= 'resources/core/images/Star Wars API 3.png' alt='Star Wars 2' class='img-responsive'>",
    	        new User(10L, "afrasier", "Arron Frasier"))
    	        );
    	
    	add(new Post(1L, "First Post",
    	        "This blog is going to be a collection of programming tips, advice, and any fatherhood advice I can provide. I decided to create this blog because I wanted to keep my skills sharp in other areas I don't get to focus on in a daily basis. I've been working in the .NET / C# world for a while now. However, I got to work in Java a few years ago and I'm becoming more intrigued with open source technologies. This blog is written in Java built around the Spring MVC framework. I'm using Bootstrap for styling the User Interface and I’ll be storing the posts in MySQL. I created an Amazon EC2 Linux machine that has Tomcat installed and is hosting the blog. I will be updating the code on my GitHub repository so stay tuned for more blog posts as I finish up more of the site.",
    	        new User(10L, "afrasier", "Arron Frasier"))
    	        );
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