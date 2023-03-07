public class EventoCambioContrasena extends EventoAbstracto{


    public EventoCambioContrasena (String id){
        super(id);
    }

    @Override
    public void proceso() {
        System.out.println("Cliente id: " + id + " ha cambiado su contraseña. " +
                "Enviando un correo electrónico de confirmación al cliente...");
    }

}
