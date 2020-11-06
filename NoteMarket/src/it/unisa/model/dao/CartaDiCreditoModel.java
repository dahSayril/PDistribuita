package it.unisa.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import it.unisa.model.DriverManagerConnectionPool;

import it.unisa.model.bean.account.CartaDiCredito;

public class CartaDiCreditoModel implements DataAccessObject <CartaDiCredito> {

	public CartaDiCredito doRetrieveByKey(String code) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		CartaDiCredito cartaDiCredito = null;
		String selectSQL = "SELECT * FROM " + nomeTabella + " WHERE numero = ?";
		
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement(selectSQL);
			ps.setString(1, code);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				cartaDiCredito = new CartaDiCredito();
				cartaDiCredito.setNumero(rs.getString("numero"));
				cartaDiCredito.setNomeIntestatario(rs.getString("nomeIntestatario"));
				cartaDiCredito.setDataDiScadenza(rs.getDate("dataDiScadenza"));
				return cartaDiCredito;			
			} return cartaDiCredito;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if (ps != null) ps.close();
			} finally { DriverManagerConnectionPool.releaseConnection(con); }
		}
		
		return cartaDiCredito;
	}

	public Collection <CartaDiCredito> doRetriveAll(String order) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList <CartaDiCredito> carteDiCredito = new ArrayList <CartaDiCredito> ();
		String selectSQL = "SELECT * FROM " + nomeTabella;
		if(order != null && !order.equals("")) {
			selectSQL += " ORDER BY " + order;
		}
		
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement(selectSQL);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String nomeIntestatario = rs.getString("nomeIntestatario");
				String numero = rs.getString("numero");
				Date dataDiScadenza = rs.getDate("dataDiScadenza");
				CartaDiCredito tmp = new CartaDiCredito(nomeIntestatario, numero, dataDiScadenza);
				carteDiCredito.add(tmp);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if (ps != null) ps.close();
			} finally { DriverManagerConnectionPool.releaseConnection(con); }
		}
		
		return carteDiCredito;
		
	}

	public ArrayList <CartaDiCredito> doRetriveAllOfUser(String code, String order) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList <CartaDiCredito> carteDiCredito = new ArrayList <CartaDiCredito> ();
		String selectSQL = "SELECT * FROM " + nomeTabella + " WHERE email = ?";
		if(order != null && !order.equals("")) {
			selectSQL += " ORDER BY " + order;
		}
		
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement(selectSQL);
			ps.setString(1, code);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String nomeIntestatario = rs.getString("nomeIntestatario");
				String numero = rs.getString("numero");
				Date dataDiScadenza = rs.getDate("dataDiScadenza");
				CartaDiCredito tmp = new CartaDiCredito(nomeIntestatario, numero, dataDiScadenza);
				carteDiCredito.add(tmp);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if (ps != null) ps.close();
			} finally { DriverManagerConnectionPool.releaseConnection(con); }
		}
		
		return carteDiCredito;
	}
	
	@Deprecated
	public void doSave(CartaDiCredito parameter) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;;
		String numero = parameter.getNumero();
		String nomeIntestatario = parameter.getNomeIntestatario();
		Date dataDiScadenza = parameter.getDataDiScadenza();
		String insertSQL = "INSERT INTO CartaDiCredito (nomeIntestatario, numero, dataDiScadenza) VALUES (?, ?, ?)";
		
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement(insertSQL);
			ps.setString(1, nomeIntestatario);
			ps.setString(2, numero);
			ps.setDate(3, new java.sql.Date(dataDiScadenza.getTime()));
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if (ps != null) ps.close();
			} finally { DriverManagerConnectionPool.releaseConnection(con); }
		}
	}

	public void doSave(CartaDiCredito parameter, String code) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;;
		String numero = parameter.getNumero();
		String nomeIntestatario = parameter.getNomeIntestatario();
		Date dataDiScadenza = parameter.getDataDiScadenza();
		String insertSQL = "INSERT INTO CartaDiCredito VALUES (?, ?, ?, ?)";
		
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement(insertSQL);
			ps.setString(1, code);
			ps.setString(2, nomeIntestatario);
			ps.setString(3, numero);
			ps.setDate(4, new java.sql.Date(dataDiScadenza.getTime()));
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if (ps != null) ps.close();
			} finally { DriverManagerConnectionPool.releaseConnection(con); }
		}
	}
	
	public void doUpdate(CartaDiCredito parameter) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		String updateSQL = "UPDATE " + nomeTabella + " SET nomeIntestatario = ?, dataDiScadenza = ? WHERE numero = ?";	
		
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement(updateSQL);
			ps.setString(1, parameter.getNomeIntestatario());
			ps.setDate(2, new java.sql.Date(parameter.getDataDiScadenza().getTime()));
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if (ps != null) ps.close();
			} finally { DriverManagerConnectionPool.releaseConnection(con); }
		}
	
	}

	public void doDelete(CartaDiCredito parameter) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		String deleteSQL = "DELETE FROM " + nomeTabella + " WHERE numero = ?";
		
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement(deleteSQL);
			ps.setString(1, parameter.getNumero());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if (ps != null) ps.close();
			} finally { DriverManagerConnectionPool.releaseConnection(con); }
		}
	}

	private String nomeTabella = "CartaDiCredito";
	
}
