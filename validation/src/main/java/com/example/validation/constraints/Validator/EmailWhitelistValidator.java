package com.example.validation.constraints.Validator;

import com.example.validation.constraints.annotations.EmailWhitelist;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.HashSet;
import java.util.Set;

//ConstraintValidator 는 사용자 지정 유효성 검사를 위해 구현해야하는 인터페이스
public class EmailWhitelistValidator implements ConstraintValidator<EmailWhitelist, String> {

    private final Set<String> whiteList;

    public EmailWhitelistValidator() {
        this.whiteList = new HashSet<>();
        this.whiteList.add("gmail.com");
    }


    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        String[] split = value.split("@");
        String domain = split[split.length-1];

        return whiteList.contains(domain);
        //유효한 값일때는 return true
    }
}
