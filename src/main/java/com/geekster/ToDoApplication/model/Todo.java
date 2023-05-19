package com.geekster.ToDoApplication.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@Data
@AllArgsConstructor
public class Todo {

    private  String id;
    @JsonProperty("todoname")
    private String todoName;
    private Boolean todoStatus;


}
