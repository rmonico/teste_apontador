# Teste do Monico


## Executando o projeto

Para rodar localmente:

`docker-compose up`

A partir da pasta do projeto. Sobe o client e o server.

Também é possível rodar individualmente os containeres de back e frontend (a partir das respectivas pastas):

Backend: 
`docker run --publish 8080 --detach=true rmonico/teste_apontador_backend:dev`

Frontend: 
`docker run --publish 4200 --detach=true rmonico/teste_apontador_frontend:dev`

Ainda é possível rodar os projetos individualmente fora dos respectivos containers:

Backend:
`./gradlew bootRun`

Frontend:
`ng serve`

Como não terminei a parte de criar nova localização, é possível criar novas localizações com acesso direto à API. O script `backend/.zsh_autorun` possui uma função create_location que automatiza isso. Caso seja invocada sem parâmetros seu texto de ajuda é mostrado.

Os script `.zsh_autorun` são usados para adicionar automaticamente algumas funções ao contexto do projeto ao entrar na pasta.
É possível adicionar as funções usando `source .zsh_autorun` a partir da pasta principal do projeto (não testei, mas acho que também funciona com bash) ou dos subprojetos de backend e frontend.

Opcional: Para habilitar a funcionalidade de source automatico dos .zsh_autorun, é necessário usar o [zshell](https://www.zsh.org/) e adicionar as seguintes linhas ao arquivo `~/.zshrc`:


```ShellScript
autoload -U add-zsh-hook

load-local-conf() {
    # check file exists, is regular file and is readable
    if [[ -f .zsh_autorun && -r .zsh_autorun ]]; then
        source .zsh_autorun
    fi
}

add-zsh-hook chpwd load-local-conf
```

Ao entrar na pasta será mostrado uma mensagem indicando quais variáveis e funções foram criadas automaticamente. A função `workoff` presente em todos os arquivos `.zsh_autorun` remove as funções e variáveis criadas.


## Escolha das ferramentas

- Java: usando java 11. Tentei usar java 14, porém tive problema com alguns plugins do Gradle.

- Gestor de dependências: Gradle, acho mais legível e fácil de manipular vários módulos.

- Persistência: Não há, os dados apenas estão ficando em memória. Como foi usado arquitetura limpa, o módulo de repository está bem desacoplado do resto do projeto, então seria fácil implantar persistência. Por esse motivo resolvi não implementar persistência "de fato".


## Projeto

### Inicialização

Comecei criando o `pom.xml` do projeto. Apenas precisei mudar a versão do Java para 11, adicionar o parent pom do spring-boot e a dependência do spring-boot-starter-tests.

Criei o .gitignore rapidamente para as ferramentas que vou usar no projeto usando <https://gitignore.io>. Embora completamente opcional deixei um arquivo de licença no repositório. Criei pelo <https://choosealicense.com>. Escolhi a Apache License 2.0 pois obriga que qualquer uso dos fontes seja creditado.

Dado que a vaga pede conhecimento em Angular, e eu possuo conhecimento em HTML/CSS/JavaScript, mas não em angular, decidi fazer o front usando esta tecnologia.


### Arquitetura

Usei os princípios do Clean Architecture, pois torna as dependências mais portáveis, além, é claro, de se padrão do mercado.


### Pontos fortes e fracos

- Tive problemas com a parte de CORS para fazer o deploy no AWS. Localmente funciona, no AWS consegui fazer os dois serviços subirem individualmente, mas não consigo faze-los se comunicar entre si (mesmo estando na mesma máquina).

- Acabei usando boa parte do meu tempo descobrindo como usar o Angular (e provavelmente ainda não usei da melhor forma), pois não tinha experiência anterior com a tecnologia. Dado o tempo que tinha e o fato de ser o primeiro contato com a tecnologia acho que me sai bem. Por conta outras funcionalidades importantes (e relativamente fáceis) acabaram ficando de lado como Swagger, persistência física e deploy em AWS.

- Acredito que testes de unidade sejam essenciais para um mínimo de qualidade. Todavia o teste não teve foco na regra de negócio (mas na integração entre ferramentas), por esse motivo não vi muito problema em deixar os testes um pouco de lado. De qualquer, há uma classe de testes (do back) em: testemonico.repository.InMemoryLocationRepositoryTest

- Acabei não fazendo a função de criar nova localização no frontend. Porém, é possível criar através de curl, há função para isso no arquivo `backend/.zsh_autorun`

- Talvez a arquitetura do backend seja o ponto mais forte desse projeto. Usei os princípios de Clean Architecture que desacoplam as regras de negócio do restante do projeto.

- Abstrações para facilitar a criação de novas entidades e suas principais funcionalidades de manipulação de dados. Ver:
  - Classe testemonico.domain.entity.Entity
  - Pacotes testemonico.usecase.base.crud, testemonico.repository.AbstractInMemoryRepository, testemonico.controller.CrudController, testemonico.spring.controller.SpringCrudController

- Facilidade de leitura do código de uma forma geral.

