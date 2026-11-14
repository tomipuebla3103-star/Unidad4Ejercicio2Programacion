//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Trabajador[] trabajadores = new Trabajador[3];

    trabajadores[0] = new EmpleadoRelacionDependencia("Juan", "20123456789", 500000);
    trabajadores[1] = new Autonomo("Pedro", "20234567891", 700000);
    trabajadores[2] = new DirectorEmpresa("Carlos", "20345678912", 1000000);

    EstudioContable estudio = new EstudioContable();

    estudio.procesarTrabajadores(trabajadores);
}
