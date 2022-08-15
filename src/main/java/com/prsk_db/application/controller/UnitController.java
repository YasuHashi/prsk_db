package com.prsk_db.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 *  ユニット機能の画面表示用
 *  ロジックはServiceに委譲してください
 * 
 *  @author name
 */
@Controller
public class UnitController {
	
	// ユニット一覧画面表示リクエスト
	@RequestMapping(path = "/unit", method = RequestMethod.GET)
	public String showUnitList() {
		
		return "unit/list";
		
	}

}