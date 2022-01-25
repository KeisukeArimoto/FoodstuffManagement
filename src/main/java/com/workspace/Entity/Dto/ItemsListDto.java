package com.workspace.Entity.Dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ItemsListDto {

	private String name; //商品名
	private double amount; //残量
	private String unit; //単位
	private LocalDate deadline; //期限
	private String tag; //タグ

}
