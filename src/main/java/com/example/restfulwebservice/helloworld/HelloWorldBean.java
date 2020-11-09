package com.example.restfulwebservice.helloworld;

// lombok 라이브러리 : getter&setter, 생성자, toString 등 메소드 자동 생성
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldBean {
    private String message;
}
