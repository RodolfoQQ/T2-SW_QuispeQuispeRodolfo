package cibertec.T2_SW_RodolfoQuispe.controllers;


import cibertec.T2_SW_RodolfoQuispe.models.Autor;
import cibertec.T2_SW_RodolfoQuispe.services.ServiceAutor;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("api/v1/autor")
public class ControllerAutor {

    private ServiceAutor serviceAutor;

    @GetMapping
    public ResponseEntity<List<Autor>> listarAutores() {
        return ResponseEntity.ok(serviceAutor.listarAutores());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Autor> buscarAutorPorId(@PathVariable("id") Integer idAutor) {
        Autor autor = serviceAutor.buscarAutorPorId(idAutor);
        if (autor != null) {
            return ResponseEntity.ok(autor);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Autor> crearAutor(@RequestBody Autor autor) {
        Autor nuevoAutor = serviceAutor.save(autor);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoAutor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Autor> actualizarAutor(@PathVariable("id") Integer idAutor, @RequestBody Autor autorActualizado) {
        Autor autorExistente = serviceAutor.buscarAutorPorId(idAutor);
        if (autorExistente != null) {
            autorActualizado.setIdAutor(idAutor);
            Autor autorActualizadoEnDB = serviceAutor.save(autorActualizado);
            return ResponseEntity.ok(autorActualizadoEnDB);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}

