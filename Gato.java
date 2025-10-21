public class Gato extends Animal {
    private String color;

    public Gato(String nombre, int edad, double peso, String color) {
        super(nombre, edad, peso);
        this.color = color;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla: ¡Miau Miau!");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Color: " + color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
