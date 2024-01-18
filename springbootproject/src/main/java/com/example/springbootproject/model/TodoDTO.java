package com.example.springbootproject.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "todos") // it is used as we are using MongoDB
public class TodoDTO {
    @Id
    private String id;
    private String todo;
    private String description;
    private Boolean completed;
    private Date createdAt;
    private Date updatedAt;
}
