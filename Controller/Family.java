package Controller;

import java.util.Random;

public class Family {
    private String name;
    private static int lchild;
    private static int gchild;
    private int dog;

    public Family(){
        name="";
        lchild=0;
        gchild=0;
        dog=0;
    }

    public Family(String name, int lchild, int gchild, int dog){
        this.name=name;
        this.lchild=lchild;
        this.gchild=gchild;
        this.dog=dog;
        System.out.println("Familia registrada exitosamente");
    }

    public int getDog() {
        return dog;
    }

    public static int getGchild() {
        return gchild;
    }


    public static int getLchild() {
        return lchild;
    }


    public String getName() {
        return name;
    }


    public void familymovements(int gchild, int lchild) {
        if (lchild < 10 && lchild > 0 && lchild!=0) {
            System.out.println("*********************************************************************************");
            System.out.println("Su familia solo esta permitida escoger perros pequeños o perros de raza labrador.");
            System.out.println("*********************************************************************************");
        } else if (gchild < 10 && gchild!=0 && lchild==0) {
            System.out.println("*********************************************************************************");
            System.out.println("Su familia puede acoger perros medianos y pequeños, exceptuando razas peligrosas.");
            System.out.println("*********************************************************************************");
        } else if (gchild == 0 && lchild == 0) {
            System.out.println("*********************************************************************************");
            System.out.println("Su familia puede acoger cualquier tipo de perro.");
            System.out.println("*********************************************************************************");
        }
    }
}
