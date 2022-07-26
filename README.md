# Documentação com Swagger
Esse é um projeto que faz parte da minha caixa de ferramentas no github, simplesmente para guardar os conceitos de aplicação do Swagger, caso eu precise futuramente.

## Dependências utilizadas
A dependência abaixo é a implementação do Swagger, serve para processar e identificar as API's do projeto.
```
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.9.2</version>
</dependency>
```
A dependência abaixo ajudar a navegar graficamente pela documentação da API.
```
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.9.2</version>
</dependency>
```
Endpoint disponibilizado pela dependência acima:
```
swagger-ui.html
```
## Classe de configuração
```
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class)).paths(PathSelectors.any())
				.build();
	}
}
```
## Configuração adicional para liberar o acesso ao Swagger
```
web.ignoring().antMatchers("/v2/api-docs", "/configuration/ui", "/swagger-resources/**", "/configuration/**", "/swagger-ui.html", "/webjars/**");
```
## Detalhes da tela de documentação
- 1: Ao acessar o endpoint do Swagger, conseguimos obter os endpoints do projeto, abaixo mais detalhes:
![image](https://user-images.githubusercontent.com/100853329/180645573-f388368e-acaa-44c4-9d13-32380799cb66.png)

- 2: Ao acessar o detalhamento dos endpoints existentes no projeto, podemos observar que é detalhado todos verbos existentes:
![image](https://user-images.githubusercontent.com/100853329/180645660-b02bb382-85f2-4ad5-94de-cd1cb8340910.png)

- 3: Ao acessar os detalhes de um determinado endpoint(No caso abaixo foi o endpoint "insert" do "/categories"), podemos entender o retorno esperado do endpoint, e os detalhes do mesmo.
![image](https://user-images.githubusercontent.com/100853329/180645724-dbfc0cd2-02e7-4b37-9ebc-cadb06de9f1a.png)
