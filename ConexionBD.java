public class ConexionBD {
    //3
    
    Configuracion Configuracion = new Configuracion();
    
    public void conectar() {
        
        System.out.println("Conectando a " + Configuracion.url);
        System.out.println("Usuario: " + Configuracion.usuario);
        System.out.println("Password: " + Configuracion.password);
    }
    
    
}