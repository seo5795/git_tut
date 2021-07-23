package com.seo.myapp.board;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class BoardVO {
	private int bid;
	private String title;
	private String theme;
	private String content;
	private Date wdate;
	private String search; // 검색기능수행시, 컨테이너가 Command객체를 생성,
	private String searchContent; // 생성된 객체에 값추출-setter 자동으로 처리하는 것을 이용!
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
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public String getSearchContent() {
		return searchContent;
	}
	public void setSearchContent(String searchContent) {
		this.searchContent = searchContent;
	}
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	
	
}
