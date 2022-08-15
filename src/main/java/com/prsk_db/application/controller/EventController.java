package com.prsk_db.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 *  イベント機能の画面表示用
 *  ロジックはServiceに委譲してください
 * 
 *  @author name
 */
@Controller
public class EventController {
	
	// イベント一覧画面表示リクエスト
	@RequestMapping(path = "/event", method = RequestMethod.GET)
	public String showEventList() {
		
		return "html/event/list";
		
	}

}
