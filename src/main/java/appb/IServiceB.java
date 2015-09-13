package appb;

import javax.ejb.Local;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Use;

@Local
@WebService(targetNamespace="http://appb/ServiceB")
@SOAPBinding(style=javax.jws.soap.SOAPBinding.Style.RPC, use=Use.LITERAL, parameterStyle=ParameterStyle.WRAPPED)
public interface IServiceB {

	int minus(int left, int right);
	
}
