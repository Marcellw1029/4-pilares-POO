public class empleadoCompleto extends Empleado {

    private double salarioAnual;

    public empleadoCompleto(String nombre, String numIden, double salarioAnual) {
        super(nombre, numIden);
        this.salarioAnual = salarioAnual;
    }

    @Override
    public double CalcularSalario() {
        return salarioAnual / 12; // salario mensual

    }

}
