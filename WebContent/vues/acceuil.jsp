<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@taglib prefix="html" uri="/WEB-INF/struts-html.tld" %>
<head>
<meta charset="ISO-8859-1">
<title>Acceuil</title>
</head>
<body>
	<script type="text/javascript">
		function fctRecherche()	{
			this.document.forms[0].action="rechercher.do";
			this.document.forms[0].submit();
		}
		function fctAjouter()	{
			this.document.forms[0].action="ajouter.do";
			this.document.forms[0].submit();
		}
		function fctSupprimer()	{
			this.document.forms[0].action="supprimer.do";
			this.document.forms[0].submit();
		}
	</script>
	<h1>Validation des formulaires en Struts1</h1>
	<form method="get">
	<html:errors/>
		<label>Cin : </label>
		<input type="text" name="cinForm"/><br>
		<label>Nom : </label>
		<input type="text" name="nomForm"/><br>
		<label>Prenom : </label>
		<input type="text" name="prenomForm"/><br>
		<label>telephone : </label>
		<input type="text" name="telForm"/><br>
		<label>E-mail : </label>
		<input type="text" name="mailForm"/><br>
		<input type="submit" value="Rechercher Etudiant" onclick="fctRecherche()"/>
		<input type="submit" value="Ajouter Etudiant" onclick="fctAjouter()"/>
		<input type="submit" value="Supprimer Etudiant" onclick="fctSupprimer()"/>
	</form>
</body>
</html>