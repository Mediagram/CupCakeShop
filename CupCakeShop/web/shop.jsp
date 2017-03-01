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
                <form action="FrontController" method="POST">
                    <select class="selectpicker">
                        <option>Select topping...</option>
                        <c:forEach items="${list1}" var="item">
                            <option><c:out value="${item}"/></option>
                        </c:forEach>
                    </select>

                    <select>
                        <option>Select bottom...</option>
                        <c:forEach items="${list2}" var="item">
                            <option><c:out value="${item}"/></option>
                        </c:forEach>
                    </select>
                    <input type="submit" value="Add to basket">
                </form>
            </div>

        </div>

        <c:import url="/inc/footer.jsp"/>
    </body>
</html>
