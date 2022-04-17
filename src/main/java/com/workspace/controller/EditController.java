package com.workspace.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.workspace.Entity.Request.AddNewItemRequest;
import com.workspace.Entity.Request.DeleteItemRequest;
import com.workspace.Entity.Request.EditItemRequest;
import com.workspace.Services.EditService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("/foodStuffManager/edit")
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

	/**
	 * 既存Item編集用コントローラー
	 */
	@PutMapping("/{Item}")
	public void editItemController(@RequestBody EditItemRequest request) {
		editService.editItemServe(request);
	}

	/**
	 * Item削除用コントローラー
	 */
	@DeleteMapping("/delete/{Item}")
	public void deleteItemController(@RequestBody DeleteItemRequest request, @PathVariable long id) {
		editService.deleteItemServe(request, id);
	}

}