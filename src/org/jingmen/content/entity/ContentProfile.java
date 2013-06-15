package org.jingmen.content.entity;

public class ContentProfile {
	private String title; // 标题
	private String summary; // 摘要
	private String image; // 图片链接
	private String time; // 发布时间
	private String author; // 作者
	private String fromSite; // 来源
	private String content; // 内容

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getFromSite() {
		return fromSite;
	}

	public void setFromSite(String fromSite) {
		this.fromSite = fromSite;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
