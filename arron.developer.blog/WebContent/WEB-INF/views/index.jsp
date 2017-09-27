<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Software Developer Dad</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="resources/core/css/bootstrap.min.css" />
<link rel="stylesheet" href="resources/core/css/Home.css" />
<%@ page isELIgnored="false" %>
<link rel="shortcut icon" href="resources/core/images/favicon.ico" type="image/x-icon"/>
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
				<c:forEach items="${latest3posts}" var="blog">
					<div class="blog-post">
						<h2 class="blog-post-title">${blog.title}</h2>
						<p class="blog-post-meta">
							September 18th by <a href="About">${blog.author.fullName}</a>
						</p>
	
						<p class="content"><c:out escapeXml="false" value="${blog.body}"></c:out></p>
					</div>
    			</c:forEach>
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