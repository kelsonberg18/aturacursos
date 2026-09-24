public class Curso {
    private String titulo;
    private String ementa;
    private String instrutor;
    private int qtdVagas;
    private String[] palavrasChave;
    private String status;
    private Aluno[] alunos;

    public Curso(String titulo, String ementa, String instrutor, int qtdVagas) {
        this.titulo = titulo;
        this.ementa = ementa;
        this.instrutor = instrutor;
        this.qtdVagas = qtdVagas;
        this.palavrasChave = new String[3];
        this.status = "Aceitando Inscrições";
        this.alunos = new Aluno[qtdVagas];
    }

    public Curso(String titulo, String ementa, String instrutor,  int qtdVagas, String[] palavrasChave) {
        this.titulo = titulo;
        this.ementa = ementa;
        this.instrutor = instrutor;
        this.qtdVagas = qtdVagas;
        this.palavrasChave = new String[3];
        for (int i = 0; i < palavrasChave.length; i++) {
            if (i < 3){
                this.palavrasChave[i] = palavrasChave[i];
            }
        }
        this.status = "Aceitando Inscrições";
        this.alunos = new Aluno[qtdVagas];
    }

    public boolean addAluno(Aluno alunoNovo) {
        if(!this.status.equals("Aceitando Inscrições")){
            return false;
        }
        for (int i = 0; i < this.alunos.length; i++) {
            if (this.alunos[i] != null) {
                if (this.alunos[i].getCpf().equals(alunoNovo.getCpf())) {
                    return false;
                }
            }
        }
        for (int i = 0; i < this.alunos.length; i++) {
            if (this.alunos[i] == null) {
                this.alunos[i] = alunoNovo;
                return true;
            }
        }
        return false;
    }


}
