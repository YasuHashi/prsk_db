package com.prsk_db.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 *  楽曲機能の画面表示用
 *  ロジックはServiceに委譲してください
 * 
 *  @author name
 */
@Controller
public class MusicController {
	
	// 楽曲一覧画面表示リクエスト
	@RequestMapping(path = "/music", method = RequestMethod.GET)
	public String showMusicList() {
		
		return "html/music/list";
		
	}

}
