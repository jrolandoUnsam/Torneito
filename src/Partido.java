import java.time.LocalDate;

public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int golesLocal;
    private int golesVisitante;
    private LocalDate dia;

    public Partido(Equipo nombreLocal,Equipo nombreVisitante, LocalDate of, int golloc, int golvis){
        equipoLocal = nombreLocal;
        equipoVisitante = nombreVisitante;
        dia = of;
        golesLocal = golloc;
        golesVisitante = golvis;
    }

    
}
