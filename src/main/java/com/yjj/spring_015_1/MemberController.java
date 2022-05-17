package com.yjj.spring_015_1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	
	@RequestMapping("/login")
	public String login() {
		
		return "login";
	}
	
	
	@RequestMapping("loginCheck")
	public String loginCheck(MemberDto memberDto, BindingResult result, Model model) {
		
		String goPage = "loginOk";
		
		MemberValidator validator = new MemberValidator();
		validator.validate(memberDto, result);	
		
		if(result.hasErrors()) {
			goPage = "login";
		} else {
			model.addAttribute("member", memberDto);
		}
		
		
		
		return goPage;
	}
	
	
	
}
