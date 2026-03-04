public class CalculadoraSalario {
    //4
    
    public double salario(double horas, String empleo) {
        int pagoHora = 0;
        int pagoHoraExtra = 0;
        if(null != empleo)switch (empleo) {
            case "Desarrollador":
                pagoHora = 50000;
                pagoHoraExtra = 75000;
                break;
            case "Diseñador":
                pagoHora=40000;
                pagoHoraExtra = 60000;
                break;
            case "Tester":
                pagoHora = 30000;
                pagoHoraExtra = 45000;
                break;
            default:
                break;
        }
        double total = horas * pagoHora;
        if (horas > 160) {
            total = total + (horas - 160) * pagoHoraExtra;
        }
        return total;
    }
    
    
}