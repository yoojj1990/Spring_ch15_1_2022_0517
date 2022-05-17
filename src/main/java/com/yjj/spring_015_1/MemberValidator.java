package com.yjj.spring_015_1;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class MemberValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return MemberDto.class.isAssignableFrom(arg0);
		// 검증할 객체의 클래스 타입 정보
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
		MemberDto memberDto = (MemberDto) target;
		
//		String checkId = memberDto.getId();
		String checkPw = memberDto.getPw();
		
//		if(checkId == null || checkId.trim().isEmpty()) {
//			errors.rejectValue("id", "trouble");
//			
//			System.out.println("아이디가 공란입니다.");
//			
//		} 
		
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "trouble");
		
		
		
		if(checkPw == null || checkPw.trim().isEmpty()) {
			errors.rejectValue("pw", "trouble");
			
			System.out.println("비번이 공란입니다.");
			
		} 
		
		
		
		
	}

}
