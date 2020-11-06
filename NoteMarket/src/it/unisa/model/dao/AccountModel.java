package it.unisa.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import it.unisa.model.DriverManagerConnectionPool;
import it.unisa.model.bean.account.Account;
import it.unisa.model.bean.account.Account.Stato;
import it.unisa.model.bean.account.Acquirente;
import it.unisa.model.bean.account.Venditore;

public class AccountModel implements DataAccessObject <Account> {

	public Account doRetrieveByKey(String code) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String selectSQL = "SELECT * FROM " + nomeTabella + " WHERE email = ?";		
		
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement(selectSQL);
			ps.setString(1, code);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				String email = code;
				String password = rs.getString("password");
				String nome = rs.getString("nome");
				String cognome = rs.getString("cognome");
				Date dataDiNascita = rs.getDate("dataDiNascita");
				byte[] fotoProfilo = rs.getBytes("fotoProfilo");
				String statoString = rs.getString("stato");
				Stato stato = statoString.equals("verificato") ? Stato.verificato : 
					statoString.equals("daVerificare") ? Stato.daVerificare : Stato.bannato;
				ps.close();
				rs.close();
			
				if(isAcquirente(code)) {
					Acquirente tmp = new Acquirente(
							email, password, nome, cognome, dataDiNascita, fotoProfilo);
					tmp.setStato(stato);
					CartaDiCreditoModel model = new CartaDiCreditoModel();
					tmp.setCarteDiCredito(model.doRetriveAllOfUser(code, null));
					return tmp;
				}
			
				else if(isVenditore(code)) {
					selectSQL = "SELECT saldo FROM Venditore WHERE email = ?";
					ps = con.prepareStatement(selectSQL);
					ps.setString(1, code);
					rs = ps.executeQuery();
					Venditore tmp = new Venditore(
							email, password, nome, cognome, dataDiNascita, fotoProfilo);
					tmp.setStato(stato);
					tmp.setSaldo(rs.getDouble("saldo"));
					return tmp;
				}
				
			} return null;
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if (ps != null) ps.close();
			} finally { DriverManagerConnectionPool.releaseConnection(con); }
		} 
		
		return null;
	}

	public Collection <Account> doRetriveAll(String order) throws SQLException {
		return null;
	}

	public Collection <Account> doRetriveAllVerifyTimeout() throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList <Account> accountsVerifyTimeout = new ArrayList <Account> ();
		String selectSQL = "SELECT * FROM " + nomeTabella + " WHERE dataDiCreazione + INTERVAL 1 DAY <= NOW() AND stato = ?";
		
		try {
			
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement(selectSQL);
			ps.setString(1, Stato.daVerificare.toString());
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Acquirente tmp = new Acquirente();
				tmp.setEmail(rs.getString("email"));
				accountsVerifyTimeout.add(tmp);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if (ps != null) ps.close();
			} finally { DriverManagerConnectionPool.releaseConnection(con); }
		} 
	
		return accountsVerifyTimeout;
								
	}
	
	public void doSave(Account parameter) throws SQLException {
		
	}

	public void doUpdate(Account parameter) throws SQLException {
		
	}
	
	public void doDelete(Account parameter) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		String deleteSQL = "DELETE FROM " + nomeTabella + " WHERE email = ?";
		
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement(deleteSQL);
			ps.setString(1, parameter.getEmail());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if (ps != null) ps.close();
			} finally { DriverManagerConnectionPool.releaseConnection(con); }
		}
	}
	
	public boolean login(String email, String password) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String selectSQL = "SELECT * FROM " + nomeTabella + " WHERE email = ? AND BINARY password = ?";
		
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement(selectSQL);
			ps.setString(1, email);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if(rs.next()) return true;
			else return false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if (ps != null) ps.close();
			} finally { DriverManagerConnectionPool.releaseConnection(con); }
		} 
		
		return false;
		
	}
	
	private boolean isAcquirente(String code) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String selectSQL = "SELECT * FROM Acquirente WHERE email = ?";
				
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement(selectSQL);
			ps.setString(1, code);
			rs = ps.executeQuery();
			if(rs.next()) return true; 
			else return false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if (ps != null) ps.close();
			} finally { DriverManagerConnectionPool.releaseConnection(con); }
		} 
		
		return false;
		
	}
	
	private boolean isVenditore(String code) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String selectSQL = "SELECT * FROM Venditore WHERE email = ?";
				
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement(selectSQL);
			ps.setString(1, code);
			rs = ps.executeQuery();
			if(rs.next()) return true; 
			else return false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if (ps != null) ps.close();
			} finally { DriverManagerConnectionPool.releaseConnection(con); }
		} 
		
		return false;
		
	}
	
	public boolean emailAlredyExists(String code) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String selectSQL = "SELECT email FROM " + nomeTabella + " WHERE email = ?";
		
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement(selectSQL);
			ps.setString(1,  code);
			rs = ps.executeQuery();
			if(rs.next()) return true;
			else return false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if (ps != null) ps.close();
			} finally { DriverManagerConnectionPool.releaseConnection(con); }
		} return false;
		
	}
	
	private String nomeTabella = "Account";
	
}
