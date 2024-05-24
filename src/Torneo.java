import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Torneo {
    private List<Equipo> equipos;
    private List<Fecha> fechas;

    public Torneo(){
        equipos = new ArrayList<Equipo>();
        fechas = new ArrayList<Fecha>();
    }

    public void cargarEquipo(String nomb, int hinchas) {
        Equipo equipoNuevo = new Equipo(nomb,hinchas);
        equipos.add(equipoNuevo);
    }

    public void cargarPartido(String nombreLocal, String nombreVisitante, LocalDate fecha, int golesLocal, int golesVisitante) {
        Equipo equipoLocal = buscarEquipoPorNombre(nombreLocal);
        Equipo equipoVisitante = buscarEquipoPorNombre(nombreVisitante);
        
        if (equipoLocal != null && equipoVisitante != null) {
            Partido partidoNuevo = new Partido(equipoLocal, equipoVisitante, fecha, golesLocal, golesVisitante);
    
        } else {
            System.out.println("Uno o ambos equipos no existen en el torneo.");
        }
    }


    public Equipo buscarEquipoPorNombre(String nombre) {
        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equals(nombre)) {
                return equipo;
            }
        }
        return null; // Retorna null si no se encuentra ningún equipo con el nombre dado.
    }
}

