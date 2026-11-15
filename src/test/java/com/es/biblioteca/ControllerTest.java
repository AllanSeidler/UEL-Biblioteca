package com.es.biblioteca;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(Controller.class)
class ControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void helloWorld() throws Exception {
		mockMvc.perform(get("/"))
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello, World!")));
	}

	@Test
	void helloWorldWithName() throws Exception {
		mockMvc.perform(get("/").param("name", "Murilo"))
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello, Murilo!")));
	}

}
