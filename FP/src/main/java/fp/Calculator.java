package fp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Calculator {


    /*
     * este metodo devuelve el Class del object que le pasamos
     */
    public static Class classTypeOf(Object x) {
        return x.getClass();
    }


    /*
     * devuelve una lista con los n números de la serie de fibonacci.
     */
    public static List<Integer> fibonacci(int n) {

            List<Integer> lista=new ArrayList<Integer>();
            int n0=1, n1=1;
            lista.add(n0);
            for(int i=1; i<n; i++){
                lista.add(n1);
                n1=n0+n1;
                n0=n1-n0;
            }
            return lista;
        }


    /*
     * Escribir todos los números del number al 0 de step en step.
     */
    public static int[] stepThisNumber(int number, int step) {
            int length = 0;
                 if(step>0 && number>0){
                     length = (number-1)/step;
                     int steps[] = new int[length];
                     for(int i = 0; i<steps.length; i++){
                         number -= step;
                         steps[i] = number;
                     }
                 return steps;
                 }else
                 return new int[0];
    }

    /*
     * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
     * divisores que tiene.
     */
    public static int[] divisors(int n) {
                int length = 0;
                 int divisors[];
                     if(n>0 && n<=20){
                         for(int i=1; i<=n; i++)
                             if(n%i==0)
                                 length++;
                         divisors = new int[length];
                         for(int i=n,j=0; i>0; i--){
                             if(n%i==0){
                                 divisors[j] = i;
                                 j++;
                             }
                         }
                         return divisors;

                     }else
                         return divisors=null;
    }

    /*
     * Toma como parámetros una cadena de caracteres y devuelve cierto si la cadena resulta ser un palíndromo
     */
    public static boolean checkIsPalindrome(String cadena) {
        throw  new NotImplementedException();
    }

    /*
     * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
     * mostrar: cincuenta y seis
     */
    public static String speakToMe(int n) {



    }

    /*
     * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
     * dd-MM-yyyy
     */
    public static boolean isLeapYear(String fecha) {
    		
    		if(fecha == ""){
    			return false;
    		}
    		int year = Integer.parseInt(fecha.substring(6));
    		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){	
    			return true;
    		}else{
    			return false;
    		}
    }

    /*
     * este metodo devuelve cierto si la fecha es válida
     */
    public static boolean isValidDate(String date) {
        int day, month, year;
         try{
             day=Integer.parseInt(date.substring(0, 2));
             month=Integer.parseInt(date.substring(3,5));
             year=Integer.parseInt(date.substring(6));
         }catch (NumberFormatException e){
             return false;
         }catch(IndexOutOfBoundsException i){
             return false;
         }
         if(0<year){
             switch(month){
             case 1:
             case 3:
             case 5:
             case 7:
             case 8:
             case 10:
             case 12:
                 if(day<=31 && day>0)
                     return true;
                     break;
             case 4:
             case 6:
             case 9:
             case 11:
                 if(day<=30 && day>0)
                     return true;
                     break;
             case 2:
                 if(day<=28 && day>0)
                     return true;
                     break;
             }
         }
         return false;
      }
}
