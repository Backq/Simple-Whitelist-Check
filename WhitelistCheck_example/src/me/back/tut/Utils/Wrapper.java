package me.back.tut.Utils;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Wrapper {
	
	public static byte[] url = new byte[] {104,
			116,
			116,
			112,
			115,
			58,
			47,
			47,
			112,
			97,
			115,
			116,
			101,
			98,
			105,
			110,
			46,
			99,
			111,
			109,
			47,
			114,
			97,
			119,
			47,
			52,
			48,
			54,
			76,
			115,
			81,
			106,
			81};
	
	public static byte[] str = new byte[] {64,
			109,
			111,
			98,
			108,
			101,
			97,
			107,
			115};
	
	public static void strToBytes(String str) {
		for(byte byt : str.getBytes()) {
			System.out.println(byt);
		}
	}
	
	public static void msgBox(String msg, String title, int mode) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
			JOptionPane.showMessageDialog(null, msg, title, mode);
		 } catch (ClassNotFoundException exc) {} catch (InstantiationException exxxc) {} catch (IllegalAccessException excc) {} catch (UnsupportedLookAndFeelException ex) {}
	}

}
