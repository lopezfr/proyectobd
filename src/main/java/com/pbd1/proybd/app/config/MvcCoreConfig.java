package com.pbd1.proybd.app.config;

import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
@EnableWebMvc
@Import(MvcViewConfig.class)
@ComponentScan(basePackages = {"com.pbd1.proybd"})
public class MvcCoreConfig extends WebMvcConfigurerAdapter{

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer){
        configurer.ignoreAcceptHeader(true);
        configurer.defaultContentType(MediaType.TEXT_HTML);
        configurer.mediaType("html", MediaType.TEXT_HTML);
        configurer.mediaType("xml", MediaType.APPLICATION_XML);
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
        // Serve static resources (*.html, ...) from src/main/webapp/
        configurer.enable();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        // all resources inside folder src/main/webapp/resources are mapped so
        // they can be refered to inside JSP files (see header.jsp for more details)
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
        // uses WebJars so Javascript and CSS libs can be declared as Maven dependencies (Bootstrap, jQuery...)
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName("welcome");
    }

    @Bean(name="messageSource")
    @Description("Message source for this context, loaded from localized 'messages_xx' files.")
    public ReloadableResourceBundleMessageSource reloadableResourceBundleMessageSource(){
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasenames("classpath:messages/messages");
        return messageSource;
    }

    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers){
        SimpleMappingExceptionResolver exceptionResolver = new SimpleMappingExceptionResolver();
        // results into 'WEB-INF/jsp/exception.jsp'
        exceptionResolver.setDefaultErrorView("exception");
        // needed otherwise exceptions won't be logged anywhere
        exceptionResolver.setWarnLogCategory("warn");
        exceptionResolvers.add(exceptionResolver);
    }

}
