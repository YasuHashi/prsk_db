package com.prsk_db.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 *  キャラクター機能の画面表示用
 *  ロジックはServiceに委譲してください
 * 
 *  @author name
 */
@Controller
public class CharacterController {

	// キャラクター一覧画面表示リクエスト
	@RequestMapping(path = "/character", method = RequestMethod.GET)
	public String showCharacterList() {

		return "character/list";

	}

	// キャラクター相関図画面表示リクエスト
	@RequestMapping(path = "/character/correlation", method = RequestMethod.GET)
	public String showCorrelation() {

		return "character/correlation";

	}

	// キャラランク経験値画面表示リクエスト
	@RequestMapping(path = "/character/rank_experience", method = RequestMethod.GET)
	public String showRankExperience() {

		return "character/rank_experience";

	}

}