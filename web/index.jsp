<%-- 
    Document   : index
    Created on : 18/07/2015, 09:16:50 PM
    Author     : L
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio | Universidad San Carlos</title>
        <!-- CSS -->
        <link rel="stylesheet" href="css/login.css">
        <!--<link rel="stylesheet" href="css/bootstrap.css">-->
        <link rel="stylesheet" href="css/font-awesome.css">
        <link rel="stylesheet" href="css/iconFont.css">
        <!-- JS -->
        <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
        <script type="text/javascript" src="js/login.js"></script>
    </head>
    <body>
        <div class="wrapper">
            <div class="container">
                <div class="logo">
                    <img src="img/Logo_USC.jpg">
                </div>

                <h1>¡Bienvenido!</h1>

                <form class="form" action="CtrlLogin" method="POST">
                    <input type="text" name="username" placeholder="Nombre de Usuario">
                    <input type="password" name="password" placeholder="Contraseña" required>
                    <button type="submit" id="login-button">Entrar <i class="icon-arrow-right-5"></i></button>
                </form>
            </div>

            <ul class="bg-bubbles">
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
            </ul>
        </div>

        <script type="text/javascript">
            $("#login-button").click(function (event) {

                event.preventDefault();
                
                $('form').fadeOut(500);
                $('.wrapper').addClass('form-success');

                setTimeout(function () {
                    enviar()
                }, 3000);
            });

            function enviar() {
                $('form').submit();
            }
        </script>
    </body>
</html>
