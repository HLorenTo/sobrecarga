package mision_tic_2022_ejemplo_sobrecarga;
public class Ejemplo {
    public void Ejemplo(){
        System.out.println("Esta sin parámetros");
    }
    public void Ejemplo(int a){
        System.out.println("Un parámetro entero que es "+a);
    }
    public void Ejemplo(char a){
        System.out.println("Un parámetro char que es "+a);
    }
    public void Ejemplo(String a){
        System.out.println("Un parámetro String que es "+a);
    }
    public void Ejemplo(Boolean a){
        System.out.println("Un parámetro Boolean que es "+a);
    }
    //sobrecarga de funciones
    public int Ejemplo (int a, int b){
        System.out.println("Dos parámetros enteros: "+a +" y "+b);
        return a+b;//retornara en un entero
    }
    public double Ejemplo (double a, double b){
        System.out.println("Dos parámetros double: "+a+" y "+b);
        return a+b;
    }
}
