package cibertec.T2_SW_RodolfoQuispe.services;

import cibertec.T2_SW_RodolfoQuispe.models.Autor;

import java.util.List;

public interface InteServiceAutor {

    List<Autor> listarAutores();
    Autor buscarAutorPorId(Integer idAutor);
    Autor save(Autor autor);
}
