<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App-Créer Nouveau collaborateur</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-4.4.1-
dist/css/bootstrap.css">
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#"> <img src="images/coll2.jpg"
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
					href="<%=application.getContextPath()%>/collaborateurs/lister">Collaborateurs </a></li>
				<li class="nav-item"><a class="nav-link" href="stats.html">Statistiques</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="activites.html">Activités</a>
				</li>
			</ul>
		</div>
	</nav>
	<main>
	<div class="container">
		<h1>Nouveau collaborateur</h1>
		<form method=post>
			<div class="form-group row">
				<label for="inputNom" class="offset-1 col-sm-2 col-form-label">Nom</label>

				<div class="col-sm-8">
					<input type="text" class="form-control" name="nom" id="inputNom">
					<%
						if (request.getAttribute("erreurNom") != null) {
					%>
					le nom est obligatoire
					<%
						}
					%>
				</div>
			</div>
			<div class="form-group row">
				<label for="inputPrenom" class="offset-1 col-sm-2 col-form-label">Prénom</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" name="prenom"
						id="inputPrenom">
					<%
						if (request.getAttribute("erreurPrenom") != null) {
					%>
					le prénom est obligatoire
					<%
						}
					%>
				</div>
			</div>
			<div class="form-group row">
				<label for="inputDateNaiss" class="offset-1 col-sm-2 col-form-label">Date
					de naissance</label>
				<div class="col-sm-8">
					<input type="date" class="form-control" name="dateNaiss"
						id="inputDateNaiss">
					<%
						if (request.getAttribute("erreurdateDeNaiss") != null) {
					%>
					la date de naissance est obligatoire
					<%
						}
					%>
				</div>
			</div>
			<div class="form-group row">
				<label for="inputAdresse" class="offset-1 col-sm-2 col-form-label">Adresse</label>
				<div class="col-sm-8">
					<textarea input type="text" class="form-control" name="adresse"
						id="inputAdresse"></textarea>
					<%
						if (request.getAttribute("erreurAdresse") != null) {
					%>
					l'adresse est obligatoire
					<%
						}
					%>
				</div>
			</div>
			<div class="form-group row">
				<label for="inputNumSecu" class="offset-1 col-sm-2 col-form-label">Numéro
					de sécurité sociale</label>
				<div class="col-sm-8">
					<input type="number" class="form-control" name="numSecu"
						id="inputNumSecu">
					<%
						if (request.getAttribute("erreurSecu") != null) {
					%>
					le numéro de sécurité sociale est obligatoire
					<%
						}
					%>
				</div>
			</div>
			<div class="float-right">
				<button type="submit" class="btn btn-info">Créer</button>
				<!-- <a href="creer_errors.html" button type="button"
					class="btn btn-info">Afficher erreurs formulaire</a
                        href="creer_errors.html" button> -->
			</div>
		</form>
	</div>
	<!-- Optional JavaScript -->   <!-- jQuery first, then Popper.js, then Bootstrap JS -->
	  <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>   <script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>   <script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script> </main>
</html>