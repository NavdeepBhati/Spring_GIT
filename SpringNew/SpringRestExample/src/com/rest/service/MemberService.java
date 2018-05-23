package com.rest.service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

import com.rest.beans.Member;

@Component
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MemberService {

	@XmlElement(name="member")
	private List<Member> memberList=new ArrayList<>();

	
	public MemberService() {

		addMember(new Member("wew", "wdw", "wdwdwdw"));
		addMember(new Member("wweew", "ttthh", "wdwdtrtwdw"));
		addMember(new Member("wvcttew", "whhdw", "wdqwqwdwdw"));
	}
	
	public List<Member> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}
	
	public void addMember(Member member) {
		memberList.add(member);
		
	}
	
	
}
