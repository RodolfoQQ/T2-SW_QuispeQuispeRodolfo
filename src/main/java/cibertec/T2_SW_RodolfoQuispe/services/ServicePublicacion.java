package cibertec.T2_SW_RodolfoQuispe.services;

import cibertec.T2_SW_RodolfoQuispe.Repositorys.InterefacePublicacion;
import cibertec.T2_SW_RodolfoQuispe.models.Publicacion;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class ServicePublicacion implements InterServicePublicacion {
    private  InterefacePublicacion interfacePublicacion;

    @Override
    public List<Publicacion> listarPublicaciones() {
        return interfacePublicacion.findAll();
    }

    @Override
    public Publicacion buscarpublicacionPorid(Integer codpub) {
        return interfacePublicacion.findById(codpub).orElse(null);
    }

    @Override
    public Publicacion save(Publicacion publicacion) {
        return interfacePublicacion.save(publicacion);
    }
}