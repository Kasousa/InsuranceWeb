# InsuranceWeb 
Projeto de automação de testes web, escrito em JAVA, para testes do website Vehicle Insurance Application  

## Instalação  

1 - Clone o projeto do git com o comando:  
**git clone https://github.com/Kasousa/InsuranceWeb.git**  
2 - Utilize a IDE de sua preferência, Eclipse, Intelij.. importando o projeto como maven e aguardando serem baixadas todas as dependências  

## Execução

1 - Via linha de comando, enviando comando "mvn test"  
2 - Clicando com o botão direito na classe "BaseTest" e selecionando a opção "Run"  

## Sobre o framework  

- configs -> Pasta com o arquivo de configurações do framework (URL base e Timeouts)
- src 
    - test
        - java/org/web 
            - actions -> Tratamento das ações de clique, escrita, leitura e etc
            - features -> Arquivos .feature com o BDD do Cucumber
            - massa -> massa de dados do teste, todas as informações escritas no formulário
            - pages -> Classes com as declarações dos elementos das páginas
            - steps -> Classes contendo o passo a passo dos testes
            - support -> Classes de suporte do framework
            - BaseTest -> Classe base do Cucumber para execução dos testes

&copy; Kaique Santos Sousa - 2021