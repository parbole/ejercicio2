import java.util.Scanner;

public class ejercicio2{
    public static void main(String[] args) {
        double numero1,resultado;
        
        System.out.print("Bienvenido" + "\n" + "Digite la cantidad de Millas por galon MPK que recorre con su vehiculo: ");
        Scanner teclado = new Scanner(System.in);
        numero1 = teclado.nextInt();
        
        //Millas por galon a Litros por Kilometro
        //1 MPG  = 2.35 LPG
       
        
        
        resultado = (2.35/numero1);
        System.out.print("El equivalente es de : " + String.format("%.2f", resultado) + " Litros por Kilometro  LPK");
        
    }
}

