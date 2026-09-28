package com.example;

import java.time.LocalDate;
import java.util.Scanner;

import com.example.classes.Automovil;
import com.example.classes.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //intanciar un objeto
        Vehiculo v1 = new Vehiculo();//objeto de vehiculo,constructor vacio
       //llenar los datos del objeto v1
        v1.setnroplaca("pol28");
        v1.setmarca("Porsche 911 GT3 RS");
        v1.setcolor("negro");
        v1.setmodelo("2023");
        v1.setvalor(25000000);

        //mostar los datos
        System.out.println(v1.getnroplaca());
        System.out.println(v1.getmarca());
        System.out.println(v1.getcolor());
        System.out.println(v1.getmodelo());
        System.out.println(v1.getvalor());

        //crear objeto v2 con todos los datos
        Vehiculo v2 = new Vehiculo("ap0", "ferrari", "rojo", "2005", (double) 25000000);
        System.out.println(v2.getvalor());

        v1.comprar(v1.getnroplaca(), LocalDate.now());
        v2.comprar(v2.getnroplaca(), LocalDate.parse("2025-03-15"));

        System.out.println(v1.vender(v1.getnroplaca(),LocalDate.parse("2026-09-18")) );

        String mensaje = v2.vender(v2.getnroplaca(),LocalDate.parse("2026-09-18"));
        System.out.println(mensaje);
        // crear un objeto de la clase automovil
        Automovil a1 = new Automovil();
        a1.setnroplaca("mensaje");
        a1.setmarca("menjase");
        a1.setcolor("mensaje");
        a1.setmodelo("mensaje");
        a1.setvalor(3500000);
        a1.setTechocorredizo(true);
        System.out.println(a1.getmarca());
        a1.comprar(a1.getnroplaca(), LocalDate.now());
        System.out.println(a1.vender(a1.getnroplaca(), LocalDate.now()));
        if(a1.getTechocorredizo()){
            System.out.println("otienes un obseqio aleatorio");
        }
        else{
            System.out.println("siga participando");
        }

      Automovil a2 = new Automovil("", "","", "", (double) 2500000, null);
    }

}
