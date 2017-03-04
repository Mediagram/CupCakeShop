<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cart</title>

        <%@include file="inc/head.jsp" %>
    </head>
    <body>
        <c:import url="/inc/header.jsp"/>

        <div class="container transparent shop-padding">
            <h1>Shopping cart</h1>

            <c:forEach var="entry" items="${shoppingContent}">

                    <c:out value="${entry}"/>

            </c:forEach>

        </div>


        <c:import url="/inc/footer.jsp"/>
    </body>
</html>
