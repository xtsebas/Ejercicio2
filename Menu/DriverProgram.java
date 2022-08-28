package Menu;

import Controller.Dogs;
import Controller.Family;

import java.util.Scanner;

public class DriverProgram {
    public static void main(String[] args) {
        String[] DangerousDogs= {"Pitbull terrier" ,"American staffordshire terrier", "Tosa inu" , "Dogo argentino", "Dogo guatemalteco", "Fila brasileño", "Presa canario", "Dóberman", "Gran perro japonés", "Mastín napolitano", "Presa mallorqui", "Dogo de burdeos", "Bullmastiff", "Bull terrier inglés", "Bulldog americano", "Rhodesiano", "Rottweiler"};
        Family family= new Family();
        Dogs dogs= new Dogs();
        controller controller= new controller();

        Family families[]= new Family[15];
        Dogs doggies[]= new Dogs[18];
        Dogs friendly[]= new Dogs[25];
        int op=1;
        while (op==1){
            int opcion;
            System.out.println("BIENVENIDO AL PROGRAMA VOLUNTARIO DE ACOGER UN PERRO TEMPORALMENTE");
            System.out.println("Que desea hacer?");
            opcion= controller.menu();

            while (opcion!=5){
                if (opcion==1){

                    String name= controller.getName();
                    int lchild= controller.getLchild();
                    int gchild= controller.getGchild();
                    int dog= controller.getDog();
                    family.familymovements(gchild, lchild);

                    family = new Family(name, lchild, gchild, dog);
                    for (int i = 0; i < 15;i++){
                        if (families[i]== null){
                            families[i]= family;
                        }break;
                    }
                    break;

                } else if (opcion==2) {
                    String race= controller.getRace();
                    String size= controller.getSize();
                    int age= controller.getAge();
                    int health= controller.getHealth();
                    String color= controller.getColor();
                    String named= controller.getNameD();

                    dogs = new Dogs(size, race, age, health, color, named);
                    for (int i= 0; i<25; i++){
                        if (doggies[i]== null) {
                            doggies[i]=dogs;
                        }break;
                    }
                    for (int i=0; i<25; i++){
                        if (doggies[i]!= null){
                            dogs= doggies[i];
                            System.out.println("*************************************");
                            System.out.println("Nombre: " + Dogs.getNameD());
                            System.out.println("Raza: " + Dogs.getRace());
                            System.out.println("Tamaño: " + Dogs.getSize());
                            System.out.println("Edad: " + Dogs.getAge());
                            System.out.println("Salud: " + Dogs.getHealth());
                            break;
                        }
                    }
                    break;

                } else if (opcion==3){
                    boolean dogg=false;
                    for (int i = 0; i<17; i++){
                        if (Dogs.getRace().equals(DangerousDogs[i])){
                            dogg=true;
                        }
                    }

                    if (dogg==true){
                        for (int i=0; i<17; i++){
                            if (DangerousDogs[i]==null){
                                DangerousDogs[i] = Dogs.getNameD();
                                break;
                            }
                        }
                    } else if (dogg==false) {
                        for (int i=0; i<17; i++){
                            if (friendly[i]==null){
                                friendly[i]= dogs;
                                break;
                            }
                        }
                    }
                    if (Family.getLchild()>0){
                        for (int i=0; i<10; i++){
                            if (friendly[i]!=null && friendly[i].equals(Dogs.getSize().equals("pequeño")) || friendly[i].equals(Dogs.getSize().equals("Pequeño")) || friendly[i].equals(Dogs.getRace().equals("labrador"))){
                                dogs=friendly[i];
                                System.out.println("Felicidades, se le ha asignado el perro: " + Dogs.getNameD()+ "\n De raza: " + Dogs.getRace()+ "\n Tamaño: " + Dogs.getSize()+ "\n Salud: " + Dogs.getHealth()+ "\n Edad: " + Dogs.getAge());
                                break;
                            }
                        }break;

                    } else if (Family.getGchild()>0 && Family.getLchild()==0){
                        for (int i=0; i<10; i++){
                            if (friendly[i] != null || !friendly[i].equals(Dogs.getSize().equals("mediano") || Dogs.getSize().equals("pequeño")) || !friendly[i].equals(DangerousDogs[i])){
                                dogs= friendly[i];
                                System.out.println("Felicidades, se le ha asignado el perro: " + Dogs.getNameD()+ "\n De raza: " + Dogs.getRace()+ "\n Tamaño: " + Dogs.getSize()+ "\n Salud: " + Dogs.getHealth()+ "\n Edad: " + Dogs.getAge());
                                break;
                            }
                        }break;

                    }else if (Family.getLchild()== 0 && Family.getGchild()==0){
                        for (int i=0; i<10; i++){
                            if (friendly[i] != null) {
                                dogs = friendly[i];
                                System.out.println("Felicidades, se le ha asignado el perro: " + Dogs.getNameD() + "\n De raza: " + Dogs.getRace() + "\n Tamaño: " + Dogs.getSize() + "\n Salud: " + Dogs.getHealth() + "\n Edad: " + Dogs.getAge());
                                break;
                            }
                        }
                    }break;


                } else if (opcion==4) {
                    for (int i = 0; i<15; i++){
                        if (families[i]!= null){
                            family= families[i];
                            System.out.println("******************************************");
                            System.out.println("Familia: " + family.getName());
                            System.out.println("Mascotas: " + family.getDog());
                        }break;
                    }break;
                }
            }

            System.out.println("Quiere continuar? \n 1. si \n 2. no");
            Scanner in= new Scanner(System.in);
            op= in.nextInt();
            in.nextLine();
        }
    }
}
