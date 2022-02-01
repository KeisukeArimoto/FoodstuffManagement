package com.workspace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.workspace.Entity.Request.AddNewItemRequest;
import com.workspace.Services.EditService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("/edit")
public class EditController {

	//コンストラクタインジェクション
	private final EditService editService;

	/**
	 * 新規Item追加用コントローラー
	 */
	@PostMapping("/new")
	public void addNewItemController(@RequestBody AddNewItemRequest request) {
		editService.addNewItemServe(request);
	}

	//TODO:既存Item編集用コントローラー実装
	/**
	 * 既存Item編集用コントローラー
	 */
	@PutMapping("/{Item}")
	public void editItemController() {

	}

	//TODO:削除用コントローラー実装
	/**
	 * Item削除用コントローラー
	 */
	@DeleteMapping("/delete/{Item}")
	public void deleteItemController() {

	}

}