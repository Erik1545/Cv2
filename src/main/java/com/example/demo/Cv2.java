package com.example.demo;

import com.example.demo.controller.StudentController;
import com.example.demo.controller.StudentsController;
import com.example.demo.service.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class Cv2 {

	public static void main(String[] args) {

		Student student1 = new Student(1, "Petr", "prodekan");
		Student student2 = new Student(2, "Erik", "basic student");
		Student student3 = new Student(3, "Hana", "rektor");

		HashMap<Integer, Student> studentMap = new HashMap<>();
		studentMap.put(student1.getId(), student1);
		studentMap.put(student2.getId(), student2);
		studentMap.put(student3.getId(), student3);

		StudentController studentController = new StudentController();
		StudentsController studentsController = new StudentsController();


		studentController.getById(studentMap, 2);
		studentsController.getAll(studentMap);

		SpringApplication.run(Cv2.class, args);

		}



	}


//cv3
