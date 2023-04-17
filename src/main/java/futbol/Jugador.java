package futbol;

public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador() {
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    @Override
    public boolean jugarConLasManos(){
        if(getPosicion()=="Portero"){
            return true;
        }
        return false;
    }
    @Override
    public int compareTo(Object f){
        return Math.abs(getEdad()-((Futbolista)f).getEdad());
    }
    @Override
    public String toString(){
        return "El futbolista "+getNombre()+" tiene "+getEdad()+", y juega de "+getPosicion()+" con el dorsal "+dorsal+". Ha marcado "+golesMarcados;
    }

    public short getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(short golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }
}
