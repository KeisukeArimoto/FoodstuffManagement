package com.workspace.Entity.Request;

import java.time.LocalDate;

import lombok.Data;

/**
 * Top画面Item検索用のRequestオブジェクト
 * @author ari77
 *
 */
@Data
public class AddNewItemRequest {

	private String name;

	private double amount;

	private String unit;

	private LocalDate deadline;

	private String tag;
}
