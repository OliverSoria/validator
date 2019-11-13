package com.example.validator.controller;

import com.example.validator.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PersonController {

    @GetMapping("/")
    public String getData(@Valid @RequestBody Person person) {
        return person.getName() + " " + person.getLastName();
    }
}
