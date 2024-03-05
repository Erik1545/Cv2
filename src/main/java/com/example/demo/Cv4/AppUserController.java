package com.example.demo.Cv4;

import com.example.demo.Cv2;
import com.example.demo.controller.StudentController;
import com.example.demo.cv3.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/app-user")
public class AppUserController {
    @Autowired
    private StudentController studentController;

    @GetMapping("/{id}")
    public ResponseEntity<AppUser> getById(@PathVariable("id") Long id) {
        AppUser user = studentController.getById(2);
        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}

