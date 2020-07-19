package org.acme;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.smallrye.mutiny.Multi;

@Path("/usuarios")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public List<Usuario> getAll() {
        return Usuario.listAll();
    }

    @Transactional
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public Usuario add(Usuario usuario) {
         usuario.persist();
        return usuario;
    }


    
    @GET
    @Path("reativo")
    @Produces(MediaType.TEXT_PLAIN)
    public Multi<String> reatividade() {
        return Multi.createFrom().items("Olá","items", "Pode ser o que for").onCompletion().continueWith("!");
    }







}