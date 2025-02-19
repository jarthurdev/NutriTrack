package nutritrack;

public class Paciente {
    
    protected String nome;
    protected int dia;
    protected int mes;
    protected int ano;
    protected String email;
    protected String genero;
    //protected String anamnese;

    Paciente(String nome, int dia, int mes, int ano, String email, String genero) {
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.email = email;
        this.genero = genero;
    }
    
    public String toString(){
        return "Nome: " + nome + " | Data de nascimento: " + dia + "/" + mes + "/" + ano + " | Email: " + email + " | Gênero: " + genero;
    }
    
}
