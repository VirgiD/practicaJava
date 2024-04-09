package Mascota;

public class Mascota {

    private final int  Max_Energia = 100;
    private final int Min_Energia = 0;

     private String nombre;
     private int energia;
     private double peso;
     private int comer;
     private boolean dormido;
     private int humor ;
     private int cantComer;

    public Mascota() {
    }

    public Mascota(String nombre, int energia, double peso, int comer, boolean dormido, int humor, int cantComer) {
        this.nombre = nombre;
        this.energia = energia;
        this.peso = peso;
        this.comer = comer;
        this.dormido = dormido;
        this.humor = humor;
        this.cantComer = cantComer;
    }
/*
    comer(): // aumenta energia, aumenta peso
    dormir(): // dormir true
    despertar(): // dormir false
    caminar(): // disminuye energia, disminuye peso
    correr(): // disminuye mucha energia, disminuye mucho peso
    obtenerEnergia(): // aumenta energia
    estaVivo(): // devuelve true o false segun energia
     */


    public void comer(){
    energia ++;
    peso++;
        System.out.println("energia: "+ energia+ " " + "peso: "+ peso);
    }
    public void  dormir(){
        dormido = true;
        System.out.println("la mascota esta durmiendo");
    }
    public void despertar(){
        dormido = false;
        System.out.println("la mascota despertó");
    }
    public void caminar(){
        energia --;
        peso--;
        System.out.println("Energia :"+ energia + " "+ "peso :"+ peso);
    }
    public void correr(){

    }
    public void obtenerEnergia(){

    }
    public boolean estaVivo(){
        if (energia < 0){
            return false;
        }else
           return true;
    }
}


