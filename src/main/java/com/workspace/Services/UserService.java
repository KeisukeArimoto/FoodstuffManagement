package com.workspace.Services;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.workspace.Entity.AuthenticatedUser;
import com.workspace.Entity.Users;
import com.workspace.Repositories.UsersRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserService implements UserDetailsService {

	private final UsersRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		Users user = userRepository.findByName(name);
		if (user == null) {
			//TODO メッセージはプロパティで管理したい
			throw new UsernameNotFoundException("そのユーザー名は登録されていません。");
	    }
		return new AuthenticatedUser(user, getAuthorities(user));
	}

	private Collection<GrantedAuthority> getAuthorities(Users user) {
		return AuthorityUtils.createAuthorityList("ROLE_USER");
	}
}
