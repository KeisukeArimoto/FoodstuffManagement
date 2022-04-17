package com.workspace.Entity.Dto;

import java.time.LocalDate;

import lombok.Data;

//TODO:DTOをどうやって使用するか(使用するべきかも含む)を調査＆実装
//写真の情報は別テーブルで永続化予定のためDTOも使ってみる
@Data
public class ItemsDto {

	private String name; //商品名
	private double amount; //残量
	private String unit; //単位
	private LocalDate deadline; //期限
	private String tag; //タグ
	private boolean deleteFlag; //削除フラグ
	private String deleteReason; //削除理由

	//コンストラクタ
	public ItemsDto(String name, double amount, String unit, LocalDate deadline,
			String tag, boolean deleteFlag, String deleteReason) {
		this.name = name;
		this.amount = amount;
		this.unit = unit;
		this.deadline = deadline;
		this.tag = tag;
		this.deleteFlag = deleteFlag;
		this.deleteReason = deleteReason;
	}


}
