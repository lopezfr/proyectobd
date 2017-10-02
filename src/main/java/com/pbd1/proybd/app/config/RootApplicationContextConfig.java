package com.pbd1.proybd.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Configuration;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "com.pbd1.proybd")
@Import({WebSecurityConfig.class})

public class RootApplicationContextConfig {
    /*private static final Logger LOG = LoggerFactory.getLogger(RootApplicationContextConfig.class);
      @Autowired
      private Environment env;
     *//**
 * Application custom initialization code.
 * <p/>
 * Spring profiles can be configured with a system property
 * -Dspring.profiles.active=javaee
 * <p/>
 *//*
 @PostConstruct
 public void initApp() {
    LOG.debug("Looking for Spring profiles...");
    if (env.getActiveProfiles().length == 0) {
        LOG.info("No Spring profile configured, running with default configuration.");
    } else {
        for (String profile : env.getActiveProfiles()) {
            LOG.info("Detected Spring profile: {}", profile);
            }
        }
    }*/
}
