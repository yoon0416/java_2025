package com.company.boot004.member;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration // 스프링부트 설정 관리

@EnableWebSecurity // 스프링시큐리티 활성화 (SecurityFilterChain 사용)

public class SecurityConfig {
	
	// 1. url
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception { // 요청 URL 보안 설정 / 페이지접근 가능or불가능한 인가 설정
		//http.authorizeHttpRequests().formLogin().logout();
		// 1-1. 로그인을 안하더라도 모든페이지 접근 가능
		// /admin/** , /user/**,,,
		http.authorizeHttpRequests(
				(authorizeHttpRequests) -> authorizeHttpRequests
											//admin만 접근가능
//											.requestMatchers( new AntPathRequestMatcher("/admin") )
//											.hasRole("ROLE_ADMIN") // 어드민만 접근 가능
											//member만 접근가능
//											.requestMatchers( new AntPathRequestMatcher("/member") )
//											.hasRole("ROLE_MEMBER") // 멤버만 접근 가능
											//기타페이지 모두 접근가능 (로그인 필요없음)
											.requestMatchers( new AntPathRequestMatcher("/**") ) // 모든 경로 (/**) 매칭 (모든 URL)
											.permitAll() // 누구나 접근 가능 (로그인 필요 없음)
		).formLogin( 		// 1-2. form 만든 폼 - login
			(formLogin) -> formLogin
								.loginPage("/member/login")
								.defaultSuccessUrl("/member/member")
			 
		).logout(		// 1-3. logout
				(logout)-> logout
							.logoutRequestMatcher( new AntPathRequestMatcher("/member/logout") )
							.logoutSuccessUrl("/member/login")
							.invalidateHttpSession(true)
 				
		);
		return http.build(); 
	}
	
	// 2. AuthenticationManager - 사용자인증시 Service와 PasswordEncoder를 사용함 / 요청을 서비스에 넘김 컨트롤러 같은놈
	@Bean
	AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception { // 로그인 처리 매니저
		return authenticationConfiguration.getAuthenticationManager(); // 기본 인증 매니저 가져옴
	}
	
	// 3. PasswordEncoder - 비번암호화
	@Bean
	PasswordEncoder passwordEncoder() { // 비번 암호화 객체
		return new BCryptPasswordEncoder(); // BCrypt 방식 사용 랜덤솔트 만들어주는 알고리즘 메서드 가져온다고 생각
	}
	
}
