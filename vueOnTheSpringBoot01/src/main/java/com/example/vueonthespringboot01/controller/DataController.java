package com.example.vueonthespringboot01.controller;

import com.example.vueonthespringboot01.dto.ResultDTO;
import com.example.vueonthespringboot01.service.UserService;
import com.example.vueonthespringboot01.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:8800")
public class DataController {

    private final UserService userService;


    @GetMapping("/")
    public String home() {

        return "Data 준비중...";
    }

    @GetMapping("/api")
    public String api() {

        return "Api Data 준비중...";
    }


    @PostMapping("/findAll")
    public ResultDTO findAll(){
       return userService.findAll();
    }

    @PostMapping("/editById")
    public ResultDTO editById(){
        return null;
    }

    @DeleteMapping("/delete")
    public ResultDTO delete(){
        return null;
    }

    @PutMapping("/save")
    public ResultDTO save(){
        return null;
    }
}
