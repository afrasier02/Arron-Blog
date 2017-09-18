<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../../../favicon.ico">

<title>Developer Dad</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="resources/core/css/bootstrap.min.css" />
<link rel="stylesheet" href="resources/core/css/Home.css" />
</head>

<body class="developer-body">

	<nav id="navbar" class="navbar navbar-inverse">

	</nav>

	<div class="blog-header">
		<div class="container">
			<h1 class="blog-title">Developer Dad</h1>
			<p class="lead blog-description">Thoughts on programming,
				fatherhood, and anything else</p>
		</div>
	</div>

	<div class="container">

		<div class="row">

			<div class="col-sm-8 blog-main">

				<div class="blog-post">
					<h2 class="blog-post-title">Sample blog post</h2>
					<p class="blog-post-meta">
						September 18th by <a href="#">Arron</a>
					</p>

					<p>This blog post shows a few different types of content that's
						supported and styled with Bootstrap. Basic typography, images, and
						code are all supported.</p>
				</div>

			</div>

			<div id="sidebar">
			
			</div>

		</div>

	</div>

	<footer class="blog-footer"> </footer>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="resources/core/js/bootstrap.min.js"></script>

<script type="text/javascript">	
	$(document).ready(function(){ 
		$( "#navbar" ).load("resources/core/html/navbar.html");
		$( "#sidebar" ).load("resources/core/html/sidebar.html"); 
	});
</script>

</html>