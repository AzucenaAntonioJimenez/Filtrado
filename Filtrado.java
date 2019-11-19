/**
 * pograma que muestra las palabras que inician con a/A
 */
import java.util.*;
public class Filtrado
{
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       String palabras[]= new String[5];
       for(int i=0; i<5; i++)
       {
           System.out.println("palabra "+(i+1));
           palabras[i]=sc.next();
        }
        
        System.out.println("las palabras con a/A inicial son:");
        for(int i=0; i<5; i++)
        {
            if(palabras[i].charAt(0)=='a'  ||  palabras[i].charAt(0)=='A')
            System.out.println(palabras[i]);
        }
    }
}
