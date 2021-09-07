package calc;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface CalculadoraServer {
    @WebMethod int soma(int num1, int num2);
    @WebMethod int subtracao(int num1, int num2);
    @WebMethod int multiplicacao(int num1, int num2);
    @WebMethod float divisao(int num1, int num2);
}