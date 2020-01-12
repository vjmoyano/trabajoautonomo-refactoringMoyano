enum Animales {perro, gato, hamster, vaca}
public class Switch_Statements {
    Animales an;

    public void ImprimirSaludo(){
        switch (this.an){
            case perro:
                System.out.println("ladrido");
                break;
            case gato:
                System.out.println("Maullido");
                break;
            case vaca:
                System.out.println("Mu");
                break;
            case hamster:
                System.out.println("Hamster noise");
        }

    }
}
//El uso del switch en este caso claramente puede convertirse en polimorfismo, lo cual tambien haria mas simple el codigo.

class Animal{

    void ImprimirSaludo(){

    }
}

class Gato extends Animal{

    @Override
    void ImprimirSaludo() {
        System.out.println("Soy un gato");
    }
}

class Vaca extends Animal{
    @Override
    void ImprimirSaludo() {
        System.out.println("Soy una vaca");
    }
}

class Hamster extends Animal{
    @Override
    void ImprimirSaludo() {
        System.out.println("Soy un hamster");
    }
}

//Con el uso de herencia, solo seria necesario llamar al metodo ImprimirSaludo
