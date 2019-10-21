#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Criar massa de dados - Reserva
    Given acessei o site da newtours
    Then realizando o login com sucesso
    And acesso a página "Flight Finder"
    When pego valores da planilha Excel
    And Continuo a reserva
    Then Seleciono valores de acordo com a planilha
    And Preencho os dados da passagens
    And E armazeno o número da ordem no Excel
