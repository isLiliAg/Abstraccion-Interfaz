public class EventoFaltaPago  extends EventoAbstracto{

    public EventoFaltaPago(String id){
        super(id);
    }


    @Override
    public void proceso() {
        System.out.println("Cliente id: " + id + " no ha realizado pago de cuenta. "+
                "Envío de factura al correo del cliente.");
    }
}
