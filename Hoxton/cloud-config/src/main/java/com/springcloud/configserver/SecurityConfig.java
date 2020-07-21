package com.springcloud.configserver;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable(); // 防止 csrf 攻击
        http.authorizeRequests()
                .antMatchers("/","/static/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .httpBasic()
        ;
    }
}
