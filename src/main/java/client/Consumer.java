package client;

import stub.BancService;
import stub.BanqueWS;

public class Consumer {
    public static void main(String[] args) {
        BancService proxy = new BanqueWS().getBancServicePort();
        System.out.println(proxy.newAccount(10, "ghj"));
    }
}
