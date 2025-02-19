package nutritrack;

public class App {
    public static void main(String[] args) throws Exception {
        Paciente joao = new Paciente("João", 13, 02, 06, "email@email", "masculino");
        System.out.println(joao.toString());
    }
}
