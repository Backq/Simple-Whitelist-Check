package me.back.tut;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JOptionPane;

import me.back.tut.Utils.Wrapper;

/**
 * 
 * @author Judge
 * 
 * [IT] Questo è un semplice whitelist check, quindi non giudicate lol.
 * Forse farò qualche update aggiungendo più checks.
 * | QUESTO CHECK PUò ESSERE BYPASSATO SE NON SAI COME MIGLIORARLO E COME SPOOFARE/ENCRYPTARE LA REQUEST |
 * 
 * [EN] This is a simple whitelist check, so don't judge lol. 
 * Maybe I'll update the source with more checks. 
 * | THIS SIMPLE CHECK CAN BE BYPASSED IF YOU DON'T KNOW HOW TO IMPROVE IT AND HOW TO SPOOF/ENCRYPT THE REQUEST |
 *
 */

public class Main {
	
	public static void main(String[] args) {
		checkAuth(new String(Wrapper.url));
	}
	
	public static void checkAuth(String website) {
		try {	    
	           final URL url = new URL(website);
	           final URLConnection connection = url.openConnection();
	           connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
	           final BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	           if (reader.readLine().equals(new String(Wrapper.str))) {
	        		  Wrapper.msgBox("Whitelisted", "Simple Auth", JOptionPane.INFORMATION_MESSAGE);  
	                } else {
	                  Wrapper.msgBox("You're not whitelisted", "Error", JOptionPane.ERROR_MESSAGE);
	                  //[IT] Non è sicuro mettere system.exit subito dopo il fail del check, può essere rimosso facilmente.	                  
	                  //[EN] Isn't safe put system.exit after the check, it can be easily removed.
	                  System.exit(0);
	            }
	        }
	        catch (Exception xxx) { xxx.printStackTrace(); }
	}

}
