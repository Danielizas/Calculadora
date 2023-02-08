import java.util.Scanner;

public class Calculadora {
    static double resultado = 0.0;
    public static void main(String[] args) {
       String operacion;

        System.out.println("Bienvenido a la Calculadora ");
        Scanner s = new Scanner(System.in);
        // se recibe un string suma, resta, division, multiplicacion
        System.out.println(" Ingrese la operacion a realizar: " +
                "\n - 1. Suma " +
                "\n - 2. Resta " +
                "\n - 3. Multiplicacion " +
                "\n - 4. Division " +
                "\n - 5. Salir ");
        operacion = s.next();
        String op1 = operacion.toLowerCase();
        System.out.println("Ingrese el primer numero: ");
        double a = s.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        double b = s.nextDouble();

        //optimizar experiencia de usuario.
        // usar switch para varios casos.
        if(op1.equals("suma")){
            suma(a,b);
            System.out.println("resultado suma = " + resultado);
            main(args);
        } else if (op1.equals("resta")) {
            resta(a,b);
            System.out.println("resultado resta = " + resultado);
            main(args);
        } else if (op1.equals("multiplicacion")) {
            multiplicacion(a,b);
            System.out.println("resultado Multiplicacion = " + resultado);
            main(args);
        } else if (op1.equals("division")) {
            division(a,b);
            System.out.println("resultado division = " + (double)resultado);
            main(args);
        } else if (op1.equals("salir")) {
            salir();
        } else{
            System.out.println("Selecione una operacion valida");
            main(args);
        }

    }
    public static double suma(double a, double b){
        resultado = (a + b);
        return resultado;
    }

    public static double resta(double a, double b){
        resultado = (a - b);
        return resultado;
    }
    public static double multiplicacion(double a, double b){
        resultado = (a * b);
        return resultado;
    }
    public static double division(double a, double b){
        resultado = 0;
        if(b != 0){
            System.out.println("No se puede realizar esta divison");
        }else{
            resultado = (a / b);
        }
        return resultado;
    }

    public static void salir(){
        System.out.println("Gracias por usar la calculadora");
    }
}
