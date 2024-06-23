package cibertec.T2_SW_RodolfoQuispe.Repositorys;

import cibertec.T2_SW_RodolfoQuispe.models.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterefacePublicacion extends JpaRepository<Publicacion, Integer> {
}
