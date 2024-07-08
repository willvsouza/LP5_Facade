import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotoristaTeste {

    @Test
    void deveRetornarMotoristaComExameTeoricoPendente() {
        Motorista motorista = new Motorista();
        ExameTeorico.getInstancia().addMotoristaComPendencia(motorista);
        assertEquals(false, motorista.getLicencaMotorista());
    }

    @Test
    void deveRetornarMotoristaComExamePsicotecnicoPendente() {
        Motorista motorista = new Motorista();
        ExamePsicotecnico.getInstancia().addMotoristaComPendencia(motorista);
        assertEquals(false, motorista.getLicencaMotorista());
    }

    @Test
    void deveRetornarMotoristaComExamePraticoPendente() {
        Motorista motorista = new Motorista();
        ExamePratico.getInstancia().addMotoristaComPendencia(motorista);
        assertEquals(false, motorista.getLicencaMotorista());
    }

    @Test
    void deveRetornarMotoristaHabilitado() {
        Motorista motorista = new Motorista();
        assertEquals(true, motorista.getLicencaMotorista());
    }
}