package actividad7incisoa;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//By: Fernando Núñez Bejarano

public class Actividad7incisoA {
public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

static long MCD(long x, long y){
    
    if(x < y){
        return MCD(y, x);
    }
    
    else if(y == 0){
        return x;
    }
    else{
        return MCD(y, x%y);
    }
}
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        long x;
        long y;
        long eleccion;
        
        System.out.println("Caluladora de Maximo común divisor");
        System.out.println("");
        System.out.print("Podrias darme el primer numero a usar: ");
        eleccion = Integer.parseInt(entrada.readLine());
        x = eleccion;
        System.out.println("");
        System.out.print("Ahora podiras darme el segundo numero: ");
        eleccion = Integer.parseInt(entrada.readLine());
        y = eleccion;
        System.out.println("");
        System.out.println("El Maximo comun divisor es: " + MCD(x, y));
    }
    
}
