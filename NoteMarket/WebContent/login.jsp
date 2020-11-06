<%@ page import="it.unisa.model.bean.account.Account" %>
<!DOCTYPE html>
<html>
<%
	Account account = (Account) request.getSession().getAttribute("account");
	if(account != null) {
		response.sendRedirect(response.encodeRedirectURL("index"));
		return;
	}
	boolean attempt = (request.getParameter("attempt") != null &&
			request.getParameter("attempt").equals("1")) ? true : false;
	boolean error = (request.getParameter("error") != null &&
			request.getParameter("error").equals("true")) ? true : false;
	boolean notVerify = (request.getParameter("notVerify") != null &&
			request.getParameter("notVerify").equals("true")) ? true : false;
	boolean banned = (request.getParameter("banned") != null &&
			request.getParameter("banned").equals("true")) ? true : false;
%>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Accedi a NoteMarket</title>
    <link rel="stylesheet" href="CSS/Bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="CSS/Fonts/ionicons.min.css">
    <link rel="stylesheet" href="CSS/Footer/Footer-Basic.css">
    <link rel="stylesheet" href="CSS/Index/Highlight-Phone.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/aos/2.1.1/aos.css">
    <link rel="stylesheet" href="CSS/Menu/Navigation-Menu.css">
    <link rel="stylesheet" href="CSS/Menu/Navigation-with-Button.css">
    <link rel="stylesheet" href="CSS/Index/Team-Clean.css">
    <link rel="stylesheet" href="CSS/LoginRegistrazione/Login-Form-Clean.css">
    <link rel="icon" href="IMG/icon.ico">
</head>

<body style="background-color: #343a40;">
	<nav class="navbar navbar-light navbar-expand-lg sticky-top navigation-clean-button">
        <div class="container-fluid"><img src="IMG/Menu/logo.png" style="width: 200px;"><button data-toggle="collapse" class="navbar-toggler" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
            <div class="collapse navbar-collapse"
                id="navcol-1" style="margin-top: 0px;">
                <ul class="nav navbar-nav mr-auto" style="margin-top: -15px;">
                    <li class="nav-item" role="presentation" style="color: rgb(0,0,0);"><a class="nav-link" href="<%= response.encodeURL("index") %>">Home</a></li>
                    <li class="nav-item" role="presentation"><a class="nav-link" href="<%= response.encodeURL("contatti") %>">Contattaci</a></li>
                    <li class="nav-item" role="presentation"><a class="nav-link" href="<%= response.encodeURL("catalogo/appunti.jsp") %>">Appunti</a></li>
                    <li class="nav-item" role="presentation"><a class="nav-link" href="<%= response.encodeURL("catalogo/videolezioni.jsp") %>">Videolezioni</a></li>
                    <li class="nav-item" role="presentation"><a class="nav-link" href="<%= response.encodeURL("tutor.jsp") %>">Tutor</a></li>
                </ul>
                <span class="navbar-text actions"> 
                	<a class="login" href="<%= response.encodeURL("login.jsp") %>" style="background-color: rgba(0,0,0,0);">Accedi</a>
                	<button class="btn btn-light action-button" data-bs-hover-animate="tada" type="button" onclick="window.location='<%= response.encodeURL("registrazione.jsp") %>'">Registrati</button>
                </span>
        	</div>
        </div>
    </nav>
    <div class="login-clean" style="background-color: rgba(0,0,0,0.1);background-image: url(&quot;IMG/LoginRegistrazione/sf.jpg&quot;);padding-top: 80px;padding-bottom: 125px;">
        <form class="shadow-lg" method="post" id="login" action="<%= response.encodeURL("login") %>"style="background-color: rgba(255,255,255,0.6);max-width: 450px;min-width: 330px;">
            <div class="illustration" id="headingForm"><img class="img-fluid" src="IMG/LoginRegistrazione/Immagine1.png" style="margin-top: -100px;margin-bottom: -35px;">
                <% if(attempt) { %><div class="alert alert-danger" role="alert" style="font-size: 16px;margin-bottom: 0px;"><button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span></button><span class="text-center" style="font-size: 13px;"><strong>Username e/o password errati</strong>.</span></div> <% } %>
                <% if(error) { %><div class="alert alert-danger" role="alert" style="font-size: 16px;margin-bottom: 0px;"><button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span></button><span class="text-center" style="font-size: 13px;"><strong>Ops! Qualcosa è andato storto</strong>.</span></div> <% } %>
                <% if(notVerify) { %><div class="alert alert-danger" role="alert" style="font-size: 16px;margin-bottom: 0px;"><button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span></button><span class="text-center" style="font-size: 13px;"><strong>L'account non è stato ancora confermato! Premi sul link che hai ricevuto via email</strong>.</span></div> <% } %>
                <% if(banned) { %><div class="alert alert-danger" role="alert" style="font-size: 16px;margin-bottom: 0px;"><button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span></button><span class="text-center" style="font-size: 13px;"><strong>L'account è stato bannato</strong>.</span></div> <% } %>
            </div>
            <div class="form-group"><input class="form-control" type="email" name="email" placeholder="Email"></div>
            <div class="form-group"><input class="form-control" type="password" name="password" placeholder="Password"></div>
            <div class="form-group"><button class="btn btn-primary btn-block" data-bs-hover-animate="tada" type="submit" style="background-color: #16a851;">Accedi</button></div><% if(attempt) { %><a class="forgot" href="#" style="background-color: rgba(0,0,0,0);">Hai dimenticato la password?</a><% } %></form>
    </div>
    <div class="bg-dark footer-basic" style="color: rgb(255,255,255);">
        <footer style="color: rgb(255,255,255);">
            <div class="social"><a data-bs-hover-animate="tada" href="#" style="background-color: rgba(0,0,0,0.1);"><i class="icon ion-social-instagram"></i></a><a data-bs-hover-animate="tada" href="#" style="background-color: rgba(0,0,0,0.1);"><i class="icon ion-social-snapchat"></i></a>
                <a data-bs-hover-animate="tada" href="#" style="background-color: rgba(0,0,0,0);"><i class="icon ion-social-twitter"></i></a><a data-bs-hover-animate="tada" href="#" style="background-color: rgba(0,0,0,0);"><i class="icon ion-social-facebook"></i></a></div>
            <ul class="list-inline">
                <li class="list-inline-item"><a href="<%= response.encodeURL("index") %>" style="background-color: rgba(0,0,0,0);">Home</a></li>
                <li class="list-inline-item"><a href="<%= response.encodeURL("contatti") %>" style="background-color: rgba(0,0,0,0);">Contattaci</a></li>
                <li class="list-inline-item"><a href="<%= response.encodeURL("policy.jsp") %>" style="background-color: rgba(0,0,0,0);">Condizioni d'uso</a></li>
            </ul>
            <p class="copyright">NoteMarket © 2020</p>
        </footer>
    </div>
    <script src="JS/LoginRegistrazione/login.js" charset="utf-8"></script>
    <script src="JS/regExp.js" charset="utf-8"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script>$(document).ready( () => { submitLogin(); });</script>
    <script src="JS/Bootstrap/jquery.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="JS/Bootstrap/bs-init.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/aos/2.1.1/aos.js"></script>
</body>

</html>