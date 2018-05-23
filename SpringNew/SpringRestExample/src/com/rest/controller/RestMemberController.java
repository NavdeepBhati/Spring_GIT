package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rest.beans.Member;
import com.rest.service.MemberService;

@Controller
public class RestMemberController {
	private final MemberService memberService;

	@Autowired
	public RestMemberController(MemberService memberService) {
		super();
		this.memberService = memberService;
	}

	
	@RequestMapping("/addMembers")
	public String addRestMembers(Model model, @ModelAttribute("member") Member member) {
		memberService.addMember(member);		
		String message="";
		if(member.getName()!=null)
		 message= "Member added successfully";
		
			
		model.addAttribute("message", message);
		return "PostMembers";
	}
	
	
	
	/*//@RequestMapping("/getMembers")
	@RequestMapping(value="/getMembers", produces=MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public List<Member> getRestMembers(Model model) {
	List<Member> members=	memberService.getMemberList();
		
		model.addAttribute("members", members);
		//return new ResponseEntity(members, HttpStatus.OK);
	return members;
	}*/
	//-------XML---------View-------------
	/*@RequestMapping("/getMembers")
	@ResponseBody
	public MemberService getRestMembers(Model model) {
	List<Member> members=	memberService.getMemberList();
		
		model.addAttribute("members", members);
		return memberService;
	}
	*/
	
	
	//-------MarshallingXML---------View-------------
		@RequestMapping("/getMembers")
		public String getRestMembers(Model model) {
		//List<Member> members=	memberService.getMemberList();
			
			model.addAttribute("members", memberService);
			return "membertemplate";
		}
		
	
	
}