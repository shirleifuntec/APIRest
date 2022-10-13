package Funtec.meuprimeirowebapi.doc;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration  //é uma classe de configuração
@EnableSwagger2 //habilitando a doc do swagger
public class SwaggerConfig {

	//contato da nossa api
	private Contact contato() {
		return new Contact(
				"Seu nome",
				"http//seusite.com.br",
				"shirleifuntec@gmail.com");
				
	}
	
	//Informações da API
	private ApiInfoBuilder informacoesApi() {
		
		ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
		
		apiInfoBuilder.title("Title - Rest Api");
		apiInfoBuilder.description("Api exemplo de uso de SpringBoot Rest Api");
		apiInfoBuilder.version("1.0");
		apiInfoBuilder.termsOfServiceUrl("Termo de usso: Open Source");
		apiInfoBuilder.license("Licença - sua empresa");
		apiInfoBuilder.licenseUrl("http://www.seusite.com.br");
		apiInfoBuilder.contact(this.contato());
		
		return apiInfoBuilder;
	
	}
	
	//como se trata de uma palicação SpringBoot, vamos criar um Docket(documento) em forma de @bean
	@Bean
	public Docket detalheApi() {
		Docket docket = new Docket(DocumentationType.SWAGGER_2);
		
		docket
		
		.select()
		.apis(RequestHandlerSelectors.basePackage("pacote.comseus.controllers"));
		
			return docket;
	}
	
	
}
