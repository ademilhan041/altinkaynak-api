package com.acarsan.fx.altinkaynak;

import com.acarsan.fx.altinkaynak.dto.resp.Currency;
import com.acarsan.fx.altinkaynak.dto.resp.CurrencyList;
import com.acarsan.fx.altinkaynak.dto.wsdl.AuthHeader;
import com.acarsan.fx.altinkaynak.dto.wsdl.DataService;
import com.acarsan.fx.altinkaynak.dto.wsdl.DataServiceSoap;
import com.sun.xml.ws.api.message.Headers;
import com.sun.xml.ws.developer.WSBindingProvider;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;
import java.util.List;

public class AltinKaynakClient {
    public List<Currency> getCurrList() throws Exception {
        DataService service = new DataService();
        DataServiceSoap port = service.getDataServiceSoap();

        AuthHeader header = new AuthHeader();
        header.setUsername("AltinkaynakWebServis");
        header.setPassword("AltinkaynakWebServis");
        WSBindingProvider bp = (WSBindingProvider) port;

        bp.setOutboundHeaders(Headers.create(JAXBContext.newInstance(AuthHeader.class), header));

        JAXBContext currContext = JAXBContext.newInstance(CurrencyList.class);
        Unmarshaller jaxbUnmarshaller = currContext.createUnmarshaller();

        return ((CurrencyList) jaxbUnmarshaller.unmarshal(new ByteArrayInputStream(port.getCurrency().getBytes()))).getCurrList();
    }
}
