package openmart.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableAutoConfiguration
@EnableZuulProxy
@CrossOrigin
@ComponentScan(basePackages = "openmart")
public class OpenMartApiGatewayApplication {
	@Bean
	public CustomZuulFilter customFilter() {
		return new CustomZuulFilter();
	}
	public static void main(String[] args) {
		SpringApplication.run(OpenMartApiGatewayApplication.class, args);
	}
}
