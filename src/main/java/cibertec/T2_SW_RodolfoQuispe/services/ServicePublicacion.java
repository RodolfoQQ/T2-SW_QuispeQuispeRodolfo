package cibertec.T2_SW_RodolfoQuispe.services;

import cibertec.T2_SW_RodolfoQuispe.Repositorys.InterefacePublicacion;
import cibertec.T2_SW_RodolfoQuispe.models.Publicacion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicePublicacion implements InterServicePublicacion {
    @Override
    public List<Publicacion> listarPublicaciones() {
        return List.of();
    }

    @Override
    public Publicacion buscarpublicacionPorid(Integer codpub) {
        return null;
    }

    @Override
    public Publicacion save(Publicacion publicacion) {
        return null;
    }
}
