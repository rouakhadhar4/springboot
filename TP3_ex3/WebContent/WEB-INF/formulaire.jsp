<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <form method="POST" action="commande">
        <label for="chambre">Chambre : </label> 
        <input type="text" name="chambre" id="chambre" value="100"/><br />

        <label for="nombreDeRepas">Nombre de repas : </label> 
        <input type="text" name="nombreDeRepas" id="nombreDeRepas" value="1"/><br />

        <label for="heure">Heure de livraison (entre 6h et 10h) : </label> 
        <input type="time" name="heure" id="heure" value="08:00" required /><br /> 

        <label for="commentaire">Commentaire : </label> <br />
        <textarea name="commentaire" id="commentaire" rows="10" cols="50">Vos remarques.</textarea><br /> 

        <input type="submit" name="Envoyer" value="Envoyer" />
    </form>
</body>
</html>
