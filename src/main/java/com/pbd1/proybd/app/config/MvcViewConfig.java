package com.pbd1.proybd.app.config;

import java.util.List;
import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class MvcViewConfig {

    @Bean
    public ContentNegotiatingViewResolver contentNegotiatingViewResolver(ContentNegotiationManager manager) {
        ContentNegotiatingViewResolver contentNegotiatingViewResolver = new ContentNegotiatingViewResolver();
        List<ViewResolver> viewResolvers = new ArrayList<ViewResolver>();
        viewResolvers.add(internalResourceViewResolver());
        viewResolvers.add(beanNameViewResolver());
        contentNegotiatingViewResolver.setViewResolvers(viewResolvers );
        contentNegotiatingViewResolver.setContentNegotiationManager(manager);
        return contentNegotiatingViewResolver;
    }

    @Bean
    @Description("Default viewClass: JSTL view (JSP with html output)")
    public ViewResolver internalResourceViewResolver(){
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);
        bean.setPrefix("/WEB-INF/");
        bean.setSuffix(".jsp");
        return bean;
    }

    @Bean
    @Description("Used for 'xml' views")
    public ViewResolver beanNameViewResolver(){
        return new BeanNameViewResolver();
    }
}
