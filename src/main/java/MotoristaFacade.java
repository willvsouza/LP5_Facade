public class MotoristaFacade {

    public static boolean verificarExamesPendentes(Motorista motorista) {
        if (ExameTeorico.getInstancia().verificarMotoristasComPendencia(motorista)) {
            return false;
        }
        if (ExamePsicotecnico.getInstancia().verificarMotoristasComPendencia(motorista)) {
            return false;
        }
        if (ExamePratico.getInstancia().verificarMotoristasComPendencia(motorista)) {
            return false;
        }
        return true;
    }
}