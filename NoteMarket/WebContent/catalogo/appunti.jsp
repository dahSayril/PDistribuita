<%@ page import="it.unisa.model.bean.account.Account" %>
<%@ page import="it.unisa.model.bean.account.Acquirente" %>
<!DOCTYPE html>
<html>
<%
	Account account = (Account) request.getSession().getAttribute("account");
	boolean isLogged = false;
	if(account != null) isLogged = true;
%>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>NoteMarket</title>
    <link rel="stylesheet" href="../CSS/Bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="../CSS/Fonts/ionicons.min.css">
    <link rel="stylesheet" href="../CSS/Footer/Footer-Basic.css">
    <link rel="stylesheet" href="../CSS/Index/Highlight-Phone.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/aos/2.1.1/aos.css">
    <link rel="stylesheet" href="../CSS/Menu/Navigation-Menu.css">
    <link rel="stylesheet" href="../CSS/Menu/Navigation-with-Button.css">
    <link rel="stylesheet" href="../CSS/Index/Team-Clean.css">
    <link rel="stylesheet" href="../CSS/LoginRegistrazione/Registration-Form-with-Photo.css">
    <link rel="icon" href="../IMG/icon.ico">
</head>

<body style="background-color: #343a40;">
	<nav class="navbar navbar-light navbar-expand-lg sticky-top navigation-clean-button">
        <div class="container-fluid"><img src="../IMG/Menu/logo.png" style="width: 200px;"><button data-toggle="collapse" class="navbar-toggler" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
            <div class="collapse navbar-collapse"
                id="navcol-1" style="margin-top: 0px;">
                <ul class="nav navbar-nav mr-auto" style="margin-top: -15px;">
                    <li class="nav-item" role="presentation" style="color: rgb(0,0,0);"><a class="nav-link" href="<%= response.encodeURL("../index") %>">Home</a></li>
                    <li class="nav-item" role="presentation"><a class="nav-link" href="<%= response.encodeURL("../contatti") %>">Contattaci</a></li>
                    <li class="nav-item" role="presentation"><a class="nav-link active" href="<%= response.encodeURL("appunti.jsp") %>">Appunti</a></li>
                    <li class="nav-item" role="presentation"><a class="nav-link" href="<%= response.encodeURL("videolezioni.jsp") %>">Videolezioni</a></li>
                    <li class="nav-item" role="presentation"><a class="nav-link" href="<%= response.encodeURL("../tutor.jsp") %>">Tutor</a></li>
                </ul>
                <span class="navbar-text actions"> 
                	<% if((isLogged && account instanceof Acquirente) || !isLogged) { %><a class="login" href="<%= (isLogged) ? response.encodeURL("../logout") : response.encodeURL("../login.jsp") %>" style="background-color: rgba(0,0,0,0);"><%= (isLogged) ? "Esci" : "Accedi" %></a><% } %>
                	<button class="btn btn-light action-button" data-bs-hover-animate="tada" type="button" onclick="window.location='<%= (!isLogged) ? response.encodeURL("../registrazione.jsp") : (account instanceof Acquirente) ? response.encodeURL("carello.jsp") : response.encodeURL("../logout") %>'"><%= (!isLogged) ? "Registrati" : (account instanceof Acquirente) ? "Carello" : "Esci" %></button>
                </span>
        	</div>
        </div>
    </nav>
    <div class="bg-dark footer-basic" style="color: rgb(255,255,255);">
        <footer style="color: rgb(255,255,255);">
            <div class="social"><a data-bs-hover-animate="tada" href="#" style="background-color: rgba(0,0,0,0.1);"><i class="icon ion-social-instagram"></i></a><a data-bs-hover-animate="tada" href="#" style="background-color: rgba(0,0,0,0.1);"><i class="icon ion-social-snapchat"></i></a>
                <a data-bs-hover-animate="tada" href="#" style="background-color: rgba(0,0,0,0);"><i class="icon ion-social-twitter"></i></a><a data-bs-hover-animate="tada" href="#" style="background-color: rgba(0,0,0,0);"><i class="icon ion-social-facebook"></i></a></div>
            <ul class="list-inline">
                <li class="list-inline-item"><a href="<%= response.encodeURL("../index") %>" style="background-color: rgba(0,0,0,0);">Home</a></li>
                <li class="list-inline-item"><a href="<%= response.encodeURL("../contatti") %>" style="background-color: rgba(0,0,0,0);">Contattaci</a></li>
                <li class="list-inline-item"><a href="<%= response.encodeURL("../policy.jsp") %>" style="background-color: rgba(0,0,0,0);">Condizioni d'uso</a></li>
            </ul>
            <p class="copyright">NoteMarket © 2020</p>
        </footer>
    </div>
    <script src="JS/Bootstrap/jquery.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="JS/Bootstrap/bs-init.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/aos/2.1.1/aos.js"></script>
</body>

</html>