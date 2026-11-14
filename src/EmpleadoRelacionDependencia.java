public class EmpleadoRelacionDependencia extends Trabajador{

    public EmpleadoRelacionDependencia(String nombre, String cuil, double sueldo) {
        super(nombre, cuil, sueldo);
    }

    public double calcularImpuesto() {
        return sueldo * 0.10;
    }
}
