package cn.com.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "FS_News_1", schema = "dbo", catalog = "jmrb")
public class SimpleNews implements Serializable {

	/**
	 * 简易News，用于最外层列表用
	 */
	private static final long serialVersionUID = -4006423739807988579L;
	private long id;
	private String newsId;
	private String title;
	private String subTitle;
	private String content;
	private Date addDate;
	private String picPath;

	public SimpleNews() {
	}

	public SimpleNews(long id) {
		this.id = id;
	}

	public SimpleNews(long id, String newsId, String title, String subTitle,
			String content, Date addDate, String picPath) {
		this.id = id;
		this.newsId = newsId;
		this.title = title;
		this.subTitle = subTitle;
		this.content = content;
		this.addDate = addDate;
		this.picPath = picPath;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "NewsID", nullable = false)
	public String getNewsId() {
		return this.newsId;
	}

	public void setNewsId(String newsId) {
		this.newsId = newsId;
	}

	@Column(name = "Title", nullable = false)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "SubTitle")
	public String getSubTitle() {
		return this.subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	@Column(name = "Content")
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "AddDate", nullable = false, length = 23)
	public Date getAddDate() {
		return this.addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	@Column(name = "PicPath")
	public String getPicPath() {
		return this.picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
}
