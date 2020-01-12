<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.4.1-
dist/css/bootstrap.css">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#"> <img src="<%=request.getContextPath()%>/images/coll2.jpg"
			width="30" height="30" alt="">
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link"
					href="index.html">Collaborateurs </a></li>
				<li class="nav-item"><a class="nav-link" href="stats.html">Statistiques</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="activites.html">Activités</a>
				</li>
			</ul>
		</div>
	</nav>
	<h1>Les collaborateurs</h1>
	<ul>
		<%
		List<Collaborateur> collaborateurs = (List<Collaborateur>) request.getAttribute("listeCollaborateurs");
		for (Collaborateur coll : collaborateurs) {
		%>
		<li><%=coll.getNom()%></li>
		<li><%=coll.getPrenom()%></li>
		<li><%=coll.getEmailPro()%></li>
		<li><%=coll.getNumSecu()%></li>
		<li><%=coll.getDateHeureCreation()%></li>
		<%
		}
		%>
	</ul>
</body>
</html>