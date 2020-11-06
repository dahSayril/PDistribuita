function controlEmail(email) {
	const regExp = /^[a-zA-Z0-9]{1}[.!#$%&'*+/=?^_`{|}~a-zA-Z0-9-]{0,99}@[a-zA-Z0-9]{1,46}\.[a-zA-Z]{2,4}$/;
	return regExp.test(email);
}

function controlPassword(password) {
	const regExp = /^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z]).{8,16}$/;
	return regExp.test(password);
}

function controlNome(nome) {
	const regExp = /^[A-Za-z][a-zA-Z\s]{1,13}[A-Za-z]$/;
	return regExp.test(nome);
}

function controlCognome(cognome) {
	const regExp = /^[A-Za-z][a-zA-Z\s]{1,13}[A-Za-z]$/;
	return regExp.test(cognome);
}