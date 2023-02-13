package com.example.didemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentMongoEntity {
    @Id
    private String id;

    @Field
    private String studentName;
}
