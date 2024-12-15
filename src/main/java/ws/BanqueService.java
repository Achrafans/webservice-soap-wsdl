package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
@WebService(serviceName = "banqueWs")
public class BanqueService {
    @WebMethod(operationName="conversionEuroToDh")
    public double conversion(double mt){
        return mt * 11;
    }
    @WebMethod(operationName="getCompte")
    public Compte getCompte(@WebParam(name= "code") int code){
        return new Compte(code, 1000 + Math.random()*9000, new Date());

    }
    @WebMethod(operationName="listComptes")
    public List<Compte> listComptes(){
        return List.of(
                new Compte(1, 1000 + Math.random()*9000, new Date()),
                new Compte(2, 1000 + Math.random()*9000, new Date()),
                new Compte(3, 1000 + Math.random()*9000, new Date())
        );
    }
}
