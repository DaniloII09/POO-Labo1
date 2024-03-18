import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
        int a, b; //declaracion de variables para las operaciones
        int sumando, restando, producto;
        float cociente;//declarando resultados de las operaciones
        int opcion;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenido/a al programa.");
        
        do
        {
            System.out.println("Escoja una opcion:");
            System.out.println("1. Suma.");
            System.out.println("2. Resta.");
            System.out.println("3. Multiplicacion.");
            System.out.println("4. Division.");
            System.out.println("5. Salir.");
            System.out.println("Su opcion es: ");
            opcion = sc.nextInt();
            
            switch(opcion)
            {
                case 1:
                {
                    System.out.println("Ingrese el primer numero: ");
                    a = sc.nextInt();
                    
                    System.out.println("Ingrese el segundo numero: ");
                    b = sc.nextInt();
                    
                    sumando = a + b;
                    
                    System.out.println(sumando);
                }
                break;
            
                case 2:
                {
                    System.out.println("Ingrese el primer numero: ");
                    a = sc.nextInt();
                    
                    System.out.println("Ingrese el segundo numero: ");
                    b = sc.nextInt();
                    
                    restando = a - b;
                    
                    System.out.println(restando);
                }
                break;
            
                case 3:
                {
                    System.out.println("Ingrese el primer numero: ");
                    a = sc.nextInt();
                    
                    System.out.println("Ingrese el segundo numero: ");
                    b = sc.nextInt();
                    
                    producto = a * b;
                    
                    System.out.println(producto);
                }
                break;

                case 4:
                {
                    System.out.println("Ingrese el primer numero: ");
                    a = sc.nextInt();
                    
                    System.out.println("Ingrese el segundo numero: ");
                    b = sc.nextInt();
                    
                    if (b == 0)
                    {
                        System.out.println("ERROR, denominador no valido para la division.");
                    }
                    else
                    {
                        cociente = a / b;
                        
                        System.out.println(cociente);
                    }
                }
                break;
            
                case 5:
                {
                    System.out.println("Saliendo...");   
                }
                break;
            
                default:
                {
                    System.out.println("Opcion no valida");
                }
                break;
            }
            
        } while(opcion != 5);
	}
}
