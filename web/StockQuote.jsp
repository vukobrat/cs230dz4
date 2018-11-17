<%-- 
    Document   : StockQuote
    Created on : Nov 17, 2018, 5:30:02 PM
    Author     : marko
--%>

<%@page import="com.vezba4.StockPriceGenerator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Stock Quote</title>
    </head>
    <body>
        <jsp:useBean id="stock" class="com.vezba4.Stock" />
        <jsp:setProperty property="*" name="stock" />
        <%!StockPriceGenerator stockServer = new StockPriceGenerator();%>

        <% try {
                double cena = stockServer.getCena(stock.getSimbol());
        %>
        Simbol: <%=stock.getSimbol()%><br>
        Kolicina: <%=stock.getAmount()%><br>
        Cena: <%=cena%><br>
        Ukupna cena: <%=cena * stock.getAmount()%>

        <% } catch (Exception ex) {
                response.setStatus(response.SC_MOVED_TEMPORARILY);
                response.setHeader("Refresh", "5; URL=index.html");
                out.println(ex.getMessage());
            }%>
    </body>
</html>