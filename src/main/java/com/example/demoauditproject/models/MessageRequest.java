package com.example.demoauditproject.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MessageRequest {
    String content;
    String username;
    Integer userId;
    Date created_date;
    Date updated_date;
    Integer created_by;
    Integer updated_by;

    @Override
    public String toString() {
        return "Message [content=" + content + "]";
    }
}
