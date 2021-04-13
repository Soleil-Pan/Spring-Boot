package com.pyp.controller;

import com.pyp.entity.Student;
import com.pyp.entity.User;
import com.pyp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/index")
public class IndexHandler {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/index")
    public String index(Model model){
        System.out.println("index...");
/*        List<Student> list = new ArrayList<>();
        list.add(new Student(1l,"张三",20));
        list.add(new Student(1l,"李四",21));
        list.add(new Student(1l,"王五",22));
        model.addAttribute("list",list);*/
        model.addAttribute("list",studentRepository.findAll());
        return "index";
    }

    @GetMapping("/index2")
    public String index2(Map<String,String> map){
        map.put("name","张三");
        return "index2";
    }

    @GetMapping ("/index3")
    public String index3(Map<String,Boolean> map){
        map.put("flag",true);
        return "index3";
    }

    @GetMapping("/validator")
    private void validatorUser(@Valid User user, BindingResult bindingResult){
        System.out.println(user);
        if (bindingResult.hasErrors()){
            List<ObjectError> list =bindingResult.getAllErrors();
            for (ObjectError objectError : list) {
                System.out.println(objectError.getCode() + "---" + objectError.getDefaultMessage());
            }
        }

    }
}
