package com.workspace.SpringSeccurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class springSecurityConfig extends WebSecurityConfigurerAdapter {

	private final UserDetailsService userDetailsService;

	/**
	 * 認可の設定、ログイン・ログアウトの設定
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests() //認可に関する設定
		.antMatchers("/","login","login/reset").permitAll() //全員認可
		.antMatchers().hasRole("ADMIN") //ADMIN権限のみ認可
		.antMatchers().hasRole("USER") //USER権限で認可
		.anyRequest().authenticated(); //それ以外のパスは認証が必要

		http.formLogin() //ログインに関する設定
		.loginPage("/login") //認証受けてない場合、ログイン画面に遷移
		.loginProcessingUrl("/top"); //ログインボタンを押した後に遷移させるパス

		http.logout() //ログアウトに関する設定
		.logoutSuccessUrl("/login") //ログアウト後に遷移させるパス
		.deleteCookies("JSESSIONID") //ログアウト後、Cookieに保存されているセッションIDを削除
		.invalidateHttpSession(true) //ログアウト後、セッションを無効にする
		.permitAll();
	}


	/**
	 * 認証に関する設定
	 */
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception{

		auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
	}

	/**
	 * PasswordEncoderをBean定義
	 *
	 * @return PasswordEncoder
	 */
	//TODO なぜここでBean定義するのか？について説明できるようにする
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
