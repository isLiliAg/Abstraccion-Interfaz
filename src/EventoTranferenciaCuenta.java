
public class EventoTranferenciaCuenta extends EventoAbstracto{

    public EventoTranferenciaCuenta(String id) {
        super(id);
    }

    @Override
    public void proceso() {
        System.out.println("Cliente id: " + id + " necesita transferir su servicio de cuenta.\n" +
                "Póngase en contacto a la linea directa de servicio al cliente para que " +
                "le brinden soporte para eliminar el servicio del dispositivo anterior y poder añadirlo al nuevo.");
    }
}
