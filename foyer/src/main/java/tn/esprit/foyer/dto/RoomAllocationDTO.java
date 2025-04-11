package tn.esprit.foyer.dto;

import lombok.Getter;
import tn.esprit.foyer.entities.Chambre;

import java.util.ArrayList;
import java.util.List;

@Getter
public class RoomAllocationDTO {
    private Chambre chambre;
    private List<EtudiantWorkloadDTO> occupants;
    private int totalLoad;

    public RoomAllocationDTO(Chambre chambre) {
        this.chambre = chambre;
        this.occupants = new ArrayList<>();
        this.totalLoad = 0;
    }

    public boolean canAddOccupant() {
        return occupants.size() < chambre.getTypeC().getCapacity();
    }

    public void addStudent(EtudiantWorkloadDTO student) {
        if (canAddOccupant()) {
            occupants.add(student);
            totalLoad += student.getWorkload();
        }
    }
}
