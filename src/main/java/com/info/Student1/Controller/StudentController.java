package com.info.Student1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.info.Student1.Model.ModelClass;
import com.info.Student1.StudRepo.StudentRepo;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepo c;
	
	@RequestMapping("/AddAcc1")
	public String AddRecord() {
		System.out.println("I am in AddAcc1");
		return "StudentRecord.jsp";
	}

	@RequestMapping("/Accdet")
	public String addAnn(@RequestParam("t1") int cid, @RequestParam("t2") int marks,@RequestParam("t3") float avg) {
		
		ModelClass acc=new ModelClass();
		acc.setId(cid);
		acc.setMarks(marks);
		acc.setAvg(avg);
		/*customer.setCid(cid);
		customer.setCname(cname);*/
		c.save(acc);
		return "StudentRecord.jsp";
	}
}
