package uz.umidbek.tiny.url;

import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

public class Main {
    public static final String BASE_URI = "http://localhost:8080/";

    public static void main(String[] args) throws IOException {
        ResourceConfig config = new ResourceConfig().packages("uz.umidbek.tiny.url");

        // Start Grizzly HTTP server
        var server = GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), config);
        System.out.println("Jersey server started at: " + BASE_URI);
        System.out.println("Press CTRL+C to stop the server...");
    }
}
