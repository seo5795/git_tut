package com.seo.myapp.board;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

@XmlAccessorType(XmlAccessType.FIELD) // 부모-자식 엘리먼트를 만듬
@Entity
@Table(name="BOARD") // 테이블명과 클래스명이 불일치하면 반드시 설정해주어야함!
public class BoardVO {
	@XmlAttribute // 엘리먼트를 구분할 수 있게하는 속성으로 설정
	@Id
	@GeneratedValue
	private int bid;
	private String title;
	private String theme;
	private String content;
	@Temporal(TemporalType.DATE)
	private Date wdate;
	private String fileName; 
	@XmlTransient // @JsonIgnore의 역할
	private String search; // 검색기능수행시, 컨테이너가 Command객체를 생성,
	@XmlTransient 
	private String searchContent; // 생성된 객체에 값추출-setter 자동으로 처리하는 것을 이용!
	@XmlTransient 
	private MultipartFile uploadFile;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getWdate() {
		return wdate;
	}
	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}
	
	@JsonIgnore
	//json 데이터 변환 (전달할 필요없을때 사용하는 어노테이션)
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	
	@JsonIgnore
	public String getSearchContent() {
		return searchContent;
	}
	public void setSearchContent(String searchContent) {
		this.searchContent = searchContent;
	}
	
	@JsonIgnore
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	
}
