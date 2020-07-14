package org.example.springboot.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
public class DemoControllerITest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testGet() throws Exception {
        mockMvc.perform(get("/get").param("id", "1"))
                .andDo(print())
                .andExpect(content().string("Hello 1"));
    }
}
