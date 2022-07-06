package org.example.exception;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Data
public class ApiEr {
    private String msg;
    private HttpStatus httpStatus;
}
