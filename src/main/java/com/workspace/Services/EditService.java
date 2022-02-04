package com.workspace.Services;

import org.springframework.stereotype.Service;

import com.workspace.Entity.Dto.ItemsDto;
import com.workspace.Entity.Request.AddNewItemRequest;
import com.workspace.Entity.Request.DeleteItemRequest;
import com.workspace.Entity.Request.EditItemRequest;
import com.workspace.repositories.ItemRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EditService {

	//コンストラクタインジェクション
	private final ItemRepository itemRepository;

	//TODO:Item新規追加用サービス実装
	/**
	 * 新規Item追加用サービス
	 */
	public void addNewItemServe(AddNewItemRequest request) {
		ItemsDto item = new ItemsDto();
		item.setName(request.getName());
		item.setAmount(request.getAmount());
		item.setUnit(request.getUnit());
		item.setDeadline(request.getDeadline());
		item.setTag(request.getTag());
		item.setDeleteFlag(false);

	}

	//TODO:既存Item編集用サービス実装
	/**
	 * 既存Item編集用サービス
	 */
	public void editItemServe(EditItemRequest request) {

	}

	//TODO:削除用サービス実装
	/**
	 * 既存Item削除用サービス
	 */
	public void deleteItemServe(DeleteItemRequest request) {

	}

}
