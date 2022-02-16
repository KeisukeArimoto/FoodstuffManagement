package com.workspace.Entity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class AuthenticatedUser implements UserDetails{

	private final Users user;
	private final Collection<GrantedAuthority> authorities;

	/**
	 * コンストラクタ
	 */
	public AuthenticatedUser(Users user, Collection<GrantedAuthority> authorities) {
		this.user = user;
		this.authorities = authorities;
	}

	public String getUsername() {
		return user.getName();
	}

	public String getPassword() {
		return user.getPassword();
	}

	public boolean isEnabled() {
		return true;
	}

	public Collection<GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public boolean isAccountNonExpired() {
		return true;
	}

	public boolean isAccountNonLocked() {
		return true;
	}

	public boolean isCredentialsNonExpired() {
		return true;
	}

	public Users getUsers() {
		return user;
	}
}
