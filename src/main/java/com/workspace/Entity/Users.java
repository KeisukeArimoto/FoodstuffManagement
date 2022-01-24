package com.workspace.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Users")
public class Users {

	//ID
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long id;

	//名前
	@Column(nullable = false)
	private String name;

	//パスワード
	@Column(nullable = false)
	private String password;
}
