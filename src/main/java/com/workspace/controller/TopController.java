package com.workspace.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.workspace.Entity.Items;
import com.workspace.Services.TopService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class TopController {

	//コンストラクタインジェクション
	//@RequiredArgsConstructorによりfinalなフィールドをパラメータにとるコンストラクタが自動生成される
	private final TopService topservice;

	@RequestMapping("/top")
	public List<Items> getAllItemsControll() {
		return topservice.getAllItemsServe();
	}

}
