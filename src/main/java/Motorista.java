public class Motorista {

    public boolean getLicencaMotorista() {
        return MotoristaFacade.verificarExamesPendentes(this);
    }
}
