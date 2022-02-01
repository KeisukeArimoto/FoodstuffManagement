package com.workspace.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.workspace.Entity.Items;
import com.workspace.Entity.Request.SearchItemRequest;
import com.workspace.repositories.ItemRepository;

import lombok.RequiredArgsConstructor;


/**
 * /topに紐づく処理のサービス
 * @author ari77
 *
 */
@RequiredArgsConstructor
@Service
public class TopService {

	//コンストラクタインジェクション
	private final ItemRepository itemRepository;

	/**
	 *  top画面アクセス時に削除フラグが立っていないItemを取得するコントローラー。
	 *
	 * @return Itemのリスト
	 */
	public List<Items> getExistItemsServe() {
		List<Items> allItemsList = itemRepository.findAll();

		//削除フラグが立っているものはのぞく
		List<Items> existItemList = Lists.newArrayList();
		for (Items item : allItemsList) {
			if (!item.isDeleteFlag()) {
				existItemList.add(item);
			}
		}
		return existItemList;

	}

	/**
	 * 検索時に該当のItemを取得するサービス。
	 *
	 * @return
	 */
	public List<Items> getSearchItemsServe(SearchItemRequest request) {
		List<Items> itemList = itemRepository.searchByfieldvalue(request.getField(), request.getValue());
		return itemList;
	}

}
