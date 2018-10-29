package com.kindred.DataSet.controller;
import com.kindred.DataSet.dao.tuserdetails;
import com.kindred.DataSet.dao.tuserdetailsrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WebController {
    @Autowired
    tuserdetailsrepository repository;

    @RequestMapping("/save")
    public String process(){
        repository.save(new tuserdetails("si1", "Normal","sweden","netent"));
        repository.save(new tuserdetails("si1", "Normal","sweden","netent"));
        repository.save(new tuserdetails("si1", "Normal","sweden","netent"));
        repository.save(new tuserdetails("si1", "Normal","sweden","netent"));
        repository.save(new tuserdetails("si1", "Normal","sweden","netent"));
        return "Done";
    }


    @RequestMapping("/findall")
    public String findAll(){
        String result = "";

        for(tuserdetails cust : repository.findAll()){
            result += cust.toString() + "</br>";
        }

        return result;
    }

    @RequestMapping("/findbyid")
    public String findById(@RequestParam("id") long id){
        String result = "";
        result = repository.findById(id).toString();
        return result;
    }

    @RequestMapping("/findbylastname")
    public String fetchDataByLastName(@RequestParam("lastname") String lastName){
        String result = "";

        for(tuserdetails cust: repository.findByProvider(lastName)){
            result += cust.toString() + "</br>";
        }

        return result;
    }
}