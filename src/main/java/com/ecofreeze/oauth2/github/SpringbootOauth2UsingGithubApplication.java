package com.ecofreeze.oauth2.github;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class SpringbootOauth2UsingGithubApplication {
	
	@GetMapping("/")
	public String message(Principal principal) {
		
		return principal.getName() + " welcome SS";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootOauth2UsingGithubApplication.class, args);
	}

}
