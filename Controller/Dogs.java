package Controller;

public class Dogs {
    private static String size;
    private static String race;
    private static int age;
    private static int health;
    private static String color;
    private static String nameD;

    public Dogs(){
        size="";
        race="";
        age=0;
        health=0;
        color="";
        nameD="";
    }

    public Dogs(String size, String race, int age, int health, String color, String name){
        this.size=size;
        this.race=race;
        this.age=age;
        this.health=health;
        this.color=color;
        this.nameD=name;
        System.out.println("Perro registrado correctamente");
    }

    public static String getNameD() {
        return nameD;
    }

    public static String getSize() {
        return size;
    }

    public static String getRace() {
        return race;
    }

    public static int getHealth() {
        return health;
    }

    public static String getColor() {
        return color;
    }

    public static int getAge() {
        return age;
    }

}

