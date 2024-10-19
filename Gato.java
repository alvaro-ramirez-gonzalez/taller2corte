
class Gato extends Animal {
    public Gato() {
        super.sonido = "Miau"; 
    }

    @Override
    public void hacerSonido() {
        super.hacerSonido(); 
        System.out.println("El hace miauu");
    }
}


