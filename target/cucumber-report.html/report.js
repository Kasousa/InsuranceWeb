$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/org/web/features/InsuranceQuote.feature");
formatter.feature({
  "name": "Solicitar uma cotação de seguro",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@Insurance"
    }
  ]
});
formatter.background({
  "name": "Solicitação de seguro",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "[Seguro] - Preenchimento de todos os formulários para solicitação de seguro",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Insurance"
    },
    {
      "name": "@InsuranceTest-001"
    }
  ]
});
formatter.step({
  "name": "que preencho os dados do veículo",
  "keyword": "Dado "
});
formatter.match({
  "location": "org.web.steps.InsuranceQuoteStep.quePreenchoOsDadosDoVeiculo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho os dados do seguro",
  "keyword": "E "
});
formatter.match({
  "location": "org.web.steps.InsuranceQuoteStep.preenchoOsDadosDoSeguro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho os dados do produto",
  "keyword": "E "
});
formatter.match({
  "location": "org.web.steps.InsuranceQuoteStep.preenchoOsDadosDoProduto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho as opções de preço",
  "keyword": "E "
});
formatter.match({
  "location": "org.web.steps.InsuranceQuoteStep.preenchoAsOpcoesDePreco()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho a cotação",
  "keyword": "E "
});
formatter.match({
  "location": "org.web.steps.InsuranceQuoteStep.preenchoACotacao()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botão enviar cotação",
  "keyword": "Quando "
});
formatter.match({
  "location": "org.web.steps.InsuranceQuoteStep.clicoNoBotaoEnviarCotacao()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido que a cotação foi enviada com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "org.web.steps.InsuranceQuoteStep.validoQueACotacaoFoiEnviadaComSucesso()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});