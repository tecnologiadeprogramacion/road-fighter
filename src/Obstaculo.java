
import java.util.*;

public abstract class Obstaculo {

	public Obstaculo() {
	}

	public abstract void afectar(VehiculoJugador j);

	public abstract int peso();

	public abstract int puntaje();

}