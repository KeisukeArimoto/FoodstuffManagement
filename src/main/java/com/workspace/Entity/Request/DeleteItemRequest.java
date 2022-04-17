package com.workspace.Entity.Request;

import lombok.Data;

/**
 * Item削除用リクエスト
 * @author ari77
 *
 */
@Data
public class DeleteItemRequest {

	private String deleteReason;
}
