package com.pbd1.proybd.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    //@Autowired
    //private AuthenticationService authenticationService;

    @Override
    protected void configure(HttpSecurity http) throws Exception{
      http
              .authorizeRequests()
              .antMatchers("/", "/dist/**", "/login", "/welcome").permitAll()
              .antMatchers("/estadoCuenta/**", "/proveedor/**").access("hasRole('ADMIN')")
              .anyRequest().authenticated()
              .and()
              .formLogin()
              .loginPage("/login")
              .failureUrl("/login?error")
              .defaultSuccessUrl("/inicio")
              .and()
              .logout()
              .logoutSuccessUrl("/login?logout")
              .and()
              .csrf().disable();
    }
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
        auth
               .inMemoryAuthentication()
                .withUser("test").password("123").roles("USER");
    }
    /*
    @Override
    public void configure(WebSecurity web) throws Exception {
    web.ignoring().antMatchers("/services*//**", "/api*//**");
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    BCryptPasswordEncoder encoder = passwordEncoder();
    auth.userDetailsService(authenticationService).passwordEncoder(encoder);
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
    }*/
}
