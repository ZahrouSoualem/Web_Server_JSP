<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->

<html>
    <head>
        <title> Premier TP Client/Serveur </title>
        Chers étudiants, il est: <%= new java.util.Date()%> <br><!-- comment -->
    Nous Somme <%= new java.util.Date().getHours()%>  : <%= new java.util.Date().getMinutes()%>
    <form action="abc" method="post">
        <input type="hidden" name="action" value="add">
        <label for="fnote1">Note 1 </label>
        <input type="text" id="fnote1" name="fnote1"><br>
        <label for="fnote2">Note 2 </label>
        <input type="text" id="fnote2" name="fnote2"><br>
        <label for="fnote3">Note 3 </label>
        <input type="text" id="fnote3" name="fnote3"><br>
        <input type="submit" value="Submit"><br>
    </form>
</head>
</html>
