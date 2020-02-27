/**
 * @author Walter Saldaña #19897
 * @author Laura Tamath   #19365
 *@since 24/02/2020
 *@version 25/02/2020
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Sección 20
 * 
 * Programa que realiza cálculos en formato Postfix.
 * Se ingresa un documento de texto txt con una operación Postfix 
 * y se retorna el resultado numérico.
 * 
 * Referencias: 
 * Duane A. Bailey. (2007). Java Structures. 7ma edicion.
 */

//Importación de clases
import java.util.Scanner; //Leer la entrada de texto
import java.io.File; //Representa un archivo 
import java.io.*; //Intento fallido al abrir un archivo


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("//---------- CALCULADORA POSTFIX  ----------//");
        System.out.println("* Walter Saldaña \n* Laura Tamath\n");
        while(true){
            System.out.println("Acontinuacion introduzca la direccion del archivo .txt con la operacion Postfix. \nIngrese 'salir' si desea detener el programa.");
            String archivo = sc.nextLine();
            if(archivo.equals("salir")){
                break;
            }else{
                BufferedReader reader = null;
                try {
                    File file = new File(archivo);
                    reader = new BufferedReader(new FileReader(file));
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                        //Crear objeto con las operaciones postfix
                        PostfixCalculator calculadora = new PostfixCalculator(line);
                        //Imprimir resultado
                        System.out.println(String.valueOf(calculadora.calcular()));
                    }
                
                } catch (IOException e) {
                    System.out.println("Ingrese la direccion a un archivo valido");
                } finally {
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }            
        }
    }
}