public class Paciente {
    String cpf;
    String nome;
    int idade;
    String sintoma;
    
    Paciente() {
        
    }
    
    Paciente (String cpf, String nome, int idade, String sintoma) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.sintoma = sintoma;
    }
    
    @Override
    public String toString() {
       return "[CPF: "+cpf+", Nome: "+nome+", Idade: "+idade+", Sintoma: "+sintoma+"]"; 
    }
}
