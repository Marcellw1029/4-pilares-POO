public class App {
    public static void main(String[] args) throws Exception {
        Empleado[] empleados = new Empleado[2];

        empleados[0] = new empleadoCompleto("Martin", "2024", 900000);
        empleados[1] = new empleadoCompleto("Larios", "2024", 90000);

        for (Empleado esclavos : empleados) {
            System.out.println(" Empleado " + esclavos.getNombre() + " Salario Aual" + esclavos.CalcularSalario());

        }

        for (int i = 0; i < empleados.length; i++) {
            System.out.println((i + 1) + ". " + empleados[i].getNombre());
            System.out.println((i + 1) + ". numero de identificacion: " + empleados[i].getNumIden());
            System.out.println((i + 1) + ". Su salario es de: " + empleados[i].CalcularSalario());

        }

    }
}
