<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Récapitulatif de Commande</title>
</head>
<body>
    <%@ page import="fr.hotel.PetitDejeuner" %>
    
    <% PetitDejeuner petitDej = (PetitDejeuner) request.getAttribute("petitDej"); %>
    
    <h2>Récapitulatif de votre commande :</h2>
    <p>Chambre : <%= petitDej.getChambre() %></p>
    <p>Nombre de repas : <%= petitDej.getNombreDeRepas() %></p>
    <p>Heure de livraison : <%= petitDej.getHeure() %></p>
    <p>Commentaire : <%= petitDej.getCommentaires() %></p>
    
    <p>Merci pour votre commande !</p>
</body>
</html>
