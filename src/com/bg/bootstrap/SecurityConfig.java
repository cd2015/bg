package com.bg.bootstrap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

//@Configuration
//@EnableWebSecurity
//@Import({PersistanceConfig.class })
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	DataSource dataSource;
	

	private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    	auth
    		.jdbcAuthentication()
    			.dataSource(dataSource)
    			//.passwordEncoder(passwordEncoder)
    			.usersByUsernameQuery(
    					"SELECT email,password,enabled FROM forex_beaural WHERE email=?")
    				.authoritiesByUsernameQuery(
    					"SELECT forex_beaural.email, authorities.authority FROM forex_beaural INNER JOIN authorities ON forex_beaural.id = authorities.entity_id WHERE email=?");

    }
    
    @Override
	protected void configure(HttpSecurity http) throws Exception {
 
	  http
	  	.authorizeRequests()
	  		.antMatchers("/").permitAll()
			.and()
		.formLogin()
			.loginPage("/login")
			.permitAll()
			.usernameParameter("email").passwordParameter("password")
	  		.and()
	  .logout()
          	.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
          	.permitAll()
          	.and()
       .rememberMe()
       		.key("pplCalender");
	  		
 
	}
    
    @Bean
    public HttpSessionRequestCache requestCache()
    {
    	return new HttpSessionRequestCache();
    }
    
    @Bean(name="authenticationManager")
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}
