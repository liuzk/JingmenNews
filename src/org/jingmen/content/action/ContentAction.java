package org.jingmen.content.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.common.BaseAction;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.util.JsonUtil;

public class ContentAction extends BaseAction {

	private static final long serialVersionUID = -3457705972078765750L;

	private static final String JINGMEN_MAINPAGE_URL = "http://www.jmnews.cn/";
	private static final String JINGMEN_NEWS_URL = "http://www.jmnews.cn/html/zhengw/index.html";

	private List list;
	private Map map;

	@Action("getCategory")
	public String getCategory() throws Exception {
		Document doc = Jsoup.connect(JINGMEN_NEWS_URL).get();
		Element content = doc.getElementById("zh_nav_left1");
		Elements links = content.getElementsByTag("li");
		if (null == map)
			map = new HashMap();
		for (Element _link : links) {
			Element link = _link.getElementsByTag("a").first();
			String key = link.text();
			String value = link.attr("href");
			map.put(key, value);
		}

		response.setCharacterEncoding("utf-8");
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			System.out.println(JsonUtil.map2json(map));
			pw.write(JsonUtil.map2json(map));
		} catch (IOException e) {
			return null;
		}
		pw.flush();
		pw.close();
		return null;
	}

	public String getArticleList(String url) throws Exception {
		Document doc = Jsoup.connect(JINGMEN_NEWS_URL).get();
		Element content = doc.getElementById("zh_nav_left1");
		Elements links = content.getElementsByTag("li");
		if (null == map)
			map = new HashMap();
		for (Element _link : links) {
			Element link = _link.getElementsByTag("a").first();
			String key = link.text();
			String value = link.attr("href");
			map.put(key, value);
		}

		response.setCharacterEncoding("utf-8");
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			System.out.println(JsonUtil.map2json(map));
			pw.write(JsonUtil.map2json(map));
		} catch (IOException e) {
			return null;
		}
		pw.flush();
		pw.close();
		return null;
	}

	public List getList() {
		return list;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public void setList(List list) {
		this.list = list;
	}

}
