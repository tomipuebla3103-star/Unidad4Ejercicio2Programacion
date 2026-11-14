public abstract class Trabajador {
    protected String nombre;
    protected String cuil;
    protected double sueldo;

    public Trabajador(String nombre, String cuil, double sueldo) {
        this.nombre = nombre;
        this.cuil = cuil;
        this.sueldo = sueldo;
    }

    public abstract double calcularImpuesto();
}
