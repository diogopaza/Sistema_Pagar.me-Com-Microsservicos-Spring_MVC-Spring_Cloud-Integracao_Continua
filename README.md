# Sistema_Pagar.me-Com-Microsservicos-Spring_MVC-Spring_Cloud-Integracao_Continua

#Tecnologias e Arquiteturas

<h3>Comando para executar uma aplicação Spring via terminal</h3>
<p>& "c:\pasta-com-app-spring\mvnw.cmd" spring-boot:run -f "c:\pasta-com-app-spring\pom.xml"</p>

<h3>Gerando um nome aleatorio apra a aplicação</h3>
<p>No arquivo application.properties esta sendo definida a propriedade <strong>spring.application.name=fintech-diogo-usuarios-${random.int[1,10000]}, na qual é possível através do método random.uuid gerar um valor aleátorio com o método random, dessa forma cada aplicação que subir terá um nome diferente sendo possível identificá-las no service discovery em caso de necessidade. </strong></p>

<ul>
  <li>Tesstes unitarios com JUnit 5</li>
  <li>Arquitetura baseada em Microsserviços</li>
  <li>Docker</li>
  <li>AWS</li>
  <li>Circuit Breaker</li>
  <li>Infraestrutura como código</li>
 <li>Feign Client</li>
 <li>Gateway</li>
 <li>Discovery Service com Netflix Eureka</li>
  <p>Serviço de descoberta de microsserviços. O servidor esta na pasta server-eureka e roda na porta 8091.</p>
  <li> Spring Cloud Gateway</li>
  <p>O gateway esta na pasta gateway do projeto e está rodando na porta 8099.</p>
 <li>Load Balancer</li> 
</ul>
