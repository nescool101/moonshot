package com.restapi.employeeapi.service;


import com.restapi.employeeapi.dto.Add;
import com.restapi.employeeapi.dto.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class CountryClient extends WebServiceGatewaySupport {

    private static final Logger logger = LoggerFactory.getLogger(CountryClient.class);

    public Result getCountry(String country) {

        Add request = new Add();
        request.setArg0(1);
        request.setArg1(2);

        logger.info("Requesting information for " + country);

        Result response = (Result) getWebServiceTemplate().marshalSendAndReceive(request);

        return response;
    }

}