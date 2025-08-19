package com.keezna.webapi.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
@ActiveProfiles("dev")
public class ConfigTests {

	@Value("${kakao.rest-api-key}")
	private String restApiKey;

	@Test
	public void getProperties() {
		log.info("restApiKey value : {}", restApiKey);

	}
}
