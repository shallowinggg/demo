package org.example.springboot.controller;

import org.example.springboot.service.DemoService;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

/**
 * @author shallowinggg
 * @date 2020/7/14
 */
@WebMvcTest(DemoController.class)
public class DemoControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    DemoService demoService;

    @Test
    public void testGet() throws Exception {
        BDDMockito.given(demoService.foo(1)).willReturn("Hello 10");

        mockMvc.perform(get("/get").param("id", "1"))
                .andDo(print())
                .andExpect(content().string("Hello 10"));
    }
}
