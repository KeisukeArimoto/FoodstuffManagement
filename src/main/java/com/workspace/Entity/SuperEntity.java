package com.workspace.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PreUpdate;

import lombok.Getter;
import lombok.Setter;

/**
 * すべてのエンティティのスーパークラス
 * 更新日時と更新ユーザー名を編集
 * @author ari77
 *
 */
@Getter
@Setter
@MappedSuperclass
public class SuperEntity {

	//更新ユーザー
	@Column
	private String updateUser;

	//更新日時
	@Column
	private LocalDateTime updateDateTime;

	@PreUpdate
	public void update() {
		setUpdateDateTime(LocalDateTime.now());

		//TODO:更新ユーザーにおいて、セッション情報からログイン中のユーザー名を入れる
	}
}
