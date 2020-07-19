package org.acme;

import java.util.List;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.graphql.Source;

@GraphQLApi
public class AprendendoGraphql {
    
    @Query
    @Name("buscarUsuarios")
    public List<Usuario> buscarUsuarios(){
        return Usuario.listAll();
    }


    @Name("creditoDisponivel")
    public Integer limiteCredito(@Source Usuario u) {
        //codigo complexo e demorado
        return u.nome.length();
    }

    @Name("creditoDisponivel")
    public Endereco endereco(@Source Usuario u) {
        // codigo complexo e demorado
        return new Endereco();
    }

}