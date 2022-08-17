package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	int Id;
	String Bname;
	String Author;
	int Price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String bname, String author, int price) {
		super();
		Id = id;
		Bname = bname;
		Author = author;
		Price = price;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Book [Id=" + Id + ", Bname=" + Bname + ", Author=" + Author + ", Price=" + Price + "]";
	}
	

}
