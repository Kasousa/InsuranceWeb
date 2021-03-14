#language: pt

@Insurance
Funcionalidade: Solicitar uma cotação de seguro

  Contexto: Solicitação de seguro

  @InsuranceTest-001
  Cenario: [Seguro] - Preenchimento de todos os formulários para solicitação de seguro
    Dado que preencho os dados do veículo
    E preencho os dados do seguro
    E preencho os dados do produto
    E preencho as opções de preço
    E preencho a cotação
    Quando clico no botão enviar cotação
    Então valido que a cotação foi enviada com sucesso
