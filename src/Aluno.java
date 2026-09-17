import java.util.Arrays;
import java.util.Objects;

public class Aluno {
    private String nome;
    private String cpf;
    private String[] historico;

    public Aluno(String nome, String cpf) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(cpf, aluno.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", historico=" + Arrays.toString(historico) +
                '}';
    }
    public boolean addHistorico(String historico){
        return true;
    }

}
