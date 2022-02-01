package com.workspace.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.workspace.Entity.Items;
import com.workspace.Entity.Request.ItemSearchRequest;
import com.workspace.Services.TopService;

import lombok.RequiredArgsConstructor;

/**
 * /topに紐づく処理のコントローラー
 * @author ari77
 *
 */
@RequiredArgsConstructor
@Controller
@RequestMapping("/top")
public class TopController {

	//コンストラクタインジェクション
	//@RequiredArgsConstructorによりfinalなフィールドをパラメータにとるコンストラクタが自動生成される
	private final TopService topservice;

	/**
	 * top画面アクセス時に削除フラグが立っていないItemを取得するコントローラー。
	 *
	 * @return Itemのリスト
	 */
	@ResponseBody
	@RequestMapping("/")
	public List<Items> getExistItemsControll() {
		return topservice.getExistItemsServe();
	}

	/**
	 * 検索時に該当のItemを取得するコントローラー。
	 *
	 * @return Item
	 */
	@ResponseBody
	@RequestMapping("/search")
	public List<Items> getSearchItemsControll(@RequestBody ItemSearchRequest request) {
		return topservice.getSearchItemsServe(request);
	}

}
