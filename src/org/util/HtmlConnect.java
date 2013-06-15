package org.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class HtmlConnect {

	public static String getHtml(String _url) throws Exception {
		/**//** 输入流 */
		BufferedReader in = null;
		StringBuffer sb = new StringBuffer();
		URL url = null;
		try {
			url = new URL(_url);
			in = new BufferedReader(new InputStreamReader(url.openStream(),
					"gb2312"));
			String str = null;
			while ((str = in.readLine()) != null) {
				sb.append(str);
			}
		} catch (Exception ex) {
			return null;
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				return null;
			}
		}
		String result = sb.toString();
		return result;
	}
}
