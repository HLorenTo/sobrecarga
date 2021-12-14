package mision_tic_2022_ejemplo_sobrecarga;
public class Mision_Tic_2022_Ejemplo_Sobrecarga {
    public static void main(String[] args) {
        Ejemplo  obj = new Ejemplo ();
        obj.Ejemplo();//Sobrecarga 1 (Sin parametros)
        obj.Ejemplo(1);//Sobrecarga 2 (Con 1 parametros)
        obj.Ejemplo(2,3);//Sobrecarga 3 (2 parametros enteros)
        obj.Ejemplo(1.3, 1.7);//Sobrecarga 4 (2 parametros double)
    }
}
