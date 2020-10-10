package com.myplantdiary.enterprise.controller;

import com.myplantdiary.enterprise.dto.Specimen;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PlantDiaryController {

    @RequestMapping("/")
    public String index(){
        return "start";
    }

    @RequestMapping(value="/specimen", method=RequestMethod.GET)
    public ResponseEntity fetchAllSpecimens(){
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/specimen/{id}/")
    public ResponseEntity fetchSpecimenById(@PathVariable("id") String id){
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping(value="/specimen", consumes="applicatipn/jason", produces="application/json")
    public Specimen createSpecimen(@RequestBody Specimen specimen){
        return specimen;
    }

    @DeleteMapping("/speimen/{id}/")
    public ResponseEntity deleteSpecimen(@PathVariable("id") String id){
        return new ResponseEntity(HttpStatus.OK);
    }
}


