package com.paypal.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistration.Builder;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;

@Configuration
public class SpringSecurity extends WebSecurityConfigurerAdapter {
    @Override
//    This method is to tell springboot app that we are going to use oauth2 login facility
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().authenticated().and().oauth2Login();
    }


//    We can actually replace the below two methods by configuring with two properties: client-id and secret-id in application.properties file
//    spring.security.oauth2.client.registration.github.client-id=de2ecfc7ba8cad25f1ac
//    spring.security.oauth2.client.registration.github.client-secret=ba85d8c8925cbea1ad5f1935c6e99c4d527d72d2

////    This configuration is to tell spring framework that we are going to use github oauth2 for authentication
//    public ClientRegistration getClientRegistration(){
//        Builder value = CommonOAuth2Provider.GITHUB.getBuilder("github");
//        return value.clientId("de2ecfc7ba8cad25f1ac").clientSecret("ba85d8c8925cbea1ad5f1935c6e99c4d527d72d2").build();
//    }

////    This is to create ClientRegistrationRepository bean in the spring context
//    @Bean
//    public ClientRegistrationRepository getClientRegistrationRepository(){
//        return new InMemoryClientRegistrationRepository(getClientRegistration());
//    }
}