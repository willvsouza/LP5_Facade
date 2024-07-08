public class ExamePsicotecnico extends Exame {

    private static ExamePsicotecnico examePsicotecnico = new ExamePsicotecnico();

    private ExamePsicotecnico() {};

    public static ExamePsicotecnico getInstancia() {
        return examePsicotecnico;
    }
}

