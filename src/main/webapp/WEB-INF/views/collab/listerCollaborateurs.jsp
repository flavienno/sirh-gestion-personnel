<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="dev.sgp.entite.Departement"%>
<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="fr">

<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-4.4.1-
dist/css/bootstrap.css">
</head>

<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#"> <img
			src="<%=request.getContextPath()%>/images/coll2.jpg" width="30"
			height="30" alt="">
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link"
					href="<%=application.getContextPath()%>/collaborateurs/lister">Collaborateurs
				</a></li>
				<li class="nav-item"><a class="nav-link" href="stats.html">Statistiques</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="activites.html">Activités</a>
				</li>
			</ul>
		</div>
	</nav>

	<main>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-3 offset-9">
				<a href="<%=application.getContextPath()%>/collaborateurs/creer"
					button type="button" class="btn btn-info">Ajouter un nouveau
					collaborateur</a>
			</div>
		</div>
		<div class="row">
			<div class="col ">
				<h1>Les collaborateurs</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-4">
				<p>Rechercher un nom ou un prénom qui commence par :</p>
			</div>
			<div class="col-2">
				<form action="/send" method="get">
					<input type="text" name="lastname" class="form-control" id="nom">
			</div>
			<div class="col-2">
				<button type="button" class="btn btn-secondary btn-sm">Rechercher</button>
			</div>

			<div class="col-3">
				<div class="form-check">
					<input class="form-check-input" type="checkbox" value=""
						id="defaultCheck1"> <label class="form-check-label"
						for="defaultCheck1"> Voir les collaborateurs désactivés </label>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-4">
				<p>Filtrer par département :</p>
			</div>
			<select class="col-2 custom-select">
				<option value="Tous">Tous</option>

				<%
					List<Departement> listeDepartements = (List<Departement>) request.getAttribute("listeDepartements");
					for (Departement dep : listeDepartements) {
				%>
				<option value="<%=dep.getNom()%>"><%=dep.getNom()%></option>
				<%
					}
				%>

			</select>
		</div>


		<div class="row ">
			<%
				List<Collaborateur> collaborateurs = (List<Collaborateur>) request.getAttribute("listeCollaborateurs");
				for (Collaborateur coll : collaborateurs) {
			%>
			<div class="col-12 col-xl-4">

				<div class="card">
					<div class="card-header">

						<h5><%=coll.getNom()%>
							<%=coll.getPrenom()%></h5>

					</div>
					<div class="row">
						<div class="col-4">
							<img src="<%=request.getContextPath()%>/images/contact.png"
								class="card-img">
						</div>
						<div class="col-8">
							<div class="card-body">
								<blockquote class="blockquote mb-0">
									<p>Fonction :---</p>
									<p>Département :---</p>
									<p>
										Email :<%=coll.getEmailPro()%></p>
									<p>Téléphone :---</p>
									<a href="#" class="btn btn-info">Editer</a>
								</blockquote>
							</div>
						</div>
					</div>
				</div>
			</div>
			<%
				}
			%>
		</div>
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
		crossorigin="anonymous"></script>   </main>
</body>
</html>