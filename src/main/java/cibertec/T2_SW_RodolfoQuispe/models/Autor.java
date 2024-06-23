package cibertec.T2_SW_RodolfoQuispe.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter
@Table(name = "autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idautor")
    private Integer idAutor;

    @Column(name = "NomAutor")
    private String nomAutor;

    @Column(name = "ApeAutor")
    private String apeAutor;

    @Column(name = "FechNacAutor")
    private Date fechNacAutor;

    @OneToMany(mappedBy = "autor")
    private List<Publicacion> publicaciones;
}