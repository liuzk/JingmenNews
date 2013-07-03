package cn.com.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.com.common.BaseAction;
import cn.com.common.JsonUtil;
import cn.com.entity.FsNews1;
import cn.com.entity.FsNewsClass;
import cn.com.entity.SimpleNews;
import cn.com.service.impl.FsNews1Service;
import cn.com.service.impl.FsNewsClassService;
import cn.com.service.impl.SimpleNewsService;

@Controller
@Scope("prototype")
@ParentPackage(value = "default-package")
public class NewsAction extends BaseAction {

	private static final long serialVersionUID = -9186829218527940722L;

	// @Resource(name = "fsNewsService")
	// private FsNewsService fsNewsService;

	// FS_NEWS的视图FS_NEWS_1
	@Resource(name = "fsNews1Service")
	private FsNews1Service fsNews1Service;

	@Resource(name = "fsNewsClassService")
	private FsNewsClassService fsNewsClassService;

	@Resource(name = "simpleNewsService")
	private SimpleNewsService simpleNewsService;

	private String newsId; // 新闻id
	private long id;

	private String classEname; // 栏目英文名
	private int num; // 取前num条数据

	private int pageNum; // 分页所在页
	private int pageSize; // 分页大小

	@Action("getNews")
	public String getNews1() throws Exception {
		FsNews1 fsNews1 = fsNews1Service.queryById(FsNews1.class, id);
		response.setCharacterEncoding("utf-8");
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			pw.write(JsonUtil.object2json(fsNews1));
		} catch (IOException e) {
			return null;
		}
		pw.flush();
		pw.close();
		return null;
	}

	/**
	 * 参数 :pageNum,pageSize,classEname 功能simplenews的分页查询
	 * 
	 * @return
	 * @throws Exception
	 */
	@Action("getPageResult")
	public String getPageResult() throws Exception {
		List<SimpleNews> list = new ArrayList<SimpleNews>();
		list = simpleNewsService.createQuery(SimpleNews.class,
				"where audittf=1 and ClassEname='" + classEname
						+ "' order by adddate desc", pageNum, pageSize);
		response.setCharacterEncoding("utf-8");
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			pw.write(JsonUtil.list2json(list));
		} catch (IOException e) {
			return null;
		}
		pw.flush();
		pw.close();
		return null;
	}

	/**
	 * 参数 :pageNum,pageSize=30,classEname 功能simplenews的分页查询
	 * 
	 * @return
	 * @throws Exception
	 */
	@Action("getPageResult30")
	public String getPageResult30() throws Exception {
		List<SimpleNews> list = new ArrayList<SimpleNews>();
		list = simpleNewsService.createQuery(SimpleNews.class,
				"where audittf=1 and ClassEname='" + classEname
						+ "' order by adddate desc", pageNum, 30);
		response.setCharacterEncoding("utf-8");
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			pw.write(JsonUtil.list2json(list));
		} catch (IOException e) {
			return null;
		}
		pw.flush();
		pw.close();
		return null;
	}

	@Action("getNews1OneNewsTop30")
	public String getNews1OneNewsTop30() throws Exception {
		List<SimpleNews> list = new ArrayList<SimpleNews>();
		list = simpleNewsService
				.createQuery(
						SimpleNews.class,
						"where ParentId='07112109321626936' and audittf=1 order by addDate",
						0, 30);
		response.setCharacterEncoding("utf-8");
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			pw.write(JsonUtil.list2json(list));
		} catch (IOException e) {
			return null;
		}
		pw.flush();
		pw.close();
		return null;
	}

	@Action("getAllNewsClass")
	public String getAllNewsClass() throws Exception {
		List<FsNewsClass> list = new ArrayList<FsNewsClass>();
		list = fsNewsClassService.findAll(FsNewsClass.class);
		response.setCharacterEncoding("utf-8");
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			pw.write(JsonUtil.list2json(list));
		} catch (IOException e) {
			return null;
		}
		pw.flush();
		pw.close();
		return null;
	}

	public String getNewsId() {
		return newsId;
	}

	public void setNewsId(String newsId) {
		this.newsId = newsId;
	}

	public String getclassEname() {
		return classEname;
	}

	public void setclassEname(String classEname) {
		this.classEname = classEname;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getClassEname() {
		return classEname;
	}

	public void setClassEname(String classEname) {
		this.classEname = classEname;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
