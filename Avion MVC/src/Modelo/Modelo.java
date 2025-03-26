package Modelo;

import java.util.ArrayList;

public class Modelo {
    private String id;
    private ArrayList<Boolean> asientos;

    public Modelo(String id, int capacidadTotal) {
        this.id = id;
        this.asientos = new ArrayList<>();
        for (int i = 0; i < capacidadTotal; i++) {
            asientos.add(false);  // Inicializamos todos los asientos como disponibles (false)
        }
    }

    public boolean hayAsientosDisponibles() {
        for (boolean asiento : asientos) {
            if (!asiento) {
                return true;  // Hay al menos un asiento disponible
            }
        }
        return false;  // No hay asientos disponibles
    }

    public boolean reservarAsiento(int numeroAsiento) {
        if (numeroAsiento >= 0 && numeroAsiento < asientos.size() && !asientos.get(numeroAsiento)) {
            asientos.set(numeroAsiento, true); 
            return true;
        }
        return false;  
    }

    public void mostrarAsientosDisponibles() {
        for (int i = 0; i < asientos.size(); i++) {
            if (!asientos.get(i)) {
                System.out.println("Asiento " + (i + 1));  
            }
        }
    }

    public String getId() {
        return id;
    }
}
