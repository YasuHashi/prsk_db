package com.prsk_db.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 *  ユーザー機能の画面表示用
 *  ロジックはServiceに委譲してください
 * 
 *  @author name
 */
@Controller
public class UserController {
	
	// マイページ画面表示リクエスト
	@RequestMapping(path = "/mypage", method = RequestMethod.GET)
	public String showMyPage() {
		
		return "mypage";
		
	}

}
