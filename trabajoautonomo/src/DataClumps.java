public class DataClumps {

    public static void main(String args[]) {
        String raza = "pug";
        double tamaño = 2.1;
        short edad = 3;
        String nombre="Scrapy";
        String color="cafe";

        System.out.println(Informacion(raza,tamaño,edad,nombre,color));

    }
    public static String Informacion(String raza, double tamaño, short edad, String nombre, String color){
        return "El perro de nombre: " + nombre + " mide: " + tamaño + "m, tiene una edad de: " + edad + ". Su raza es: " + raza +" y su color es: " + color;

    }
}

//Como se puede observar, varios de los datos usados en el metodo son de un mismo tipo, asi que es mejor crear una clase que los contenga.
//Para arreglarlo se crea la clase Perro.

public class Perro{
    String raza = "pug";
    double tamaño = 2.1;
    short edad = 3;
    String nombre="Scrapy";
    String color="cafe";

    public Perro(String raza, double tamaño, short edad, String nombre, String color) {
        this.raza = raza;
        this.tamaño = tamaño;
        this.edad = edad;
        this.nombre = nombre;
        this.color = color;
    }

    public String Informacion(){
        return "El perro de nombre: " + this.nombre + " mide: " + this.tamaño "m, tiene una edad de: " + this.edad + ". Su raza es: " + this.raza +" y su color es: " + this.color;
    }
}

//asi quedaria el main despues del refactor

public class DataClumps {

    public static void main(String args[]) {
        String raza = "pug";
        double tamaño = 2.1;
        short edad = 3;
        String nombre="Scrapy";
        String color="cafe";
        Perro pr = new Perro(raza,tamaño,edad,nombre,color);
        System.out.println(pr.Informacion());

    }

}