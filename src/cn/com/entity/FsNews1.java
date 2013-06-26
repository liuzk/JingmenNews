package cn.com.entity;

// Generated 2013-6-23 21:31:27 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 表FS_NEWS的视图
 */
@Entity
@Table(name = "FS_News_1", schema = "dbo", catalog = "jmrb")
public class FsNews1 implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8634862804985630609L;
	private long id;
	private String newsId;
	private String title;
	private String subTitle;
	private String titleStyle;
	private String classId;
	private short headNewsTf;
	private String headNewsPath;
	private String content;
	private short manuTf;
	private String fileName;
	private String fileExtName;
	private String path;
	private Date addDate;
	private String keyWords;
	private String txtSource;
	private String author;
	private String editer;
	private int clickNum;
	private short recTf;
	private short picNewsTf;
	private String picPath;
	private String naviWords;
	private short auditTf;
	private short delTf;
	private Date delTime;
	private short browPop;
	private short showReviewTf;
	private short reviewTf;
	private short sbsnews;
	private short marqueeNews;
	private short proclaimNews;
	private short linkTf;
	private short filterNews;
	private String newsTemplet;
	private short focusNewsTf;
	private short classicalNewsTf;
	private short todayNewsTf;
	private String specialId;
	private Integer titleShowReview;

	public FsNews1() {
	}

	public FsNews1(long id, String newsId, String title, String classId,
			short headNewsTf, short manuTf, String fileName,
			String fileExtName, String path, Date addDate, int clickNum,
			short recTf, short picNewsTf, short auditTf, short delTf,
			short browPop, short showReviewTf, short reviewTf, short sbsnews,
			short marqueeNews, short proclaimNews, short linkTf,
			short filterNews, short focusNewsTf, short classicalNewsTf,
			short todayNewsTf) {
		this.id = id;
		this.newsId = newsId;
		this.title = title;
		this.classId = classId;
		this.headNewsTf = headNewsTf;
		this.manuTf = manuTf;
		this.fileName = fileName;
		this.fileExtName = fileExtName;
		this.path = path;
		this.addDate = addDate;
		this.clickNum = clickNum;
		this.recTf = recTf;
		this.picNewsTf = picNewsTf;
		this.auditTf = auditTf;
		this.delTf = delTf;
		this.browPop = browPop;
		this.showReviewTf = showReviewTf;
		this.reviewTf = reviewTf;
		this.sbsnews = sbsnews;
		this.marqueeNews = marqueeNews;
		this.proclaimNews = proclaimNews;
		this.linkTf = linkTf;
		this.filterNews = filterNews;
		this.focusNewsTf = focusNewsTf;
		this.classicalNewsTf = classicalNewsTf;
		this.todayNewsTf = todayNewsTf;
	}

	public FsNews1(long id, String newsId, String title, String subTitle,
			String titleStyle, String classId, short headNewsTf,
			String headNewsPath, String content, short manuTf, String fileName,
			String fileExtName, String path, Date addDate, String keyWords,
			String txtSource, String author, String editer, int clickNum,
			short recTf, short picNewsTf, String picPath, String naviWords,
			short auditTf, short delTf, Date delTime, short browPop,
			short showReviewTf, short reviewTf, short sbsnews,
			short marqueeNews, short proclaimNews, short linkTf,
			short filterNews, String newsTemplet, short focusNewsTf,
			short classicalNewsTf, short todayNewsTf, String specialId,
			Integer titleShowReview) {
		this.id = id;
		this.newsId = newsId;
		this.title = title;
		this.subTitle = subTitle;
		this.titleStyle = titleStyle;
		this.classId = classId;
		this.headNewsTf = headNewsTf;
		this.headNewsPath = headNewsPath;
		this.content = content;
		this.manuTf = manuTf;
		this.fileName = fileName;
		this.fileExtName = fileExtName;
		this.path = path;
		this.addDate = addDate;
		this.keyWords = keyWords;
		this.txtSource = txtSource;
		this.author = author;
		this.editer = editer;
		this.clickNum = clickNum;
		this.recTf = recTf;
		this.picNewsTf = picNewsTf;
		this.picPath = picPath;
		this.naviWords = naviWords;
		this.auditTf = auditTf;
		this.delTf = delTf;
		this.delTime = delTime;
		this.browPop = browPop;
		this.showReviewTf = showReviewTf;
		this.reviewTf = reviewTf;
		this.sbsnews = sbsnews;
		this.marqueeNews = marqueeNews;
		this.proclaimNews = proclaimNews;
		this.linkTf = linkTf;
		this.filterNews = filterNews;
		this.newsTemplet = newsTemplet;
		this.focusNewsTf = focusNewsTf;
		this.classicalNewsTf = classicalNewsTf;
		this.todayNewsTf = todayNewsTf;
		this.specialId = specialId;
		this.titleShowReview = titleShowReview;
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

	@Column(name = "TitleStyle")
	public String getTitleStyle() {
		return this.titleStyle;
	}

	public void setTitleStyle(String titleStyle) {
		this.titleStyle = titleStyle;
	}

	@Column(name = "ClassID", nullable = false)
	public String getClassId() {
		return this.classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	@Column(name = "HeadNewsTF", nullable = false)
	public short getHeadNewsTf() {
		return this.headNewsTf;
	}

	public void setHeadNewsTf(short headNewsTf) {
		this.headNewsTf = headNewsTf;
	}

	@Column(name = "HeadNewsPath")
	public String getHeadNewsPath() {
		return this.headNewsPath;
	}

	public void setHeadNewsPath(String headNewsPath) {
		this.headNewsPath = headNewsPath;
	}

	@Column(name = "Content")
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "ManuTF", nullable = false)
	public short getManuTf() {
		return this.manuTf;
	}

	public void setManuTf(short manuTf) {
		this.manuTf = manuTf;
	}

	@Column(name = "FileName", nullable = false)
	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Column(name = "FileExtName", nullable = false)
	public String getFileExtName() {
		return this.fileExtName;
	}

	public void setFileExtName(String fileExtName) {
		this.fileExtName = fileExtName;
	}

	@Column(name = "Path", nullable = false)
	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "AddDate", nullable = false, length = 23)
	public Date getAddDate() {
		return this.addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	@Column(name = "KeyWords")
	public String getKeyWords() {
		return this.keyWords;
	}

	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}

	@Column(name = "TxtSource")
	public String getTxtSource() {
		return this.txtSource;
	}

	public void setTxtSource(String txtSource) {
		this.txtSource = txtSource;
	}

	@Column(name = "Author")
	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Column(name = "Editer")
	public String getEditer() {
		return this.editer;
	}

	public void setEditer(String editer) {
		this.editer = editer;
	}

	@Column(name = "ClickNum", nullable = false)
	public int getClickNum() {
		return this.clickNum;
	}

	public void setClickNum(int clickNum) {
		this.clickNum = clickNum;
	}

	@Column(name = "RecTF", nullable = false)
	public short getRecTf() {
		return this.recTf;
	}

	public void setRecTf(short recTf) {
		this.recTf = recTf;
	}

	@Column(name = "PicNewsTF", nullable = false)
	public short getPicNewsTf() {
		return this.picNewsTf;
	}

	public void setPicNewsTf(short picNewsTf) {
		this.picNewsTf = picNewsTf;
	}

	@Column(name = "PicPath")
	public String getPicPath() {
		return this.picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	@Column(name = "NaviWords")
	public String getNaviWords() {
		return this.naviWords;
	}

	public void setNaviWords(String naviWords) {
		this.naviWords = naviWords;
	}

	@Column(name = "AuditTF", nullable = false)
	public short getAuditTf() {
		return this.auditTf;
	}

	public void setAuditTf(short auditTf) {
		this.auditTf = auditTf;
	}

	@Column(name = "DelTF", nullable = false)
	public short getDelTf() {
		return this.delTf;
	}

	public void setDelTf(short delTf) {
		this.delTf = delTf;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DelTime", length = 23)
	public Date getDelTime() {
		return this.delTime;
	}

	public void setDelTime(Date delTime) {
		this.delTime = delTime;
	}

	@Column(name = "BrowPop", nullable = false)
	public short getBrowPop() {
		return this.browPop;
	}

	public void setBrowPop(short browPop) {
		this.browPop = browPop;
	}

	@Column(name = "ShowReviewTF", nullable = false)
	public short getShowReviewTf() {
		return this.showReviewTf;
	}

	public void setShowReviewTf(short showReviewTf) {
		this.showReviewTf = showReviewTf;
	}

	@Column(name = "ReviewTF", nullable = false)
	public short getReviewTf() {
		return this.reviewTf;
	}

	public void setReviewTf(short reviewTf) {
		this.reviewTf = reviewTf;
	}

	@Column(name = "SBSNews", nullable = false)
	public short getSbsnews() {
		return this.sbsnews;
	}

	public void setSbsnews(short sbsnews) {
		this.sbsnews = sbsnews;
	}

	@Column(name = "MarqueeNews", nullable = false)
	public short getMarqueeNews() {
		return this.marqueeNews;
	}

	public void setMarqueeNews(short marqueeNews) {
		this.marqueeNews = marqueeNews;
	}

	@Column(name = "ProclaimNews", nullable = false)
	public short getProclaimNews() {
		return this.proclaimNews;
	}

	public void setProclaimNews(short proclaimNews) {
		this.proclaimNews = proclaimNews;
	}

	@Column(name = "LinkTF", nullable = false)
	public short getLinkTf() {
		return this.linkTf;
	}

	public void setLinkTf(short linkTf) {
		this.linkTf = linkTf;
	}

	@Column(name = "FilterNews", nullable = false)
	public short getFilterNews() {
		return this.filterNews;
	}

	public void setFilterNews(short filterNews) {
		this.filterNews = filterNews;
	}

	@Column(name = "NewsTemplet")
	public String getNewsTemplet() {
		return this.newsTemplet;
	}

	public void setNewsTemplet(String newsTemplet) {
		this.newsTemplet = newsTemplet;
	}

	@Column(name = "FocusNewsTF", nullable = false)
	public short getFocusNewsTf() {
		return this.focusNewsTf;
	}

	public void setFocusNewsTf(short focusNewsTf) {
		this.focusNewsTf = focusNewsTf;
	}

	@Column(name = "ClassicalNewsTF", nullable = false)
	public short getClassicalNewsTf() {
		return this.classicalNewsTf;
	}

	public void setClassicalNewsTf(short classicalNewsTf) {
		this.classicalNewsTf = classicalNewsTf;
	}

	@Column(name = "TodayNewsTF", nullable = false)
	public short getTodayNewsTf() {
		return this.todayNewsTf;
	}

	public void setTodayNewsTf(short todayNewsTf) {
		this.todayNewsTf = todayNewsTf;
	}

	@Column(name = "SpecialID")
	public String getSpecialId() {
		return this.specialId;
	}

	public void setSpecialId(String specialId) {
		this.specialId = specialId;
	}

	@Column(name = "TitleShowReview")
	public Integer getTitleShowReview() {
		return this.titleShowReview;
	}

	public void setTitleShowReview(Integer titleShowReview) {
		this.titleShowReview = titleShowReview;
	}

}
