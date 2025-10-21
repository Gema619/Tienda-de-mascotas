public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, double peso, String raza) {
        super(nombre, edad, peso);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau Guau!");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Raza: " + raza);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
