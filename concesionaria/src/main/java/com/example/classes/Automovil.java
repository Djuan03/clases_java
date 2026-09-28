package com.example.classes;

public class Automovil extends Vehiculo {
    Boolean techocorredizo;

    public Automovil() {
    }

    public Automovil(String nroplaca, String marca, String color, String modelo, Double valor, Boolean techocorredizo) {
        super(nroplaca, marca, color, modelo, valor);
        this.techocorredizo = techocorredizo;
    }

    public Boolean getTechocorredizo() {
        return techocorredizo;
    }

    public void setTechocorredizo(Boolean techocorredizo) {
        this.techocorredizo = techocorredizo;
    }
    
    public void probar(){
        System.out.println("Se ha realizado el test para el automovil");
    }
}
