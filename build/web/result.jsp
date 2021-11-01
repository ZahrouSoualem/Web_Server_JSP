<%-- 
    Document   : result
    Created on : Nov 1, 2021, 12:11:33 AM
    Author     : Zahreddine Soualem
--%>
<%!
    public String mention(double value) {
        if (value <= 5) {
            return "Tres Faible";
        }else if (value < 10) {
            return "FAIBLE";
        } else if (10 <= value && value < 12) {
            return "BIEN";
        } else if (12 <= value && value < 15) {
            return "Tres Bien";
        }else {
            return "Excellent";
        }

    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            System.out.println("Welcome Message : result");
            Object attributeValue = request.getAttribute("moy");
        %>
        <h1><%="la moyenne est  : " + attributeValue
        %></h1>  <br>
        <h1><%="votre mention est  : " + mention(Double.valueOf(attributeValue.toString())) 
        %></h1>  <br>

            </body>
</html>
