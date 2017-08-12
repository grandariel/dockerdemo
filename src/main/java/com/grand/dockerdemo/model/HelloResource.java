package com.grand.dockerdemo.model;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderClassName = "HelloResourceBuilder")
public class HelloResource {
    @Id
    @GeneratedValue
    private Long id;
    private String message;

    @JsonPOJOBuilder(withPrefix = "")
    public static final class HelloResourceBuilder {}
}
