<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../../../favicon.ico">

<title>Software Developer Dad</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="resources/core/css/bootstrap.min.css" />
<link rel="stylesheet" href="resources/core/css/Home.css" />
</head>

<body class="developer-body">

	<nav id="navbar" class="navbar navbar-inverse">
		<%@include  file="html/navbar.html" %>
	</nav>

	<div class="blog-header">
		<div class="container">
			<h1 class="blog-title">Software Developer Dad</h1>
			<p class="lead blog-description">Thoughts on programming,
				fatherhood, and anything else</p>
		</div>
	</div>

	<div class="container">

		<div class="row">

			<div class="col-sm-8 blog-main">

				<div class="blog-post">
					<h2 class="blog-post-title">First Post </h2>
					<p class="blog-post-meta">
						September 18th by <a href="About">Arron</a>
					</p>

					<p>This blog is going to be a collection of programming tips, advice, and any fatherhood advice I can provide. 
					I decided to create this blog because I wanted to keep my skills sharp in other areas I don't get to focus on in a daily basis. 
					I've been working in the .NET / C# world for a while now. 
					However, I got to work in Java a few years ago and I'm becoming more intrigued with open source technologies. 
					This blog is written in Java built around the Spring MVC framework. I'm using Bootstrap for styling the User Interface and I will be storing the posts in MySQL.
					I created an Amazon EC2 Linux machine that has Tomcat installed and is hosting the blog.
					I'll be updating the code on my GitHub repository so stay tuned for more blog posts as I finish up more of the site.</p>

				</div>

			</div>

			<div id="sidebar">
				<div id="sidebar">
					<%@include  file="html/sidebar.html" %>
				</div>
			</div>

		</div>

	</div>

	<div class="footer"> 
		<div class="container">
			<span>Developed by Arron Frasier</span>
		</div>
	</div>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="resources/core/js/bootstrap.min.js"></script>

<script type="text/javascript">	
$(document).ready(function(){ 		
	$('ul.nav > li').removeClass('active');
});
</script>

</html>