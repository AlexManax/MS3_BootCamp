package com.ms3.bootcamp.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.security.AuthProvider;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    @Autowired
//    private AuthProvider authProvider;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
//        http.authorizeRequests()
////                .antMatchers("/ships/1").anonymous()
//                .antMatchers("/*", "*/", "*/*").authenticated()
//                .and().csrf().disable()
//                .formLogin()
////                .loginPage("/login")
////                .loginProcessingUrl("/login/process")
//                .failureUrl("/?error=Bad credentials")
//                .and()
//                .logout();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user")
                .password("xxx")
                .roles("USER")
                .and()
                .withUser("admin")
                .password("xxx")
                .roles("ADMIN");

    }
}
