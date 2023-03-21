package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Rueda {
Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private String marca;
    private double presion;

    public Rueda(String marca, double presion) {
        this.marca = marca;
        this.presion = presion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    @Override
    public String toString() {
        return "Rueda{" +
                "marca='" + marca + '\'' +
                ", presion=" + presion +
                '}';
    }

public void inflarRuedas(){
        if (presion<28 || presion>28){
        this.presion=28.0;
            System.out.println(" la rueda "+ marca +" despues de inflar tiene " + presion);
        }
    }


public void desinflarRuedas(){
  double medida=0.5;
  setPresion(getPresion()-medida);
    System.out.println(" la rueda "+ marca +" despues de desinflar tiene " + presion);
}

/*public void sacarRueda(String identifi){
    if (getMarca().equalsIgnoreCase(identifi)){

    }
}*/




}
