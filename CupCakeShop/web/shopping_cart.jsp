<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cart</title>

        <%@include file="inc/head.jsp" %>
    </head>
    <body class="shop">
        <c:import url="/inc/header.jsp"/>

        <div class="container transparent shop-padding">
            <h1>Shopping cart</h1>

            <c:forEach var="entry" items="${shoppingContent}">
                <hr>
                <c:out value="${entry}"/>
            </c:forEach>

            <div class="text-right">
                <hr>
                <h1>Total: <c:out value="${totalAmount}"/> kr.</h1>
            </div>
        </div>


        <c:import url="/inc/footer.jsp"/>
    </body>
</html>
