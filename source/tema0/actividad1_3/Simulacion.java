package tema0.actividad1_3;

public class Simulacion {
    public static void main(String[] args) {

        FechaDeCaducidad j = new FechaDeCaducidad(11, 2002);
        CuentaCorriente cc = new CuentaCorriente("2222", "Fekir", 2000);
        TarjetaVirtual v = new TarjetaVirtual("123456789", 123, 600, j, cc);

        //ESTADO INICIAL
        System.out.println("Inicio\nTitular: " + v.getTitular() + "\n" + "Monedero: " + v.getMonedero() + "\n" + "Saldo CC: " + v.getCuentaCorriente().getSaldo() + "\n" + "Fecha Caducidad: " + v.getFechaDeCaducidad() + "\n");

        //CAMBIOS I
        v.cambiarPin(123, 321);
        v.recargarMonedero(700, 321);
        boolean compra = v.compra(65);

        //RESULTADO NEGATIVO: Ya que el límite del monedero es el mismo que el de compra. 700>600
        if (compra) System.out.println("Compra realizada.");
        else System.out.println("Compra no realizada.");
        System.out.println("Titular: " + v.getTitular() + "\n" + "Monedero: " + v.getMonedero() + "\n"
                + "Saldo CC: " + v.getCuentaCorriente().getSaldo() + "\n" + "Fecha Caducidad: " + v.getFechaDeCaducidad() + "\n");

        //CAMBIOS II
        v.recargarMonedero(500, 321);
        boolean compra2 = v.compra(65);

        //RESULTADO POSITIVO
        if (compra2) System.out.println("Compra realizada.");
        else System.out.println("Compra no realizada.");
        System.out.println("Titular: " + v.getTitular() + "\n" + "Monedero: " + v.getMonedero() + "\n"
                + "Saldo CC: " + v.getCuentaCorriente().getSaldo() + "\n" + "Fecha Caducidad: " + v.getFechaDeCaducidad());
    }
}
