package com.workspace.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.workspace.Entity.Items;
import com.workspace.Entity.Request.ItemSearchRequest;
import com.workspace.repositories.ItemRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TopService {

	//コンストラクタインジェクション
	private final ItemRepository itemRepository;

	/**
	 * top画面アクセス時にすべてのItemを取得するサービス。
	 * 削除フラグが立っているものについてはクライアントで非表示にする。
	 *
	 * @return Item
	 */
	//TODO:Repositoryを使ってデータを取得するロジック実装
	public List<Items> getAllItemsServe() {
		return itemRepository.findAll();

	}

	/**
	 * 検索時に該当のItemを取得するサービス。
	 *
	 * @return
	 */
	public List<Items> getSearchItemsServe(ItemSearchRequest request) {
		List<Items> itemList = itemRepository.searchByfieldvalue(request.getField(), request.getValue());
		return itemList;
	}

}
