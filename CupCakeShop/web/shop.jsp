<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shop</title>

        <%@include file="inc/head.jsp" %>
    </head>
    <body>

        <c:import url="/inc/header.jsp"/>

        <div class="container">
            <div class="col-sm-6">

            </div>

            <div class="col-sm-6">
                <form id="cakeform" action="FrontController" method="POST">
                    <select id="selectTopping" class="selectpicker">
                        <option data-price="0">Select topping...</option>
                        <c:forEach var="entry" items="${toppingMap}">
                            <option class="elements" data-price="${entry.value}">
                                <c:out value="${entry.key}"/>
                            </option>
                        </c:forEach>
                    </select>

                    <select id="selectBottom">
                        <option data-price="0">Select bottom...</option>
                        <c:forEach var="entry" items="${bottomMap}">
                            <option class="elements" data-price="${entry.value}">
                                <c:out value="${entry.key}"/>
                            </option>
                        </c:forEach>
                    </select>
                    <input type="submit" value="Add to basket">
                    <p id="totalpris"> 0 kr </p>
                </form>
            </div>

        </div>

        <c:import url="/inc/footer.jsp"/>
        <script src="js/calc.js" ></script>
    </body>
</html>
