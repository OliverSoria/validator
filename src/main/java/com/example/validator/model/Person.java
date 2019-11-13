package com.example.validator.model;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class Person {
    @NotBlank(message = "debe especificar un nombre")
    private String name;

    @NotBlank(message = "debe especificar un apellido")
    private String lastName;

    @Valid
    @NotNull(message = "el hobby no puede ser nulo")
    private Hobby hobby;
}
