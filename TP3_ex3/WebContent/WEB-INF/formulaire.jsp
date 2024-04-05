<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulaire</title>
</head>
<body>
    <h2>Formulaire de commande de petit déjeuner</h2>
    <form method="post" action="commande">
        <label for="chambre">Chambre :</label>
        <input type="text" name="chambre" id="chambre" value="${!empty erreurs['chambre'] ? requestScope.attributPetitDej.chambre : ''}" />
<span style="color: red;">${erreurs['chambre']}</span><br />
        
        <label for="nombreDeRepas">Nombre de repas :</label>
        <input type="text" name="nombreDeRepas" id="nombreDeRepas" value="${!empty erreurs['nombreDeRepas'] ? '' : requestScope.attributPetitDej.nombreDeRepas}" />
        <span style="color: red;">${erreurs['nombreDeRepas']}</span><br />
        
        <label for="heure">Heure de livraison :</label>
        <input type="time" name="heure" id="heure" value="${!empty erreurs['heure'] ? '' : requestScope.attributPetitDej.heure}" required />
        <span style="color: red;">${erreurs['heure']}</span><br />
        
        <label for="commentaires">Commentaire :</label>
        <br />
        <textarea name="commentaires" id="commentaires" rows="5" cols="30">${!empty erreurs['commentaires'] ? '' : requestScope.attributPetitDej.commentaires}</textarea>
        <span style="color: red;">${erreurs['commentaires']}</span><br />
        
        <input type="submit" value="Envoyer" />
    </form>
</body>
</html>
