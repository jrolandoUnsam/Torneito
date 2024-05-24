import java.time.LocalDate;

public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int golesLocal;
    private int golesVisitante;
    private LocalDate dia;
    private Torneo torneo;

    public Partido(Equipo nombreLocal,Equipo nombreVisitante, LocalDate of, int golloc, int golvis){
        equipoLocal = nombreLocal;
        equipoVisitante = nombreVisitante;
        dia = of;
        golesLocal = golloc;
        golesVisitante = golvis;
    }

    public void asignarPuntos(){
        if (golesLocal > golesVisitante){
            equipoLocal.victoria();
        }
        else if(golesLocal < golesVisitante){
            equipoVisitante.victoria();
        }
        else{
            equipoLocal.empate();
            equipoVisitante.empate();
        }
    }
    
    public void asignargoles(){
        equipoLocal.contabilizarGoles(golesLocal, golesVisitante);
        equipoVisitante.contabilizarGoles(golesVisitante, golesLocal);
    }


}
