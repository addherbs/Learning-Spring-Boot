package com.example.webapp.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class Person {
    @NotBlank
    private String name;

    @NotNull
    private Integer age;

    @NotBlank
    private String lang;
}
