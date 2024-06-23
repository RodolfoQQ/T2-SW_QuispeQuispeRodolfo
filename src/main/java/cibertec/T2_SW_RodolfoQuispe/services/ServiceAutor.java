package cibertec.T2_SW_RodolfoQuispe.services;

import cibertec.T2_SW_RodolfoQuispe.models.Autor;

import java.util.List;

public class ServiceAutor implements  InteServiceAutor {
    @Override
    public List<Autor> listarAutores() {
        return List.of();
    }

    @Override
    public Autor buscarAutorPorId(Integer idAutor) {
        return null;
    }

    @Override
    public Autor save(Autor autor) {
        return null;
    }
}
