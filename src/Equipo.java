
public class Equipo {
    private String nombre;
    private int fans;
    private int golesconvertidos;
    private int golesRecibidos;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosEmpatados;
    private int partidosPerdidos;
    private int puntos;
    
    public Equipo(String nomb, int hinchas){
        this.nombre = nomb;
        this.fans = hinchas;
        golesRecibidos = 0;
        golesconvertidos = 0;
        partidosEmpatados = 0;
        partidosGanados = 0;
        partidosPerdidos = 0;
        partidosJugados = 0;
        puntos = 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void victoria(){
        puntos += 3;
    }

    public void empate(){
        puntos += 1;
    }

    public void contabilizarGoles(int golesCon, int golesRec){
        golesconvertidos += golesCon;
        golesRecibidos += golesRec;
    }
}
   
