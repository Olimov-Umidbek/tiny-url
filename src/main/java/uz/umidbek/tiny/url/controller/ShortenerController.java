package uz.umidbek.tiny.url.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriBuilder;
import uz.umidbek.tiny.url.service.ShortenerService;

import java.net.URI;

@Path("/")
public class ShortenerController {

    private final ShortenerService service;

    public ShortenerController(ShortenerService service) {
        this.service = service;
    }

    @POST()
    @Path("/shortener")
    public Response shortener(String url) {
        return Response.ok(
            service.shortener(url)
        ).build();
    }

    @GET
    @Path("/{url}")
    public Response redirect(@PathParam("url") String shortUrl) {
        URI uri = UriBuilder
            .fromUri(service.getOriginal(shortUrl))
            .build();

        return Response
            .seeOther(uri)
            .build();
    }
}
