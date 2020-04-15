package de.ostfale.sbsia.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


/**
 * JUnit 5 test for controller
 * Created :  15.04.2020
 *
 * @author : Uwe Sauerbrei
 */
@WebMvcTest
class HomeControllerTest {

    @Autowired
    MockMvc mvc;

    @Test
    public void testHomePage() throws Exception {
        mvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"))
                .andExpect(content().string(containsString("Welcome to...")));

    }
}
