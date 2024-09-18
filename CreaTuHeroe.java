import java.util.Scanner;

public class CreaTuHeroe {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

            System.out.println("Muy buenos DIAS/TARDES que heroe deseas hacer:");
            Hero Usuario = new Hero();
            System.out.println("Dinos el nombre de tu heroe: ");
            Usuario.name = leer.toString();
            System.out.println("Dinos el alias de tu Heroe: ");
            Usuario.name = leer.toString();
            System.out.println("Dinos el nombre del actor que interpretara tu heroe: ");
            Usuario.actor = leer.toString();
            System.out.println("Dinos el genero de tu Heroe: ");
            Usuario.gender = leer.toString();
            System.out.println("Danos las habilidades de tu heroe: ");
            Usuario.[]skill = new String[];
            System.out.println("Dinos la edad de tu Heroe");
            Usuario.age = leer.nextInt();



    }
}
