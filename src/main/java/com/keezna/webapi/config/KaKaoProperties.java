package com.keezna.webapi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ConfigurationProperties(prefix = "kakao")
public class KaKaoProperties {
	private String restApiKey;
	private String redirectUri;
}
