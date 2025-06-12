class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class Aluno extends Pessoa {
    String curso;

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Curso: " + curso);
    }
}

class Professor extends Pessoa {
    String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Disciplina: " + disciplina);
    }
}

public class Programa {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Lucas", 19, "Informática");
        Professor prof = new Professor("Mariana", 35, "Matemática");

        System.out.println("--- Aluno ---");
        aluno.mostrarDados();

        System.out.println("\n--- Professor ---");
        prof.mostrarDados();
    }
}

