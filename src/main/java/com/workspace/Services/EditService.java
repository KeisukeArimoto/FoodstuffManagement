package com.workspace.Services;

import org.springframework.stereotype.Service;

import com.workspace.Entity.Request.AddNewItemRequest;
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

	}

	//TODO:既存Item編集用サービス実装
	/**
	 * 既存Item編集用サービス
	 */
	public void editItemServe() {

	}

	//TODO:削除用サービス実装
	/**
	 * 既存Item削除用サービス
	 */
	public void deleteItemServe() {

	}

}
