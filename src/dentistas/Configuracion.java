
package dentistas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Configuracion {
    public String fecha_actual(){
        String fecha_actual;
        Date fechahoy = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        fecha_actual=dateFormat.format(fechahoy);
        //Obtenemos la fecha de hoy
        return fecha_actual;
    }
}
