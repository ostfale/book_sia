package de.ostfale.sbsia.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


/**
 * Instead of  @SpringBootTest markup, HomeControllerTest is annotated with @WebMvcTest. This
 * is a special test annotation provided by Spring Boot that arranges for the test to run in
 * the context of a Spring MVC application. More specifically, in this case, it arranges for
 * HomeController to be registered in Spring MVC so that you can throw requests
 * against it. @WebMvcTest also sets up Spring support for testing Spring MVC. Although it
 * could be made to start a server, mocking the mechanics of Spring MVC is sufficient for
 * your purposes. The test class is injected with a MockMvc object for the test to drive the
 * mockup.
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
