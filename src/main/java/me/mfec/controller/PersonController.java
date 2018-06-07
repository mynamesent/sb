/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.mfec.controller;

import java.util.List;
import me.mfec.entity.Person;
import me.mfec.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sent
 */
@RestController
@RequestMapping("/test")
public class PersonController {

      private final PersonRepository personRepository ; 

      
      
      @Autowired
      public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
      @GetMapping
      public List<Person> listPersons(){
           return  personRepository.findAll();
      
      }
      @GetMapping("/insert")
      public String insert(){
       for(int i = 0;i<10;i++ ){
           personRepository.save(new Person("fname"+i, "lname" +i));
       }
       return  "inserted" ;
      }
    
}
