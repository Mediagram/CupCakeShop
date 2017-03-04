<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="message-container" id="messageContainer">
    <p id="message-text">test</p>
</div>

<header>
    <div class="container-fluid text-right">
        <c:choose>
            <c:when test="${sessionScope.user != null}">
                Logged in as: <strong><c:out value="${sessionScope.user.getName()}"/></strong> | 
                Balance: <strong id="header-balance"><c:out value="${sessionScope.user.getBalance()}"/> kr.</strong>
                    
                <form action="FrontController" method="POST">
                    <input name="action" type="submit" value="logout" class="btn btn-default btn-xs"/>
                </form>
            </c:when>
            <c:otherwise>
                Not logged in.
            </c:otherwise>
        </c:choose>
    </div>
</header>
