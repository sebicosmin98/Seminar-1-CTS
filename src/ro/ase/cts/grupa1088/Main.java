package ro.ase.cts.grupa1088;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Scrieti ceva:");

        String mesajCitit = scanner.nextLine();

        try{

            if(mesajCitit.toLowerCase() == mesajCitit){

                throw new ExceptieAllLower();

            } else if(mesajCitit.toUpperCase() == mesajCitit){

                throw new ExceptieAllUpper();

            }

        } catch(Exception e){

            System.out.println(e);

        }





    }





}
