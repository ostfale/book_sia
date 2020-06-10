package de.ostfale.sbsia.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * The most significant thing to notice about WebConfig is that it implements the
 * Web-MvcConfigurer interface. WebMvcConfigurer defines several methods for configuring
 * Spring MVC. Even though it’s an interface, it provides default implementations of all the
 * methods, so you only need to override the methods you need.
 * Created :  04.06.2020
 *
 * @author : Uwe Sauerbrei
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
    }
}

