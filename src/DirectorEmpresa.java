public class DirectorEmpresa extends Trabajador{
    public DirectorEmpresa(String nombre, String cuil, double sueldo) {
        super(nombre, cuil, sueldo);
    }

    public double calcularImpuesto() {
        return sueldo * 0.20;
    }

}
