public class ExamePratico extends Exame {

    private static ExamePratico examePratico = new ExamePratico();

    private ExamePratico() {};

    public static ExamePratico getInstancia() {
        return examePratico;
    }
}