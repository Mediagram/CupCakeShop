<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        
        <c:import url="/inc/head.jsp"/>
    </head>
    <body class="frontpage">
        <c:import url="/inc/header.jsp"/>
        
        <div class="container">
            

            <div class="login-container">
                <h1>CupCakeShop</h1>
                <p>Please login:</p>
                <form action="FrontController" method="POST">
                    <input type="email" name="username" placeholder="Type in your email..." class="form-control" required>
                    <input type="password" name="password" placeholder="Type in your password..." class="form-control" required>
                    <div class="text-right"><input id="login" type="submit" value="login" class="btn btn-primary" name="action"></div>
                </form>
            </div>
        
        </div>
        
        <c:import url="/inc/footer.jsp"/>
        <script>
            showMessage();
        </script>
    </body>
</html>
