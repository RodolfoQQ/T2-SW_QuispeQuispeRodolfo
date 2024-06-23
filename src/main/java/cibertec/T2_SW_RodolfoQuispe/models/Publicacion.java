package cibertec.T2_SW_RodolfoQuispe.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "Publicacion")
public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPublicacion;

    @Column(nullable = false, length = 250)
    private String titulo;

    @Column(nullable = false, length = 250)
    private String resumen;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechPublicacion;

    @ManyToOne
    @JoinColumn(name = "idAutor", nullable = false)
    private Autor autor;

}
