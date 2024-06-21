package br.com.danieleleaoe.deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class DeployRender {

	public static void main(String[] args) {
		SpringApplication.run(DeployRender.class, args);
	}

}
