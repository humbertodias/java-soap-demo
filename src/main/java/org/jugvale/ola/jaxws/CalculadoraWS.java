package org.jugvale.ola.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class CalculadoraWS {

    @WebMethod
    public double fazerOp(@WebParam(name = "num1") double a, @WebParam(name = "num2") double b,
            @WebParam(name = "op") String op) {
        switch (op) {
        case "+":
            return a + b;
        case "-":
            return a - b;
        case "*":
            return a * b;
        case "/":
            return a / b;
        default:
            throw new IllegalArgumentException(
                    String.format("Operation '%s' not recognized. Should be  '+', '-', '*' ou '/'.", op));
        }
    }
}
