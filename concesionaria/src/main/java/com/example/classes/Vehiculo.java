package com.example.classes;

import java.time.LocalDate;

public class Vehiculo {
      //definir los atributos
    private String nroplaca;
    private  String marca;
    private  String color;
    private String modelo;
    private Double valor;

    //metodo contructor vacio
    public Vehiculo(){

    }

    //metodo constructor con todos los metodos de la clase
    public Vehiculo(String nroplaca,String marca,String color,String modelo,Double valor){
        //actualizar los atribuyos
        this.nroplaca = nroplaca;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.valor = valor;
    }

    //definir propiedades
    //metodos GETs (obtener) y SETs (modificar), por cada atributo
    public String getnroplaca() {
        return this.nroplaca;
    }

    public void setnroplaca(String nroplaca) {
        //actualizar el atributo
        this.nroplaca = nroplaca;
    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public double getvalor() {
        return valor;
    }

    public void setvalor(double valor) {
        this.valor = valor;
    }

    public void comprar(String nroplaca,LocalDate fecha){
        if (nroplaca.endsWith("0")) {
            System.out.println("esta placa terminada en 0 no se puede comprar");
            System.out.println(fecha);
        }
    }

    public String vender(String nroplaca, LocalDate fecha){
        return nroplaca.startsWith("a") ? "no se puede vender este vehiculo" : "se puede vender";
    }

}
