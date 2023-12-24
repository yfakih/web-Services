package server;

import jakarta.xml.ws.Endpoint;

public class WSServer {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8083/";
        Endpoint.publish(url, new BancService());
    }
}
