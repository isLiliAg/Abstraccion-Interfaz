public class Main {
    public static void main(String[] args) {

        EventoCambioContrasena eventoUno = new EventoCambioContrasena("883838383");
        EventoFaltaPago eventoDos = new EventoFaltaPago("83847480");
        EventoTranferenciaCuenta eventoTres = new EventoTranferenciaCuenta("2734929");

        Evento [] eventos = {eventoUno, eventoDos, eventoTres};

        for (Evento e : eventos) {
            System.out.println(e.getTiempoEjecucion());
            e.proceso();
            System.out.println();
        }
    }
}