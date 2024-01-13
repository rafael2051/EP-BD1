package com.tuspeliculasfavoritas.app.model;

import java.io.Serializable;

public class ArtistaIndicadoId implements Serializable {

    private String nomeArtistico;

    private String nomePremio;

    private String nomeEvento;

    private Integer anoEdicao;

    public ArtistaIndicadoId(){}

    @Override
    public boolean equals(Object o){
        if (o instanceof ArtistaIndicadoId) {
            ArtistaIndicadoId other = (ArtistaIndicadoId) o;
            return(other.nomeArtistico == this.nomeArtistico &&
                    other.nomePremio == this.nomePremio &&
                    other.nomeEvento == this.nomeEvento &&
                    other.anoEdicao == this.anoEdicao);
        }
        else{
            return false;
        }
    }

    @Override
    public int hashCode(){
        return nomeArtistico.length() + nomePremio.length() +
                nomeEvento.length() + anoEdicao;
    }
}
