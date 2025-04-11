package tn.esprit.foyer.entities;

public enum TypeChambre {
    SIMPLE,DOUBLE,TRIPLE;

    public int getCapacity() {
        switch (this) {
            case SIMPLE: return 1;
            case DOUBLE: return 2;
            case TRIPLE: return 3;
            default: return 1;
        }
    }
}
