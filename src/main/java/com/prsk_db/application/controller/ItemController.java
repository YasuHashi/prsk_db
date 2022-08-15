package com.prsk_db.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 *  エリアアイテム機能の画面表示用
 *  ロジックはServiceに委譲してください
 * 
 *  @author name
 */
@Controller
public class ItemController {
	
	// エリアアイテム一覧画面表示リクエスト
	@RequestMapping(path = "/erea_item", method = RequestMethod.GET)
	public String showItemList() {
		
		return "erea_item/list";
		
	}

}
