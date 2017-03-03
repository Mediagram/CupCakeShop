<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="message-container" id="messageContainer">
    <p id="message-text">test</p>
</div>

<header>
    <div class="container text-right">
        <c:choose>
            <c:when test="${sessionScope.user != null}">
                Logged in as: <c:out value="${sessionScope.user.getName()}"/>
                <form style="display: inline;" method="link" action="./FrontController">
                    <input name="action" type="submit" value="logout"/>
                </form>
            </c:when>
            <c:otherwise>
                Not logged in.
            </c:otherwise>
        </c:choose>
    </div>
</header>
