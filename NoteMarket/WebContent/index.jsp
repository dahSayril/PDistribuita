<%@ page import="it.unisa.model.bean.account.Account" %>
<!DOCTYPE html>
<html>
<%
	Account account = (Account) request.getSession().getAttribute("account");
	if(account != null) {
		request.getRequestDispatcher("index").forward(request, response);
		return;
	}
%>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>NoteMarket</title>
    <link rel="stylesheet" href="CSS/Bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="CSS/Fonts/ionicons.min.css">
    <link rel="stylesheet" href="CSS/Footer/Footer-Basic.css">
    <link rel="stylesheet" href="CSS/Index/Highlight-Phone.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/aos/2.1.1/aos.css">
    <link rel="stylesheet" href="CSS/Menu/Navigation-Menu.css">
    <link rel="stylesheet" href="CSS/Menu/Navigation-with-Button.css">
    <link rel="stylesheet" href="CSS/Index/Team-Clean.css">
    <link rel="icon" href="IMG/icon.ico">
</head>

<body style="background-color: #343a40;">
	<nav class="navbar navbar-light navbar-expand-lg sticky-top navigation-clean-button">
        <div class="container-fluid"><img src="IMG/Menu/logo.png" style="width: 200px;"><button data-toggle="collapse" class="navbar-toggler" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
            <div class="collapse navbar-collapse"
                id="navcol-1" style="margin-top: 0px;">
                <ul class="nav navbar-nav mr-auto" style="margin-top: -15px;">
                    <li class="nav-item" role="presentation" style="color: rgb(0,0,0);"><a class="nav-link active" href="<%= response.encodeURL("index") %>">Home</a></li>
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
    <div class="highlight-phone" style="background-color: rgba(255,255,255,0.4);padding: 0px;">
        <div class="container-fluid">
            <div class="row">
                <div class="col-auto col-lg-6 col-xl-6 d-none d-print-inline d-sm-none d-md-none d-lg-inline d-xl-inline" style="padding: 0px;"><img class="img-fluid" src="IMG/Index/donna.jpg"></div>
                <div class="col-lg-6 col-xl-6 d-flex d-sm-flex d-md-flex d-lg-flex d-xl-flex justify-content-center align-items-center justify-content-sm-center align-items-sm-center justify-content-md-center align-items-md-center justify-content-lg-center align-items-lg-center justify-content-xl-center align-items-xl-center"
                    style="background-color: #f9b401;">
                    <div class="text-center intro" style="padding-bottom: 10px;">
                        <h2 class="display-4 text-center" style="color: rgb(255,255,255);font-size: 43px;">Compra e vendi appunti online<br></h2>
                        <p style="color: rgb(255,255,255);">Studiare non è mai stato così semplice.<br>Crea un account per poter caricare i tuoi riassunti, i tuoi schemi o le tue presentazioni, oppure creane uno per poter acquistare quelle degli altri!<br></p><a class="btn btn-primary"
                            role="button" data-bs-hover-animate="tada" href="<%= response.encodeURL("registrazione.jsp") %>" style="background-color: #16a851;">REGISTRATI</a></div>
                </div>
            </div>
        </div>
    </div>
    <div class="highlight-phone" style="background-color: rgba(255,255,255,0.4);padding: 0px;">
        <div class="container-fluid">
            <div class="row" style="background-color: #4a0bf7;">
                <div class="col-auto col-lg-8 col-xl-9 d-lg-flex d-xl-flex justify-content-lg-center align-items-lg-center justify-content-xl-center align-items-xl-center" style="padding: 0px;">
                    <div>
                        <h2 class="display-4 text-center text-lg-left text-xl-left" style="padding-top: 10px;padding-left: 10px;padding-bottom: 10px;color: rgb(255,255,255);padding-right: 10px;font-size: 43px;">Perchè NoteMarket?</h2>
                        <p class="text-center text-lg-left text-xl-left" style="padding-right: 10px;padding-bottom: 0px;padding-left: 10px;color: rgb(255,255,255);">Ti è mai capitato di dover studiare per un'esame da slides scadenti, seguire lezioni di professori che non riescono a tener vivo il tuo interesse, per poi ritrovarti con dei pessimi appunti e una voglia pari a zero? No, non ti
                            abbiamo spiato. Abbiamo creato NoteMarket proprio per questo, per aiutare coloro che vogliono imparare ma che non sono messi in condizione per farlo.<br></p>
                    </div>
                </div>
                <div class="col d-none d-lg-inline d-xl-inline"><img class="img-fluid" src="IMG/Index/scocciato.png" style="padding: 10px;"></div>
            </div>
        </div>
    </div>
    <div class="highlight-phone" style="background-color: rgba(255,255,255,0.4);padding: 0px;">
        <div class="container-fluid">
            <div class="row" style="background-color: #ffffff;">
                <div class="col d-none d-lg-inline d-xl-inline"><img class="img-fluid" src="IMG/Index/equilibrio.png" style="padding: 10px;width: 425px;"></div>
                <div class="col-auto col-lg-8 col-xl-7 d-lg-flex d-xl-flex justify-content-lg-center align-items-lg-center justify-content-xl-center align-items-xl-center"
                    style="padding: 0px;">
                    <div>
                        <h2 class="display-4 text-center text-lg-right text-xl-right" style="padding-top: 10px;padding-left: 10px;padding-bottom: 10px;color: rgb(0,0,0);padding-right: 10px;font-size: 43px;">...Quindi è un sito per Universitari?</h2>
                        <p class="text-center text-lg-right text-xl-right" style="padding-right: 10px;padding-bottom: 0px;padding-left: 10px;color: rgb(0,0,0);">Non solo! Le risorse che si trovano sul sito sono molto utili anche a coloro che intendono seguire un percorso da autodidatta, ma anche a chi si sveglia la mattina con la voglia di imparare qualocosa!<br>La conoscenza è di tutti,
                            universitari e non.<br></p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="highlight-phone" style="background-color: rgba(255,255,255,0.4);padding: 0px;">
        <div class="container-fluid">
            <div class="row" style="background-color: #ffffff;">
                <div class="col-12 col-lg-6 col-xl-6 d-flex d-lg-flex d-xl-flex flex-column justify-content-center align-items-center justify-content-sm-center align-items-sm-center justify-content-md-center align-items-md-center justify-content-lg-center align-items-lg-center align-items-xl-center"
                    style="background-color: #16a851;">
                    <h2 class="display-4 text-center" style="color: rgb(255,255,255);padding: 10px;font-size: 43px;">Qualità garantita.</h2>
                    <p class="text-center" style="color: rgb(255,255,255);padding: 10px;font-size: 23px;">Ovviamente non tutto ciò che ci viene spedito viene caricato: Tutto il materiale che ci arriva viene sottoposto a revisione, e solo ciò che riesce a superare i nostri controlli restrittivi viene messo in vendita.<br></p><img class="img-fluid d-lg-flex d-xl-flex"
                        src="IMG/Index/quality.png" style="width: 400px;height: 150px;padding: 10px;margin-bottom: 20px;margin-top: 30px;"></div>
                <div class="col-12 col-lg-6 col-xl-6" style="background-color: #9852f9;">
                    <h2 class="display-4 text-center" style="color: rgb(255,255,255);padding: 10px;font-size: 43px;">Tutor competenti.</h2>
                    <p class="text-center" style="color: rgb(255,255,255);padding: 10px;font-size: 23px;">I nostri Tutor sono persone specializzate negli argomenti che trattano. Sono scelti accuratamente in modo da garantire non solo professionalità ma anche varietà di metodi.Di solito sono gli studenti a doversi adattare ai professori.
                        Stavolta sta a te scegliere chi fa al caso tuo (e i voti li dai tu!).<br></p><img class="img-fluid float-right" data-aos="slide-left" data-aos-duration="1700" src="IMG/Index/revision.png" style="width: 565px;margin-bottom: 30px;margin-right: -20px;"></div>
            </div>
        </div>
    </div>
    <div class="team-clean">
        <div class="container-fluid">
            <div class="intro">
                <h2 class="text-center">Il Nostro Team</h2>
            </div>
            <div class="row d-flex flex-row justify-content-sm-center align-items-sm-center justify-content-md-center align-items-md-center people" style="margin-top: -70px;">
                <div class="col-sm-6 col-md-6 col-lg-4 item"><img class="rounded-circle" src="">
                    <h3 class="name">Antonio Cirillo</h3>
                </div>
                <div class="col-sm-6 col-md-6 col-lg-4 item"><img class="rounded-circle" src="">
                    <h3 class="name">Mario De Riggi</h3>
                </div>
                <div class="col-sm-6 col-md-6 col-lg-4 item"><img class="rounded-circle" src="">
                    <h3 class="name">Carmine Amendola</h3>
                </div>
            </div>
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
    <script src="JS/Bootstrap/jquery.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="JS/Bootstrap/bs-init.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/aos/2.1.1/aos.js"></script>
</body>

</html>