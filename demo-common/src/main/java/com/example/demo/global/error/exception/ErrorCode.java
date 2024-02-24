package com.example.demo.global.error.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    TEST(HttpStatus.INTERNAL_SERVER_ERROR, "001", "business-exception-test");

    private HttpStatus httpStatus;
    private String errorCode;
    private String message;

    ErrorCode(HttpStatus httpStatus, String errorCode, String errorMessage) {
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.message = errorMessage;
    }
}
