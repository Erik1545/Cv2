package com.example.demo;

import com.example.demo.service.MyService;
import com.example.demo.service.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		MyService myService = new MyService();

		Student emp1 = new Student(1, "Eva", "proděkan");
		Student emp2 = new Student(2, "Erik", "basic student");
		Student emp3 = new Student(3, "Honza", "rektor");

		myService.addEmployee(emp1);
		myService.addEmployee(emp2);
		myService.addEmployee(emp3);

		System.out.println(myService);

	}


}
