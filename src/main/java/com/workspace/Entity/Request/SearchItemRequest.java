package com.workspace.Entity.Request;

import lombok.Data;

/**
 * Top画面Item検索用のRequestオブジェクト
 * @author ari77
 *
 */
@Data
public class SearchItemRequest {

	private String field;

	private String value;

}
