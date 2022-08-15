package com.prsk_db.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 *  メンバー機能の画面表示用
 *  ロジックはServiceに委譲してください
 * 
 *  @author name
 */
@Controller
public class MemberController {
	
	// メンバー一覧画面表示リクエスト
	@RequestMapping(path = "/member", method = RequestMethod.GET)
	public String showMemberList() {
		
		return "member/list";
		
	}

}
