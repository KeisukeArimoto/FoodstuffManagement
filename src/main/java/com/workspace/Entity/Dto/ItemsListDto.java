package com.workspace.Entity.Dto;

import java.time.LocalDate;

import lombok.Data;

//TODO:DTOをどうやって使用するか(使用するべきかも含む)を調査＆実装
@Data
public class ItemsListDto {

	private String name; //商品名
	private double amount; //残量
	private String unit; //単位
	private LocalDate deadline; //期限
	private String tag; //タグ
	private boolean deleteFlag; //削除フラグ
	private String deleteReason; //削除理由

}
