package com.santosoftvw.oop;

import com.santosoftvw.oop.Student.types;

public class UIAdmission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Student.types t = 	Student.types.ADMISSION;
		//t.type = "credit transfer";		
		t.type = "beginner";
		Student st = new Student(79, 78, 76, t);
		//Student st = new Student(4, t);
		
		st.processAdmission();
	}

}
