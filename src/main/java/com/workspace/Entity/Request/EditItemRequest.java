package com.workspace.Entity.Request;

import java.time.LocalDate;

import lombok.Data;

/**
 * Item編集用のRequestオブジェクト
 * @author ari77
 *
 */
@Data
public class EditItemRequest {
	private String name;

	private double amount;

	private String unit;

	private LocalDate deadline;

	private String tag;
}
