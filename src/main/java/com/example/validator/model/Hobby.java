package com.example.validator.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class Hobby {
    @NotBlank(message = "debe especificar un hobby")
    private String name;
}
