public class Factura {
    //2
    
    public double calcular(double precio, int cantidad, String tipoCliente) {

        double total = precio * cantidad;

        switch (tipoCliente) {
            case "VIP":
                total = total - (total * 0.2);
                break;
            case "NORMAL":
                total = total - (total * 0.05);
                break;
            case "EMPLEADO":
                total = total - (total * 0.3);
                break;
            default:
                break;
        }
        if (total > 1000000) {
            total = total - 50000;
        }
        System.out.println("El total es: " + total);
        return total;
    }
}