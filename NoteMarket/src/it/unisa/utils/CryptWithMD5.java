package it.unisa.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CryptWithMD5 {
	   
	private static MessageDigest md;

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	
		System.out.println("Inserisci la password: ");
		String password = in.nextLine();
		System.out.println("La tua password cryptata è: " + CryptWithMD5.cryptWithMD5(password));
		
		in.close();
		
	}
	
	public static String cryptWithMD5(String pass) {
	 
	   try {
	       
		   md = MessageDigest.getInstance("MD5");
	       byte[] passBytes = pass.getBytes();
	       md.reset();
	
	       byte[] digested = md.digest(passBytes);
	       StringBuffer sb = new StringBuffer();
	       
	       for(int i=0;i<digested.length;i++)
	            sb.append(Integer.toHexString(0xff & digested[i]));
	       
	       
	       return sb.toString();
	    
	   } catch (NoSuchAlgorithmException ex) {
	        Logger.getLogger(CryptWithMD5.class.getName()).log(Level.SEVERE, null, ex);
	    }
	        
	   return null;

	}

}
