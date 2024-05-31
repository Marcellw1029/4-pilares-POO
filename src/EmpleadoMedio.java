public class EmpleadoMedio extends Empleado {
    private double SalarioXhora;
    private int HorasxSemana;

    public EmpleadoMedio(String nombre, String numIden, double SalarioXhora, int HorasxSemana) {
        super(nombre, numIden);
        this.HorasxSemana = HorasxSemana;
        this.SalarioXhora = SalarioXhora;

    }

    @Override
    public double CalcularSalario() {
        return SalarioXhora * HorasxSemana * 4;
    }

}
