package com.prsk_db.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 *  コントローラのベースクラス
 *  継承不要
 *  コントローラ作成時のコピペ用
 * 
 *  @author name
 */
@Controller
public class TopController {
	
	// トップ画面表示リクエスト
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String index() {
		
		return "index";
		
	}

}
