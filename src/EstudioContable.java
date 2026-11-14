public class EstudioContable {
    public void procesarTrabajadores(Trabajador[] trabajadores) {

        double total = 0;

        for (int i = 0; i < trabajadores.length; i++) {

            double impuesto = trabajadores[i].calcularImpuesto();

            System.out.println("Trabajador: " + trabajadores[i].nombre);
            System.out.println("Impuesto a pagar: $" + impuesto);

            total = total + impuesto;

        }

        System.out.println("-------------------------");
        System.out.println("Total de impuestos: $" + total);

    }
}
