package client;

import proxy.BanqueService;
import proxy.BanqueWs;
import proxy.Compte;

public class ClientWs {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWs().getBanqueServicePort();
        Compte cp = proxy.getCompte(4);
        System.out.println("------------------");
        System.out.println(cp.getSolde());
        System.out.println(cp.getDateCreation());
        System.out.println(cp.getCode());



    }
}
