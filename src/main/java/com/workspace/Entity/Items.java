package com.workspace.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Items")
public class Items {

	//ID
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long id;

	//商品名
	@Column(nullable = false)
	private String name;

	//残量
	@Column(nullable = false)
	private double amount;

	//単位
	@Column(nullable = false)
	private String unit;

	//期限
	@Column(nullable = false)
	private LocalDate deadline;

	//タグ
	@Column(nullable = true)
	private String tag;

	//削除フラグ
	@Column
	private boolean deleteFlag;

	//削除理由
	@Column(nullable = true)
	private String deleteReason;

	//更新ユーザー
	@Column
	private String updateUser;

	//更新日時
	@Column
	private LocalDateTime updateDateTime;

}
