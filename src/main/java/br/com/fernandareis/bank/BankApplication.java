package br.com.fernandareis.bank;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication {
	  
	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}

}
