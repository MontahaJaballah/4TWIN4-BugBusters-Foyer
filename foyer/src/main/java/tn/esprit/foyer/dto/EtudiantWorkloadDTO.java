package tn.esprit.foyer.dto;

import lombok.Getter;
import tn.esprit.foyer.entities.Etudiant;
import tn.esprit.foyer.entities.Tache;

@Getter
public class EtudiantWorkloadDTO {
    private Etudiant etudiant;
    private int workload;

    public EtudiantWorkloadDTO(Etudiant etudiant) {
        this.etudiant = etudiant;
        this.workload = calculateWorkload(etudiant);
    }

    private int calculateWorkload(Etudiant etudiant) {
        if (etudiant.getTaches() == null || etudiant.getTaches().isEmpty()) {
            return 0;
        }
        return etudiant.getTaches().stream()
                .filter(t -> t != null && t.getDuree() != null)
                .mapToInt(Tache::getDuree)
                .sum();
    }
}
