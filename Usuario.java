public class Usuario {
    //1
    
    private String nombre;
    private String correo;
    private String contrasena;

    public Usuario(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    EnviarCorreo enviarCorreo = new EnviarCorreo();
    
    public void guardarUsuario(Usuario usuario) {
        System.out.println("Conectando a la base de datos...");
        boolean validacion = validarUsuario(usuario);
        
        if(validacion == true){
            System.out.println("INSERT INTO usuarios VALUES('" + usuario.nombre + "','" + usuario.correo + "','" + usuario.contrasena + "')");
            System.out.println("Usuario guardado");
            
            enviarCorreo.enviarCorreoBienvenida(usuario.correo);
        }else{
            System.out.println("Usuario invalido");
        }
    }
    
    public boolean validarUsuario(Usuario usuario){
        boolean validacion = true;
        
        if(usuario.nombre.isEmpty()){
            validacion = false;
        }
        
        if(usuario.correo.isEmpty()){
            validacion = false;
        }
        
        if(usuario.contrasena.isEmpty()){
            validacion = false;
        }
        
        return validacion;
    }

}