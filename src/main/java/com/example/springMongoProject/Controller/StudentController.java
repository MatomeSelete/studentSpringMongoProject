package com.example.springMongoProject.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/student")
public class StudentController {

    @PostMapping(value = "/save")
    private String saveStudent(@RequestBody student students) {

        //return
    }


}
