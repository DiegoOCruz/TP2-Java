# Projeto Diegooliveiracruz

Este projeto é um exemplo de aplicação Java utilizando o framework Spring Boot. Ele inclui funcionalidades relacionadas à gestão de filiais e funcionários de uma empresa.

## Executando a aplicação

Para executar a aplicação, você pode utilizar uma IDE Java como o IntelliJ IDEA ou Eclipse. Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina.

## Como usar

A aplicação inclui duas entidades principais: Filial e Funcionário. Aqui está uma breve explicação de como usar cada uma delas:

### Filial

A classe `Filial` representa uma filial da empresa. Cada filial possui um nome e um CNPJ único. 

Você pode incluir uma nova filial utilizando o método `incluir` da classe `FilialService`, passando um objeto `Filial` como parâmetro.

Também é possível excluir uma filial utilizando o método `excluir`, informando o nome da filial a ser excluída.

### Funcionário

A classe `Funcionario` representa um funcionário da empresa. No momento da criação de um funcionário, é possível especificar seu nome, CPF, data de nascimento, salário e se possui curso superior.

Para calcular o salário líquido de um funcionário, utiliza-se o método `salarioLiquido()` da classe `Ti`. Esse cálculo considera um bônus de 10% sobre o salário base, caso o funcionário possua curso superior.

## Testes

O projeto inclui testes unitários para as classes `FilialService` e `Ti`. Esses testes garantem o correto funcionamento das funcionalidades de inclusão, exclusão e cálculo de salário.

## Próximos passos

Este projeto pode ser expandido de diversas formas, como a adição de novas funcionalidades, melhoria na estrutura do código, implementação de uma interface de usuário, entre outros.

Sinta-se à vontade para contribuir com novas ideias e melhorias!

---
*Este é um projeto de exemplo e não reflete um caso real de aplicação. Desenvolvido por Diego Oliveira da Cruz.*
