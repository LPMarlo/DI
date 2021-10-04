package tema0.actividad1_3;

public class main {
    public static void main(String[] args) {
        FechaDeCaducidad j = new FechaDeCaducidad(13,11);
        CuentaCorriente cc = new CuentaCorriente("2222", 2000, "Fekir");
        TarjetaVirtual v = new TarjetaVirtual("123456789", 123, 600, j, cc);

        //ESTADO INICIAL
        System.out.println(v.getTitular()+"\n"+v.getMonedero()+"\n"+v.getCuentaCorriente().getSaldo()+"\n"+v.getFechaDeCaducidad());

        //CAMBIOS
        v.cambiarPin(123, 321);
        v.recargarMonedero(700,321);
        v.compra(65);

        //RESULTADO
        System.out.println(v.getTitular()+"\n"+v.getMonedero()+"\n"+v.getCuentaCorriente().getSaldo()+"\n"+v.getFechaDeCaducidad());

    }
}
