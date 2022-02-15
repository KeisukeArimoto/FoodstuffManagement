package com.workspace.Entity.Request;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

/**
 * Item編集用のRequestオブジェクト
 * @author ari77
 *
 */
@Getter
@Setter
public class EditItemRequest {

	private long id;

	private String name;

	private double amount;

	private String unit;

	private LocalDate deadline;

	private String tag;
}
