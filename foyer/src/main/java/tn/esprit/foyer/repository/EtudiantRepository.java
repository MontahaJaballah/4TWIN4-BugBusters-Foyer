package tn.esprit.foyer.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer.entities.Etudiant;

import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

    @Query("SELECT e FROM Etudiant e LEFT JOIN FETCH e.taches")
    List<Etudiant> findAllWithTasks();

    @Override
    default List<Etudiant> findAll() {
        return findAllWithTasks();
    }

    Etudiant findByCin(Long idEtudiant);
    Etudiant findByNomEtAndPrenomEt(String nomEt, String prenomEt);
}
