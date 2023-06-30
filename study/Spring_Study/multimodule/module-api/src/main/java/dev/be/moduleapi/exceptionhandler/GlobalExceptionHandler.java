package dev.be.moduleapi.exceptionhandler;

import dev.be.moduleapi.exception.CustomException;
import dev.be.moduleapi.response.CommonResponse;
import dev.be.modulecommon.enums.CodeEnum;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// Exception 관련 처리를 확인 하기 위한 어노테이션
@RestControllerAdvice // Exception이 발생되면 @RestControllerAdvice 어노테이션에 걸리게 됨
public class GlobalExceptionHandler {
    @ExceptionHandler(CustomException.class) // () 안에 선언한 Exception이 존재하면 해당 method가 실행됨
    public CommonResponse handlerCustomException(CustomException e) {
        return CommonResponse.builder()
                .returnCode(e.getReturnCode())
                .returnMessage(e.getReturnMessage())
                .build();
    }
    @ExceptionHandler(Exception.class) // 고려하지 못한 Exception이 발생될 경우 해당 method가 실행되도록 작성함
    public CommonResponse handlerException(Exception e) {
        return CommonResponse.builder()
                .returnCode(CodeEnum.UNKNOWN_ERROR.getCode())
                .returnMessage(CodeEnum.UNKNOWN_ERROR.getMessage())
                .build();
    }
}
