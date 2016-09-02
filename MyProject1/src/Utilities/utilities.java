package Utilities;

import java.lang.reflect.Method;

public class utilities {

	public static void Gmail_Link() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Gmail Execution begins");
		String strone = "GmailScript.Browser";
		String methodname = "browser1";
		Class cls = Class.forName(strone);
		Method m = cls.getDeclaredMethod(methodname);
		m.invoke(cls.getClass());
	}
	
	public static void Gmaillogin() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Gmail Execution begins");
		String strone = "GmailScript.Login";
		String methodname = "login1";
		Class cls = Class.forName(strone);
		Method m = cls.getDeclaredMethod(methodname);
		m.invoke(cls.getClass());
	}

}
