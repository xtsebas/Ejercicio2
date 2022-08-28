package Menu;

import java.util.Scanner;

public class controller {
    Scanner in= new Scanner(System.in);

    public int menu(){
        int opcion;
        System.out.println("\n1. Nueva familia. \n2.Recibir perrito. \n3.Dar perrito a familia. \n4.SALIR");
        System.out.println("Que opcion desea?");

        opcion=in.nextInt();
        in.nextLine();

        return opcion;
    }



    public String getName(){
        System.out.println("Ingrese el apellido de su familia");
        String name= in.nextLine();
        in.nextLine();
        return name;
    }

    public int getGchild(){
        System.out.println("Ingrese cuantos niños mayores a 10 años tiene su familia (si no hay ninguno, ponga 0)");
        int Gchild= in.nextInt();
        in.nextLine();
        return Gchild;
    }

    public int getLchild(){
        System.out.println("Ingrese cuantos niños menores a 10 años tiene su familia (si no hay ninguno, ponga 0)");
        int Lchild= in.nextInt();
        in.nextLine();
        return Lchild;
    }

    public int getDog(){
        System.out.println("Ingrese cuantos perros tiene ya asignado su familia (si no hay ninguno, ponga 0)");
        int Dog= in.nextInt();
        in.nextLine();
        return Dog;
    }

    public String getNameD() {
        System.out.println("Ingrese el nombre del perro");
        String NameD= in.nextLine();
        in.nextLine();
        return NameD;
    }

    public String getSize() {
        System.out.println("Ingrese el tamaño del perro");
        String Size= in.nextLine();
        in.nextLine();
        return Size;
    }

    public String getRace() {
        System.out.println("Ingrese la raza del perro (Si se desconoce esta misma, ponga mestizo)");
        String Race= in.nextLine();
        in.nextLine();
        return Race;
    }

    public int getHealth() {
        System.out.println("Ingrese la salud del perro (del 1 al 100, 1 siendo peor, 100 siendo la mejor)");
        int Health= in.nextInt();
        in.nextLine();
        return Health;
    }

    public String getColor() {
        System.out.println("Ingrese el color del perro");
        String Color= in.nextLine();
        in.nextLine();
        return Color;
    }

    public int getAge() {
        System.out.println("Ingrese la edad del perro");
        int Age= in.nextInt();
        in.nextLine();
        return Age;
    }



}
