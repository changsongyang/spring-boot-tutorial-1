package io.github.dunwu.springboot.service.impl;

import io.github.dunwu.springboot.service.MessageService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dev", "default"})
public class DevProfileService implements MessageService {

	@Value("${dunwu.message:Development Begin!}")
	private String message;

	@Override
	public String getMessage() {
		return this.message;
	}

}
