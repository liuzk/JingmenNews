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

	// FS_NEWS的视图
	@Resource(name = "fsNews1Service")
	private FsNews1Service fsNews1Service;

	@Resource(name = "fsNewsClassService")
	private FsNewsClassService fsNewsClassService;

	@Resource(name = "simpleNewsService")
	private SimpleNewsService simpleNewsService;

	private String newsId; // 新闻id

	private String classEname; // 栏目英文名
	private Integer num; // 取前num条数据

	private Integer pageNum; // 分页所在页
	private Integer pageSize; // 分页大小

	/**
	 * 通过参数获取classEname的前num条数据 必要的参数classEname，num
	 * 
	 * @return json
	 * @throws Exception
	 */
	@Action
	public String getTopByParam() throws Exception {
		List<FsNews1> list = new ArrayList<FsNews1>();
		if (null == classEname || "".equals(classEname) || null == num
				|| num < 1)
			return null;
		list = fsNews1Service.createQuery(FsNews1.class,
				"where audittf=1 and ClassEname='" + classEname
						+ "' and rownum<=" + num + " order by adddate desc");
		response.setCharacterEncoding("utf-8");
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			System.out.println(JsonUtil.list2json(list));
			pw.write(JsonUtil.list2json(list));
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
	@Action
	public String getPageResult() throws Exception {
		List<SimpleNews> list = new ArrayList<SimpleNews>();
		list = simpleNewsService.createQuery(SimpleNews.class,
				"where audittf=1 and ClassEname='" + classEname
						+ "' and rownum<=" + num + " order by adddate desc",
				pageNum, pageSize);
		response.setCharacterEncoding("utf-8");
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			System.out.println(JsonUtil.list2json(list));
			pw.write(JsonUtil.list2json(list));
		} catch (IOException e) {
			return null;
		}
		pw.flush();
		pw.close();
		return null;
	}

	@Action
	public String getNews1OneNewsTop30() throws Exception {
		List<FsNews1> list = new ArrayList<FsNews1>();
		list = fsNews1Service.getOneNewsTop30(FsNews1.class);
		response.setCharacterEncoding("utf-8");
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			System.out.println(JsonUtil.list2json(list));
			pw.write(JsonUtil.list2json(list));
		} catch (IOException e) {
			return null;
		}
		pw.flush();
		pw.close();
		return null;
	}

	@Action
	public String getNews() throws Exception {
		List<FsNews1> list = new ArrayList<FsNews1>();
		list = fsNews1Service.findAll(FsNews1.class);
		response.setCharacterEncoding("utf-8");
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			System.out.println(JsonUtil.list2json(list));
			pw.write(JsonUtil.list2json(list));
		} catch (IOException e) {
			return null;
		}
		pw.flush();
		pw.close();
		return null;
	}

	@Action
	public String getNewsClass() throws Exception {
		List<FsNewsClass> list = new ArrayList<FsNewsClass>();
		list = fsNewsClassService.findAll(FsNewsClass.class);
		response.setCharacterEncoding("utf-8");
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			System.out.println(JsonUtil.list2json(list));
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

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

}
