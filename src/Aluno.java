import java.util.Arrays;
import java.util.Objects;

public class Aluno {
    private String nome;
    private String cpf;
    private String[] historico;

    public Aluno(String nome, String cpf) {
        this.cpf = cpf;
        this.nome = nome;
        this.historico = new String[20];
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
    public boolean addHistorico(String historico) {
        for (int i = 0; i < this.historico.length; i++) {
            if(this.historico[i] == null) {
                this.historico[i] = historico;
                return true;
            }
        }
        return false;
    }

    public String[] listarHistorico() {
        int quantidade = 0;
        for (int i = 0; i < this.historico.length; i++) {
            if(this.historico[i] != null) {
                quantidade++;
            }
        }
        String[] listaLimpa = new String[quantidade];

        int index = 0;
        for (int i = 0; i < this.historico.length; i++) {
            if(this.historico[i] != null) {
                listaLimpa[index] = this.historico[i];
                index++;
            }
        }
        return listaLimpa;
    }


}
