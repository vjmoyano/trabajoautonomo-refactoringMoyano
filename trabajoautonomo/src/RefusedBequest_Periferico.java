public class RefusedBequest_Periferico {

    public void imprimir(){

    }

}

public class Mouse extends RefusedBequest_Periferico{

}

public class Impresora extends RefusedBequest_Periferico{

}

//Aqui podemos observar que la herencia no esta correcta ya que el metodo imprimir no debe ser heredado por la clase Mouse

public class RefusedBequest_Periferico {


}

public class Mouse extends RefusedBequest_Periferico{

}

public class Impresora extends RefusedBequest_Periferico{

    public void imprimir(){

    }

}

//Aqui podemos vemos que es el hijo quien se responsabiliza del metodo imprimir, lo cual en este caso soluciona el code smells