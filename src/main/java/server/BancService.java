package server;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BancService {

    private static List<Account> accs = new ArrayList<>();

    @WebMethod(operationName = "convertToMAD")
    public double convert(@WebParam(name = "montant" ) double mt){
        return mt * 11;
    }

    @WebMethod(operationName = "newAccount")
    public Account newAcc(@WebParam(name = "Num") int num, @WebParam(name = "Nom") String nom){
        Account account = new Account((long) num, nom, Math.random()*100_000);
        accs.add(account);
        return account;
    }

    @WebMethod(operationName = "listAccounts")
    public List<Account> listAccs() {
        return accs;
    }

}
