package com.javaex.problem08;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	int stateCode;
	
	public Book(int bookNo, String title, String author) {
		stateCode=1;
				
	}
	
		
	public void setBookNo(int bookNo) {
		this.bookNo=bookNo;
	}
	public void setTile(String title) {
		this.title=title;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void setSateCode(int stateCode) {
		this.stateCode=stateCode;
	}
	public int getBookNo() {
		return bookNo;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int stateCode() {
		return stateCode;
	}
    
    
    
    
    
}
