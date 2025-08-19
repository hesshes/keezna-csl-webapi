package com.keezna.webapi.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Configuration
@EnableConfigurationProperties({ KaKaoProperties.class })
public class AppConfig {

	private final KaKaoProperties kakaoPoProperties;

	public KaKaoProperties kakao() {
		return this.kakaoPoProperties;
	}

}
