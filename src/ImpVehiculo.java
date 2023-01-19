import java.util.Scanner;

public class ImpVehiculo  implements auto, moto{
    @Override
    public void velocidad (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la velocidad");
       int velocidad = entrada.nextInt();
    }
    @Override
    public void color (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el color");
 String color = entrada.next();
    }

    @Override
    public void patente (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el patente");
        String patente = entrada.next();
    }


    @Override
    public void marca (){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese el marca");
    String marca = entrada.next();
    }



    @Override
    public void MarcaCubierta (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la marca");
        String marcaCubierta = entrada.next();


    }
}
