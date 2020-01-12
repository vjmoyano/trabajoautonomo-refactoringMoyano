public class Feature_Envy {

}

class Account{
    String codigo;
    int año_apertura;
    String saldo;

    public Account(String codigo, int año_apertura, String saldo) {
        this.codigo = codigo;
        this.año_apertura = año_apertura;
        this.saldo = saldo;
    }
}

class Cliente{
    String nombre;
    Account cuenta;

    void VerInfo(){
        System.out.println("La cuenta de codigo: " + cuenta.codigo + " con saldo de: $"+cuenta.saldo +" pertenece al cliente: "+this.nombre);
    }
}
//aqui podemos ver que la clase Cliente accede a los atributos de la clase Cuenta creando asi el code smell feature envy.

class Account_refactored{
    String codigo;
    int año_apertura;
    String saldo;

    public Account_refactored(String codigo, int año_apertura, String saldo) {
        this.codigo = codigo;
        this.año_apertura = año_apertura;
        this.saldo = saldo;
    }
    String Account_Info(){
        return "El codigo de cuenta es: " + this.codigo + " ,tiene un saldo de: " + this.saldo;
    }
}

class Cliente_refactored{
    String nombre;
    Account_refactored cuenta;

    void VerInfo(){
        System.out.println(cuenta.Account_Info() +" pertenece al cliente: "+this.nombre);
    }
}