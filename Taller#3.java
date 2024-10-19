
abstract class Animal {
   
    public abstract void hacerSonido();
}


class Perro extends Animal {
   
    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }
}


interface Nadador {
    void nadar();
}


class Pez implements Nadador {
    @Override
    public void nadar() {
        System.out.println("El pez está nadando.");
    }
}


abstract class Instrumento {
    public abstract void tocar();
}


interface Afinable {
    void afinar();
}


class Guitarra extends Instrumento implements Afinable {
    @Override
    public void tocar() {
        System.out.println("La guitarra está tocando.");
    }

    @Override
    public void afinar() {
        System.out.println("La guitarra está afinada.");
    }
}

/

class Animal {
    protected String sonido = "Sonido de animal";

    public void hacerSonido() {
        System.out.println(sonido);
    }
}


class Gato extends Animal {
    public Gato() {
        super.sonido = "Miau"; 
    }

    @Override
    public void hacerSonido() {
        super.hacerSonido(); 
        System.out.println("El gato hace miauu.");
    }
}

final class Constante {
    public final int valor = 42; a

   
    public final void mostrarValor() {
        System.out.println("Valor: " + valor);
    }
}


class ClasePadre {
    protected void metodoProtegido() {
        System.out.println("Este es un método protegido.");
    }
}


class SubClase extends ClasePadre {
    public void usarMetodoProtegido() {
        metodoProtegido(); 
    }
}


class Vehiculo {
    public void mover() {
        System.out.println("El vehículo se mueve.");
    }
}


class Avion extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("El avión vuela.");
    }
}


public class HerenciaYInterfaces {
    public static void main(String[] args) {
        Vehiculo v = new Avion(); 
        v.mover(); 
    }
}
