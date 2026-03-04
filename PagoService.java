public class PagoService {
    //5
    
    public void procesarPago(double monto) {
        try {
            if (monto <= 0) {
                throw new Exception("Monto inválido");
            } else {
                System.out.println("Procesando pago de " + monto);
            //se deberia restar el monto a la cuenta
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

}
