<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shop</title>

        <%@include file="inc/head.jsp" %>
    </head>
    <body class="shop">
        <c:import url="/inc/header.jsp"/>

        <div class="container transparent shop-padding">
            <div class="col-sm-6">

            </div>

            <div class="col-sm-6">
                <h1>Create your own CupCakes</h1>
                <form id="cakeform" action="FrontController" method="POST">

                    <div class="form-group">
                        <select id="selectTopping" class="form-control">
                            <option data-price="0" value="" >Select topping...</option>
                            <c:forEach var="entry" items="${toppingMap}">
                                <option class="elements" data-price="${entry.value}">
                                    <c:out value="${entry.key}"/>
                                </option>
                            </c:forEach>
                        </select>
                    </div>

                    <div class="form-group">
                        <select id="selectBottom" class="form-control">
                            <option data-price="0" value="" >Select bottom</option>
                            <c:forEach var="entry" items="${bottomMap}">
                                <option class="elements" data-price="${entry.value}">
                                    <c:out value="${entry.key}"/>
                                </option>
                            </c:forEach>
                        </select>
                    </div>
                    
                    <div class="row">
                        <div class="col-sm-4"><input type="number" placeholder="Amount..." class="form-control" id="cake-amount" min="1" max="200" value="1"></div>
                        <div class="col-sm-8 text-right">
                            <input type="button" value="Add cupcake" class="btn btn-primary" id="add-button">
                        </div>
                    </div>
                    
                    <div class="row">
                        <div class="col-sm-6">Cupcake stk. pris: <strong><span id="totalpris"> 0 kr.</span></strong></div>
                        <div class="col-sm-6"></div>
                    </div>
                </form>
            </div>

            <form action="FrontController" method="POST" id="tempBasketForm">
                <div class="col-sm-12 temp-basket" id="temp-basket-container"></div>
                
                <div class="col-sm-12 temp-basket-sum text-right" id="temp-basket-bottom">
                    I alt: <input type="text" name="sum-up-field" id="sum-up-field"> kr.
                    
                </div>
                <div class="text-right" id="add-to-basket">
                    <a href="#" onClick="window.location.reload()">Empty basket</a> 
                    <button type="submit" name="action" value="addToBasket" class="btn btn-primary">Add to shopping cart</button>
                </div>
                
            </form>
            
        </div>
        
        <c:import url="/inc/footer.jsp"/>
        <script src="js/shop.js" ></script>
    </body>
</html>
