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

        <div class="container invoice">
            <div class="row">
                <div class="col-xs-12">
                    <div class="invoice-title">
                        <h2>Invoice</h2><h3 class="pull-right">Order #12345</h3>
                    </div>
                    <hr>
                    <div class="row">
                        <div class="col-sm-12">
                            <strong>Order for:</strong><br>
                            Email: <c:out value="${sessionScope.user.getEmail()}"/>
                            <br><br>
                        </div>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-md-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title"><strong>Order summary</strong></h3>
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-condensed">
                                    <thead>
                                        <tr>
                                            <td><strong>Item</strong></td>
                                            <td class="text-center"><strong>Price</strong></td>
                                            <td class="text-center"><strong>Quantity</strong></td>
                                            <td class="text-right"><strong>Totals</strong></td>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="item" items="${invoice.getOrderCupcakes()}">
                                            <tr>
                                                <td><c:out value="${item.getName()}"/></td>
                                                    <td class="text-center"><c:out value="${item.getPrice()}"/></td>
                                                        <td class="text-center"><c:out value="${item.getAmount()}"/></td>
                                                            <td class="text-right"><c:out value="${item.getPrice() * item.getAmount()}"/></td>
                                                            </tr>
                                                            </c:forEach>
                                                            <tr>
                                                                <td class="no-line"></td>
                                                                <td class="no-line"></td>
                                                                <td class="no-line text-center"><strong>Total</strong></td>
                                                                <td class="no-line text-right"><c:out value="${invoice.getTotalPrice()}"/></td>
                                                                </tr>
                                                            </tbody>
                                                        </table>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <c:import url="/inc/footer.jsp"/>
                                <script src="js/shop.js" ></script>
                            </body>
                        </html>