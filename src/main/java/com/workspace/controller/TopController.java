package com.workspace.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.workspace.Entity.Items;
import com.workspace.Services.TopService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("/top")
public class TopController {

	//コンストラクタインジェクション
	//@RequiredArgsConstructorによりfinalなフィールドをパラメータにとるコンストラクタが自動生成される
	private final TopService topservice;

	/**
	 * top画面アクセス時にすべてのItemを取得するコントローラー。
	 * 削除フラグが立っているものについてはクライアントで非表示にする。
	 *
	 * @return Item
	 */
	@RequestMapping("/")
	public List<Items> getAllItemsControll() {
		return topservice.getAllItemsServe();
	}

	/**
	 * 検索時に該当のItemを取得するコントローラー。
	 *
	 * @return Item
	 */
	@RequestMapping("/search")
	public List<Items> getSearchItemsControll() {
		return topservice.getSearchItemsServe();
	}

}
