package cibertec.T2_SW_RodolfoQuispe.controllers;

import cibertec.T2_SW_RodolfoQuispe.models.Publicacion;
import cibertec.T2_SW_RodolfoQuispe.services.ServicePublicacion;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/publicacion")
public class ControllerPublicacion {


    private ServicePublicacion servicePublicacion;

    @GetMapping
    public ResponseEntity<List<Publicacion>> listarPublicaciones() {
        List<Publicacion> publicaciones = servicePublicacion.listarPublicaciones();
        return ResponseEntity.ok(publicaciones);
    }

    @GetMapping("/{codpub}")
    public ResponseEntity<Publicacion> buscarPublicacionPorId(@PathVariable Integer codpub) {
        Publicacion publicacion = servicePublicacion.buscarpublicacionPorid(codpub);
        if (publicacion != null) {
            return ResponseEntity.ok(publicacion);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Publicacion> crearPublicacion(@RequestBody Publicacion publicacion) {
        Publicacion nuevaPublicacion = servicePublicacion.save(publicacion);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaPublicacion);
    }

    @PutMapping("/{codpub}")
    public ResponseEntity<Publicacion> actualizarPublicacion(
            @PathVariable Integer codpub,
            @RequestBody Publicacion publicacionActualizada) {

        Publicacion publicacionExistente = servicePublicacion.buscarpublicacionPorid(codpub);

        if (publicacionExistente != null) {
            publicacionExistente.setTitulo(publicacionActualizada.getTitulo());
            publicacionExistente.setResumen(publicacionActualizada.getResumen());
            publicacionExistente.setFechPublicacion(publicacionActualizada.getFechPublicacion());

            Publicacion publicacionActualizadaGuardada = servicePublicacion.save(publicacionExistente);
            return ResponseEntity.ok(publicacionActualizadaGuardada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}