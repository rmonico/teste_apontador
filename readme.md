# Teste do Monico


## Executando o projeto

Para rodar localmente:

`mvn spring-boot:run`

No arquivo `.zsh_autorun` existem scripts para 


## Escolha das ferramentas

- Java: usando java 11. Tentei usar java 14, porém tive problema com alguns plugins do Gradle.

- Gestor de dependências: Gradle, acho mais legível e fácil de manipular vários módulos.

- Persistência: Por questões de familiaridade vou usar o MongoDB. E para facilitar o deploy vou usar uma versão embarcada.

## Projeto

### Inicialização

Comecei criando o `pom.xml` do projeto. Apenas precisei mudar a versão do Java para 11, adicionar o parent pom do spring-boot e a dependência do spring-boot-starter-tests.

Criei o .gitignore rapidamente para as ferramentas que vou usar no projeto usando <https://gitignore.io>. Embora completamente opcional deixei um arquivo de licença no repositório. Criei pelo <https://choosealicense.com>. Escolhi a Apache License 2.0 pois obriga que qualquer uso dos fontes seja creditado.


### Arquitetura

Usei os princípios do Clean Architecture, pois torna as dependências mais portáveis, além, é claro, de se padrão do mercado.
