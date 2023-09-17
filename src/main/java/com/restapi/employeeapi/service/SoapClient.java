package com.restapi.employeeapi.service;

import com.restapi.employeeapi.dto.Add;
import com.restapi.employeeapi.dto.AddResponse;
import com.restapi.employeeapi.dto.Result;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class SoapClient extends WebServiceGatewaySupport {

    public int add(Add add) {
        // The AddRequest and AddResponse classes are generated from the WSDL
        Add request = new Add();
        request.setArg0(1);
        request.setArg1(1);

        AddResponse response = (AddResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://example.com/SoapService",
                        request,
                        new SoapActionCallback("http://example.com/Add"));

        return response.getReturn();
    }
}
