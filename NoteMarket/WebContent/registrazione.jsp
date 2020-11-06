<%@ page import="it.unisa.model.bean.account.Account" %>
<!DOCTYPE html>
<html>
<%
	Account account = (Account) request.getSession().getAttribute("account");
	if(account != null) {
		response.sendRedirect(response.encodeRedirectURL("index"));
		return;
	}
	String error = (request.getParameter("error") == null) ? "" : request.getParameter("error");
	boolean err = (error.equals("")) ? false : true;
	String alertError;
	if(error.equals("emailAlreadyExists")) alertError = "Email già associata ad un account";
	else if(error.equals("notRespectRegEx")) alertError = "Errore nella compilazione di uno/o più campi";
	else if(error.equals("passwordNotEquals")) alertError = "Le password non corrispondono";
	else if(error.equals("dobNotAcceptable")) alertError = "Data di nascita non corretta!";
	else if(error.equals("dobNotAcceptableMin18Years")) alertError = "Devi avere almeno 18 anni per effettuare la registrazione";
	else if(error.equals("useConditionNotAccepted")) alertError = "Devi accetare le condizioni d'uso per proseguire";
	else alertError = "Ops! Qualcosa è andato storto!";
%>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Registrati a NoteMarket</title>
    <link rel="stylesheet" href="CSS/Bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="CSS/Fonts/ionicons.min.css">
    <link rel="stylesheet" href="CSS/Footer/Footer-Basic.css">
    <link rel="stylesheet" href="CSS/Index/Highlight-Phone.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/aos/2.1.1/aos.css">
    <link rel="stylesheet" href="CSS/Menu/Navigation-Menu.css">
    <link rel="stylesheet" href="CSS/Menu/Navigation-with-Button.css">
    <link rel="stylesheet" href="CSS/Index/Team-Clean.css">
    <link rel="stylesheet" href="CSS/LoginRegistrazione/Registration-Form-with-Photo.css">
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
                	<button class="btn btn-light action-button" disabled data-bs-hover-animate="tada" type="button" onclick="window.location='<%= response.encodeURL("registrazione.jsp") %>'">Registrati</button>
                </span>
        	</div>
        </div>
    </nav>
    <div class="register-photo" style="background-image: url(&quot;IMG/LoginRegistrazione/sf.jpg&quot;);background-color: rgb(236,171,1);background-repeat: no-repeat;">
        <div class="form-container" style="margin-top: -45px;">
            <form class="shadow-lg" method="post" id="registrazione" action="<%= response.encodeURL("registrazione") %>" style="opacity: 1;filter: blur(0px);background-color: rgba(255,255,255,0.8);">
                <div id="headingForm">
                	<div class="d-flex justify-content-center align-items-center justify-content-sm-center align-items-sm-center justify-content-md-center align-items-md-center justify-content-lg-center align-items-lg-center justify-content-xl-center align-items-xl-center"
                    	style="margin-top: -75px;margin-bottom: -25px;"><img class="img-fluid d-md-flex d-xl-flex" src="IMG/LoginRegistrazione/Immagine1.png" style="height: 248px;"></div>
                	<% if(err) { %><div class="alert alert-danger text-center" role="alert"><button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span></button><span><strong><%= alertError %></strong>.</span></div> <% } %>
                </div>
                <div class="form-row">
                    <div class="col-12 col-lg-6 col-xl-6">
                        <div class="form-group"><input class="form-control" type="text" data-toggle="tooltip" data-bs-tooltip="" data-placement="bottom" name="name" placeholder="Nome" title="Caratteri consentiti solo lettere. Minimo 3 caratteri, massimo 15. Nel caso di due nomi, specificare solo il primo."></div>
                    </div>
                    <div class="col-12 col-lg-6 col-xl-6">
                        <div class="form-group"><input class="form-control" type="text" data-toggle="tooltip" data-bs-tooltip="" data-placement="bottom" name="surname" placeholder="Cognome" title="Caratteri consentiti solo lettere e spazio. Minimo 3 caratteri, massimo 15. Nel caso di due nomi, specificare solo il primo."></div>
                    </div>
                </div>
                <div class="form-row">
                    <div class="col-12 col-lg-6 col-xl-6">
                        <div class="form-group"><input class="form-control" type="email" data-toggle="tooltip" data-bs-tooltip="" data-placement="bottom" name="email" placeholder="Email" title="Inserisci la tua mail."></div>
                    </div>
                    <div class="col-12 col-lg-6 col-xl-6">
                        <div class="form-group"><input class="form-control" data-toggle="tooltip" data-bs-tooltip="" data-placement="bottom" type="date" name="dob" title="Inserisci la tua data di nascita."></div>
                    </div>
                </div>
                <div class="form-row">
                    <div class="col-12 col-lg-6 col-xl-6">
                        <div class="form-group"><input class="form-control" type="password" data-toggle="tooltip" data-bs-tooltip="" data-placement="bottom" name="password" placeholder="Password" title="La password deve contenere minimo 8 caratteri, massimo 16. Deve includere almeno una lettera minuscola, una maiuscola e un numero."></div>
                    </div>
                    <div class="col">
                        <div class="form-group"><input class="form-control" type="password" data-toggle="tooltip" data-bs-tooltip="" data-placement="bottom" name="password-repeat" placeholder="Ripeti la password" title="Inserisci nuovamente la password."></div>
                    </div>
                </div><label class="d-flex d-sm-flex d-md-flex d-lg-flex d-xl-flex justify-content-center align-items-center justify-content-sm-center align-items-sm-center justify-content-md-center align-items-md-center justify-content-lg-center align-items-lg-center justify-content-xl-center align-items-xl-center">Che tipo di account vuoi creare?</label>
                <div
                    class="form-row text-center" style="margin-bottom: 15px;">
                    <div class="col-12 d-flex d-sm-flex d-md-flex d-lg-flex d-xl-flex flex-column align-items-center flex-sm-row justify-content-sm-center align-items-sm-center flex-md-row justify-content-md-center align-items-md-center flex-lg-row justify-content-lg-center align-items-lg-center flex-xl-row justify-content-xl-center align-items-xl-center">
                        <div class="form-check" data-toggle="tooltip" data-bs-tooltip="" data-placement="bottom" title="Account Acquirente: con questo account puoi acquistare i nostri appunti e videolezioni disponibili nel catalogo. Questo account necessità l'aggiunta di una carta di credito. Per proseguire all'aggiunta della carta di credito, compila il form e premi su &quot;Registrati&quot;."
                            style="width: 200px;"><input class="form-check-input" type="radio" id="formCheck-3" name="tipe" value="acquirente" checked><label class="form-check-label" for="formCheck-3">Acquirente<br></label></div>
                        <div class="form-check" data-toggle="tooltip" data-bs-tooltip="" data-placement="bottom"
                            title="Account Venditore: con questo account potrai da subito vendere i tuoi appunti sul sito. Ricordiamo che tutte le vendite, prima di essere caricate sul catalogo, devono essere approvate da un Moderatore." style="width: 200px;"><input class="form-check-input" type="radio" id="formCheck-4" name="tipe" value="venditore"><label class="form-check-label" for="formCheck-4">Venditore<br></label></div>
                    </div>
        		</div>
        	<div class="form-group d-sm-flex justify-content-sm-center align-items-sm-center"><input type="checkbox" name="policy"><a href="<%= response.encodeURL("policy.jsp") %>" style="color: rgb(120,131,142);margin-left: 10px;background-color: rgba(0,0,0,0);">Accetto le condizioni d'uso.</a></div>
        <div class="form-group"><button class="btn btn-primary btn-block" data-bs-hover-animate="tada" type="submit" style="background-color: #16a851;margin-top: 0px;">Registrati</button></div><a class="already" href="<%= response.encodeURL("login.jsp") %>" style="background-color: rgba(0,0,0,0);">Hai già un account? Clicca qui per accedere.</a></form>
    </div>
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
    <script src="JS/regExp.js"></script>
    <script src="JS/LoginRegistrazione/registrazione.js" charset="utf-8"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script>$(document).ready( () => { submitRegistrati(); });</script>
    <script src="JS/Bootstrap/jquery.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="JS/Bootstrap/bs-init.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/aos/2.1.1/aos.js"></script>
</body>

</html>