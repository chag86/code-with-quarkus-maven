package org.acme;

import java.util.List;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
public class AprendendoGraphql {
    
    @Query
    @Name("buscarUsuarios")
    public List<Usuario> buscarUsuarios(){
        return Usuario.listAll();
    }

    public Integer limiteCredito() {
        
    }

}