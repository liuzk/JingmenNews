package cn.com.test;

import java.io.IOException;

public class BatTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// String cmd = "cmd /c start D:\\JAVA\\Tomcat\\bin\\restart.bat";
		String cmd = "cmd /c start c:\\java\\apache-tomcat-6.0.36\\bin\\restart.bat";
		try {
			Process ps = Runtime.getRuntime().exec(cmd);
			ps.waitFor();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
