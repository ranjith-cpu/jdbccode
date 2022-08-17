package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repo.Bookrepo;
@Service
public class BookService {
	@Autowired
	Bookrepo br;

	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return br.findAll();
	}

	public String addbd(Book bk) {
		// TODO Auto-generated method stub
		br.save(bk);
		return "Successfully added" ;
	}

	public String updaterow(Book bk) {
		String res="";
		// TODO Auto-generated method stub
		try {
			Book dbbook = br.findById(bk.getId()).get();
			if((dbbook !=null)&&(dbbook.getId()==bk.getId())){
				br.save(bk);
				res="Updated Successfully";
			}}
		catch(Exception e) {
			res="there is a problem";
		}
			
		return res;
	}

	public String deletebook(int id) {
		// TODO Auto-generated method stub
		String res="";
		// TODO Auto-generated method stub
		try {
			
			br.deleteById(id);
				res="Deleted Successfully";
			}
		catch(Exception e) {
			res="there is a problem";
		}
			
		return res;
	
	}

}
