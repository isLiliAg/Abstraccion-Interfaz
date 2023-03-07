import java.sql.Timestamp;

public abstract class EventoAbstracto implements Evento {

    protected final String id;
    protected final Long creacionTiempo;

    public EventoAbstracto (String id){
        this.id = id;
        this.creacionTiempo =new Timestamp(System.currentTimeMillis()).getTime();
    }

    @Override
    public long getTiempoEjecucion() {
        return this.creacionTiempo;
    }

    public abstract void proceso();
}
