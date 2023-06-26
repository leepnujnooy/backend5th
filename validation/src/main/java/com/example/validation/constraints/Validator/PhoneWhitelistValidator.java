package com.example.validation.constraints.Validator;

import com.example.validation.constraints.annotations.PhoneWhitelist;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.HashSet;
import java.util.Set;

public class PhoneWhitelistValidator implements ConstraintValidator<PhoneWhitelist, String> {

    private final Set<String> whiteList;

    public PhoneWhitelistValidator() {
        this.whiteList = new HashSet<>();
        this.whiteList.add("010");
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        String[] split = value.split("-");
        String num = split[0];

        return whiteList.contains(num);
    }
}
