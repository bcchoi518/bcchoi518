package dev.be.moduleapi.service;

import dev.be.moduleapi.exception.CustomException;
import dev.be.modulecommon.enums.CodeEnum;
import dev.be.modulecommon.service.CommonDemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service // service bean 임을 선언
@RequiredArgsConstructor
public class DemoService {

    // Application 이 속해 있는 패키지내에서 component scan을 수행하기 때문에 해당 bean을 찾지 못함
    // Application을 공통으로 가진 경로 아래로 변경해야 함 (dev.be 로 변경)
    // 또는 Application의 @SpringBootApplication의 scanBasePackages를 지정하면 됨
    private final CommonDemoService commonDemoService;

    public String save() {
        System.out.println(CodeEnum.SUCCESS.getCode());
        System.out.println(commonDemoService.commonService());
        return "save";
    }

    public String find() {
        return "find";
    }

    public String exception() {
        if (true) {
            throw new CustomException(CodeEnum.UNKNOWN_ERROR);
        }
        return "exception";
    }
}
