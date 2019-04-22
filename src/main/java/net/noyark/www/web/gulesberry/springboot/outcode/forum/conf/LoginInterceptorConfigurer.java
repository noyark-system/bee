package net.noyark.www.web.gulesberry.springboot.outcode.forum.conf;

import net.noyark.www.web.gulesberry.springboot.outcode.forum.interceptor.LoginIntercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class LoginInterceptorConfigurer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        HandlerInterceptor handlerInterceptor = new LoginIntercepter();

        List<String> patterns = new ArrayList<>();
        patterns.add("/js/**");

        registry.addInterceptor(handlerInterceptor).addPathPatterns("/**").excludePathPatterns(patterns);
    }
}
