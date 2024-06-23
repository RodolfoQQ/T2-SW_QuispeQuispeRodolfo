package cibertec.T2_SW_RodolfoQuispe.services;

import cibertec.T2_SW_RodolfoQuispe.models.Publicacion;

import java.util.List;

public interface InterServicePublicacion {

    List<Publicacion> listarPublicaciones();
    Publicacion buscarpublicacionPorid(Integer codpub);
    Publicacion save(Publicacion publicacion);


}
