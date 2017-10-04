package com.api.amresh.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.amresh.model.Empolyee;
 

 
@RestController
@RequestMapping("/emp")
public class WelcomeController
{
    @RequestMapping(value="/list", method =RequestMethod.GET)
    public List<Empolyee> getEmployees()
    {
        List<Empolyee> employeesList = new ArrayList<Empolyee>();
        employeesList.add(new Empolyee(1,"amresh","verma","geniousamresh@gmail.com"));
        return employeesList;
    }
}