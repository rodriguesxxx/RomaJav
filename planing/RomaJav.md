# Planing

<i>"No caos do desconhecido, o planejamento é a luz que ilumina o caminho à frente." - Desconhecido</i>

## structure

#### MVC - (MODEL, VIEW, CONTROLLER)

    romajav
    ├── src
    │   └── main
    │       ├── java
    │       │   └── com
    │       │       └── app
    │       │           ├── controller
    │       │           ├── service
    │       │           ├── model
    │       │           └── Application.java
    │       │           └── ApplicationRoutes.java
    │       └── resources
    │           ├── static
    │           ├── templates
    │           ├── application.properties
    │           └── ...
    └── pom.xml

### Fluxo do main
---
    - Application.java: incia a aplicacao
    - ApplicationRoutes.java: cria os endpoits e chama o controller para aquela requisicao em especifico
    - controller: Ao ser chamado um dos seus determinados controllers, o tal devera chamar o service solicitado(Exemplo: convert).
    -  model: O servico sendo chamado, ele podera chamar models(Exemplo: ConvertRomanAlgorithm)
    - Depois de todo esse fluxo, o resultado sera retornado para o view

### Fluxo do resources
---
    - static: vai o css/js/images
    - templates: As paginas do site, que seram redenrizadas com o Thymeleaf para exibir o conteúdo dinâmico na interface do usuário.
    - application.properties: Para algumas configuracoes de propriedades

## features 
 
 - converter romano para inteiro

 - converter inteiro para romano

 - fazer operacoes aritmeticas entre romanos e inteiros

 ## classes

 <a href="./UML">Acesse o diagrama</a>