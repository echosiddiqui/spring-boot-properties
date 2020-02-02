package com.ad.app.config;

import com.ad.app.model.Family;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
@ConfigurationProperties("com.ad") //Setters mandatory for this to work
public class PersonProperties {

    @Value("${com.ad.nickname}") //Setters NOT mandatory for this to work
    private String name;

    @Value("${com.ad.age}")
    private double age;

    @Value("${com.ad.spouse-name}")
    private String spouseName;

    private String firstName;

    private String lastName;

    private List<Family> family = new ArrayList<>();
}