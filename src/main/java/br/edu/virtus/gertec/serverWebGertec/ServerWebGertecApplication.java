package br.edu.virtus.gertec.serverWebGertec;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ServerWebGertecApplication {

	public static void main(String[] args) {

		SpringApplication application = new SpringApplication(ServerWebGertecApplication.class);
		application.setAdditionalProfiles("ssl");
		application.run(args);

		//SpringApplication.run(ServerWebGertecApplication.class, args);
	}
}
