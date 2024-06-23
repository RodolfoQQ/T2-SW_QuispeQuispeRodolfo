package cibertec.T2_SW_RodolfoQuispe.services;

import cibertec.T2_SW_RodolfoQuispe.Repositorys.InterfaceAutor;
import cibertec.T2_SW_RodolfoQuispe.models.Autor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceAutor implements  InteServiceAutor {

    private InterfaceAutor interfaceAutor;

    @Override
    public List<Autor> listarAutores() {
        return interfaceAutor.findAll();
    }

    @Override
    public Autor buscarAutorPorId(Integer idAutor) {
        return interfaceAutor.findById(idAutor).orElse(null);
    }

    @Override
    public Autor save(Autor autor) {

        return interfaceAutor.save(autor);
    }
}
