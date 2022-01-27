package com.workspace.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.workspace.Entity.Items;

@Service
public class TopService {

	/**
	 * top画面アクセス時にすべてのItemを取得するサービス。
	 * 削除フラグが立っているものについてはクライアントで非表示にする。
	 *
	 * @return Item
	 */
	//TODO:Repositoryを使ってデータを取得するロジック実装
	public List<Items> getAllItemsServe() {
		return null;

	}

	/**
	 * 検索時に該当のItemを取得するサービス。
	 *
	 * @return
	 */
	//TODO:Repositoryを使ってデータを取得するロジック実装
	public List<Items> getSearchItemsServe() {
		return null;
	}

}
