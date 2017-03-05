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
                <c:out value="${entry.getAmount()}"/> x 
                <c:out value="${entry.getName()}"/>
                <c:out value="${entry.getPrice()}"/> kr.
            </c:forEach>

            <div class="text-right">
                <hr>
                <h1>Total: <c:out value="${sessionScope.totalAmount}"/> kr.</h1>
            </div>

            <form action="FrontController" method="POST">
                <div class="text-right"><button type="submit" name="action" value="order" class="btn btn-primary">Confirm and pay</button></div>
            </form>
        </div>

        <c:import url="/inc/footer.jsp"/>
    </body>
</html>