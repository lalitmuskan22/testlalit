package com.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import Model.LoginBean;


public class LoginValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return LoginBean.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "loginId", "loginId.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password.required");
		
		LoginBean loginBean = (LoginBean) target;
		if(loginBean.getPassword().length()>10)
		{
			errors.rejectValue("password","password.required");
		}
	}

}
