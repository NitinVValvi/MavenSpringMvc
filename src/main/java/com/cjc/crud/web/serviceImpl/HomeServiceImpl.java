package com.cjc.crud.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.crud.web.dao.HomeDao;
import com.cjc.crud.web.model.Student;
import com.cjc.crud.web.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeDao hd;

	public void saveData(Student s) {
		hd.saveData(s);
		
	}

	public Student logincheck(String un, String ps) {
		
		return hd.logincheck(un, ps);
		
	}

	public List displaydata() {
	
		return hd.displaydata();
	}

	public void deletedata(int id) {
		hd.deletedata(id);
		
	}


	

	public Student editdata(Student s) {
		
		return hd.editdata(s);
	}

	public int updatedata(Student s) {
		return hd.updatedata(s);
	
		
	}

}
