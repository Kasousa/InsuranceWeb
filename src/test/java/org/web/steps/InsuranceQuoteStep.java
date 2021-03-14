package org.web.steps;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.web.massa.enums.*;
import org.web.pages.*;

import java.util.Map;

import static org.web.massa.ApiDocReader.getCSVTestData;
import static org.web.support.ThreadDriver.getTDriver;

public class InsuranceQuoteStep {
    VehicleDataPage vehicleData;
    InsuranceDataPage insuranceData;
    ProductDataPage productData;
    PriceOptionPage priceOption;
    SendQuotePage sendQuote;
    Map<String, String> data;

    @Before
    public void initPages() {
        if (vehicleData == null) { vehicleData = new VehicleDataPage(getTDriver()); }
        if (insuranceData == null) { insuranceData = new InsuranceDataPage(getTDriver()); }
        if (productData == null) { productData = new ProductDataPage(getTDriver()); }
        if (priceOption == null) { priceOption = new PriceOptionPage(getTDriver()); }
        if (sendQuote == null) { sendQuote = new SendQuotePage(getTDriver()); }
    }

    public String getData (Object key){
        return data.get(key.toString());
    }

    @Dado("que preencho os dados do veículo")
    public void quePreenchoOsDadosDoVeiculo () throws Exception {
        data = getCSVTestData (TestsEnum.vehicleData);

        vehicleData.writeMake(getData(VehicleDataEnum.make));
        vehicleData.writeModel(getData(VehicleDataEnum.model));
        vehicleData.writeCylinderCapacity(getData(VehicleDataEnum.cylinderCapacity));
        vehicleData.writeEnginePerformance(getData(VehicleDataEnum.enginePerformance));
        vehicleData.writeDateOfManufacture(getData(VehicleDataEnum.dateOfManufacture));
        vehicleData.writeNumberOfSeats(getData(VehicleDataEnum.numberOfSeats));
        vehicleData.clickRightHandDriveYes();
        vehicleData.writeNumberOfSeatsMotorcycle(getData(VehicleDataEnum.numberOfSeatsMotorcycle));
        vehicleData.writeFuelType(getData(VehicleDataEnum.fuelType));
        vehicleData.writePayload(getData(VehicleDataEnum.payload));
        vehicleData.writeTotalWeight(getData(VehicleDataEnum.totalWeight));
        vehicleData.writelistPrice(getData(VehicleDataEnum.listPrice));
        vehicleData.writelicensePlateNumber(getData(VehicleDataEnum.licensePlateNumber));
        vehicleData.writeAnnualMileage(getData(VehicleDataEnum.annualMileage));

        Assert.assertEquals("Não foram preenchidos todos os campos da tela de veiculo", "0", vehicleData.getCounter());
        vehicleData.clickNext();
    }

    @Dado("preencho os dados do seguro")
    public void preenchoOsDadosDoSeguro () throws Exception {
        data = getCSVTestData (TestsEnum.insuranceData);

        insuranceData.writeFirstName (getData(InsuranceDataEnum.firstName));
        insuranceData.writeLastName (getData(InsuranceDataEnum.lastName));
        insuranceData.writeDateOfBirth (getData(InsuranceDataEnum.dateOfBirth));
        insuranceData.clickMale();
        insuranceData.writeStreetAddress (getData(InsuranceDataEnum.streetAdress));
        insuranceData.writeCountry (getData(InsuranceDataEnum.country));
        insuranceData.writeZIPCode (getData(InsuranceDataEnum.ZIPCode));
        insuranceData.writeCity (getData(InsuranceDataEnum.city));
        insuranceData.writeOccupation (getData(InsuranceDataEnum.occupation));
        insuranceData.clickSpeeding();
        insuranceData.writeWebsite (getData(InsuranceDataEnum.website));

        Assert.assertEquals("Não foram preenchidos todos os campos da tela de insurance", "0", insuranceData.getCounter());
        insuranceData.clickNext();
    }

    @Dado("preencho os dados do produto")
    public void preenchoOsDadosDoProduto () throws Exception {
        data = getCSVTestData (TestsEnum.productData);

        productData.writeStartDate (getData(productDataEnum.startDate));
        productData.writeInsuranceSum (getData(productDataEnum.insuranceSum));
        productData.writeMeritRating (getData(productDataEnum.meritRating));
        productData.writeDamageInsurance (getData(productDataEnum.damageInsurance));
        productData.clickEuroProtection ();
        productData.writeCourtesyCar (getData(productDataEnum.courtesyCar));

        Assert.assertEquals("Não foram preenchidos todos os campos da tela de produto", "0", productData.getCounter());
        productData.clickNext();
    }

    @Dado("preencho as opções de preço")
    public void preenchoAsOpcoesDePreco (){
        priceOption.clickSilverOption();
        priceOption.clickGoldOption();
        priceOption.clickPlatinumOption();
        priceOption.clickUltimateOption();

        Assert.assertEquals("Não foram preenchidos todos os campos da tela de preço", "0", priceOption.getCounter());
        priceOption.clickNext();
    }

    @Dado("preencho a cotação")
    public void preenchoACotacao () throws Exception {
        data = getCSVTestData (TestsEnum.sendQuote);

        sendQuote.writeEmail (getData(SendQuoteEnum.email));
        sendQuote.writePhone (getData(SendQuoteEnum.phone));
        sendQuote.writeUsername (getData(SendQuoteEnum.username));
        sendQuote.writePassword (getData(SendQuoteEnum.password));
        sendQuote.writeConfirmPassword (getData(SendQuoteEnum.confirmPassword));
        sendQuote.writeComments (getData(SendQuoteEnum.comments));

        Assert.assertEquals("Não foram preenchidos todos os campos da tela de cotação", "0", sendQuote.getCounter());
    }

    @Quando("clico no botão enviar cotação")
    public void clicoNoBotaoEnviarCotacao () {
        sendQuote.clickSend();
    }

    @Então("valido que a cotação foi enviada com sucesso")
    public void validoQueACotacaoFoiEnviadaComSucesso () {
        Assert.assertEquals("A cotação não foi enviada", "Sending e-mail success!", sendQuote.getConfirmationStatus());
    }
}
