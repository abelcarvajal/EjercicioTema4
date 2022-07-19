import java.util.Scanner;
//Usé la librería Scanner basado en https://www.youtube.com/watch?v=um-7MdTfY8A
public class Main {
    private float numeroIf; //Declaré la variable de tipo float para aceptar tanto enteros como números con punto decimal
    private Scanner teclado;

    //Método para establecer si el número ingresado es positivo, negativo o cero.
    public void controlIf(){
        teclado=new Scanner(System.in);
        System.out.println("Digite un numero:");
        numeroIf= Float.parseFloat(teclado.next()); //Captura del número a analizar
        if(numeroIf > 0){
            System.out.println("El numero " + numeroIf + " es positivo");
        }else if (numeroIf < 0){
            System.out.println("El numero " +numeroIf + " es negativo");
        }
        else if (numeroIf == 0){
            System.out.println("El nuemro " +numeroIf + " es cero");
        }
    }
    //Método bucle While
    public void controlWhile(){
        System.out.println("Ejercicio bucle while ");
        int i = 0;
        while (i < 3){
            System.out.println(i);
            i++;
        }
    }
    //Bucle Do While
    public void controldowhile(){
        System.out.println("Ejercicio bucle Do While");
        int i = 2;
        do {
            System.out.println(i);
            i++;
        }while (i < 3);
    }
    //Bucle for
    public void controlfor(){
        System.out.println("Ejercicio bucle for");
        int numeroFor = 0;
        for(;numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }
    }
    //Bucle switch.
    public void controlswitch(){
        System.out.println("Ejercicio bucle switch-case");
        System.out.println("ESTACION DEL ANO EN MAYUSCULA?");
        var estacion = teclado.next();
        switch (estacion){
            case "PRIMAVERA":
                System.out.println("Estamos en primavera");
                break;
            case "VERANO":
                System.out.println("Estamos en Verano");
                break;
            case "OTONO":
                System.out.println("Estamos en Otono");
                break;
            case "INVIERNO":
                System.out.println("Estamos en Invierno");
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }

    public static void main(String[] args) {
        Main control;
        control=new Main();
        System.out.println("Ejercicios tema 4");

        control.controlIf();
        control.controlWhile();
        control.controldowhile();
        control.controlfor();
        control.controlswitch();
    }

}