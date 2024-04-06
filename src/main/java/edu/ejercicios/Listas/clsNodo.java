package edu.ejercicios.Listas;


public class Nodo {
    String dato;
    Nodo enlace;

    public Nodo (String x){
        dato = x;
        enlace = null;
    }

    public Nodo (String x, Nodo n) {
        dato = x;
        enlace = n;
    }

    public Nodo getEnlace() {
        return enlace;
    }
    public void setEnlace(Nodo n) {
        enlace = n;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "dato=" + dato +
                ", enlace=" + enlace +
                '}';
    }
}
/*public class clsNodo {
    int dato;
    clsNodo enlace;

    public clsNodo (int x){
        dato = x;
        enlace = null;
    }

    public clsNodo (int x, clsNodo n) {
        dato = x;
        enlace = null;
    }
    public clsNodo getEnlace(){
        return enlace;

    }
    public void setEnlace (clsNodo n){
        enlace = n;
    }

    @Override
    public String toString() {
        return "clsNodo{" +
                "dato=" + dato +
                ", enlace=" + enlace +
                '}';
    }
}*/
