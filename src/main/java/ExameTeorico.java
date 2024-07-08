public class ExameTeorico extends Exame {

    private static ExameTeorico exameTeorico = new ExameTeorico();

    private ExameTeorico() {};

    public static ExameTeorico getInstancia() {
        return exameTeorico;
    }
}
