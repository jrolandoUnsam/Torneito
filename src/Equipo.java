
public class Equipo {
    private String nombre;
    private int fans;
    private int golesconvertidos;
    private int golesRecibidos;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosEmpatados;
    private int partidosPerdido;
    private int puntos;
    
    public Equipo(String nomb, int hinchas){
        this.nombre = nomb;
        this.fans = hinchas;
    }

    public String getNombre() {
        return this.nombre;
    }
}
   
