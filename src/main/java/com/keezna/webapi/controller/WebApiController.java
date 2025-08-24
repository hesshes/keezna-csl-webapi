package com.keezna.webapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class WebApiController {

	@RequestMapping("/image/convert")
	public void test() {
		log.info("request");
	}

}
