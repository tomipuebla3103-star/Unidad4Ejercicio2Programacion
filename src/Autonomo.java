public class Autonomo extends Trabajador{
    public Autonomo(String nombre, String cuil, double sueldo) {
        super(nombre, cuil, sueldo);
    }

    public double calcularImpuesto() {
        return sueldo * 0.15;
    }
}
