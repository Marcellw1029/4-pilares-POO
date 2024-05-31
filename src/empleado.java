abstract class Empleado {
    private String nombre;
    private String numIden;

    public Empleado(String nombre, String numIden) {
        this.nombre = nombre;
        this.numIden = numIden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumIden() {
        return numIden;
    }

    public void setNumIden(String numIden) {
        this.numIden = numIden;
    }

    public abstract double CalcularSalario();

}
