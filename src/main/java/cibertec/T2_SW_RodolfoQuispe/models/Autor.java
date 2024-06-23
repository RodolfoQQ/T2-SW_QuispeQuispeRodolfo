package cibertec.T2_SW_RodolfoQuispe.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAutor;

    @Column(nullable = false, length = 50)
    private String nomAutor;

    @Column(nullable = false, length = 50)
    private String apeAutor;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechNacAutor;

}