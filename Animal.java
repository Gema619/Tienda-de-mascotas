public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected double peso;

    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public abstract void hacerSonido();

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + " años, Peso: " + peso + " kg");
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
