package cn.com.entity;

// Generated 2013-6-23 21:31:27 by Hibernate Tools 4.0.0

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * FsNewsClass generated by hbm2java
 */
@Entity
@Table(name = "FS_NewsClass", schema = "dbo", catalog = "jmrb", uniqueConstraints = @UniqueConstraint(columnNames = "ClassID"))
public class FsNewsClass implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6885868538435985075L;
	private long id;
	private String classId;
	private String classEname;
	private String classCname;
	private String parentId;

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "ClassID", unique = true, nullable = false)
	public String getClassId() {
		return this.classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	@Column(name = "ClassEName", nullable = false)
	public String getClassEname() {
		return this.classEname;
	}

	public void setClassEname(String classEname) {
		this.classEname = classEname;
	}

	@Column(name = "ClassCName", nullable = false)
	public String getClassCname() {
		return this.classCname;
	}

	public void setClassCname(String classCname) {
		this.classCname = classCname;
	}

	@Column(name = "ParentID", nullable = false)
	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

}
