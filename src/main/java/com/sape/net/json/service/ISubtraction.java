package com.sape.net.json.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-10-02T15:31:39.058+05:30
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://webservice.com/", name = "ISubtraction")
@XmlSeeAlso({ObjectFactory.class})
public interface ISubtraction {

    @WebMethod(action = "urn:Subtract")
    @RequestWrapper(localName = "subtract", targetNamespace = "http://webservice.com/", className = "com.webservice.Subtract")
    @ResponseWrapper(localName = "subtractResponse", targetNamespace = "http://webservice.com/", className = "com.webservice.SubtractResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int subtract(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );
}