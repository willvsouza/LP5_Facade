import java.util.ArrayList;
import java.util.List;
public abstract class Exame {

    private List<Motorista> motoristasComPendencia = new ArrayList<Motorista>();

    public void addMotoristaComPendencia(Motorista motorista) {
        this.motoristasComPendencia.add(motorista);
    }
    public boolean verificarMotoristasComPendencia(Motorista motorista) {
        return this.motoristasComPendencia.contains(motorista);
    }
}