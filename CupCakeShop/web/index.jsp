<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        
        <c:import url="/inc/head.jsp"/>
    </head>
    <body>
        <c:import url="/inc/header.jsp"/>
        
        <div class="container">
            <h1>Hello anonymous</h1>

            <form action="FrontController" method="POST">
                <input type="email" name="username" placeholder="Type in your email..." class="form-control">
                <input type="password" name="password" placeholder="Type in your password..." class="form-control">
                <div class="text-right"><input type="submit" value="Login" class="btn btn-primary" name="login"></div>
            </form>
        
        </div>
        
        <c:import url="/inc/footer.jsp"/>
    </body>
</html>
