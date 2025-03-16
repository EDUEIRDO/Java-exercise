package Task2;
class Funcionario 
{
    String nome;
    String sobrenome;
    int horasTrabalhadas;
    double valorPorHora;

    String nomeCompleto()
    {
        return nome  + " " + sobrenome;
    }
    double calcularSalario()
    {
        return horasTrabalhadas * valorPorHora;
    }

    void incrementarHoras(int horas)
    {
        valorPorHora += horas;
    }
}

public class TestarFuncionario
{
    public static void main(String[] agrs)
    {
        Funcionario novoFuncionario = new Funcionario();
        
        novoFuncionario.nome = "Luis";
        novoFuncionario.sobrenome = "Silva";
        novoFuncionario.horasTrabalhadas = 10;
        novoFuncionario.valorPorHora = 25.50;

        System.out.println(novoFuncionario.nomeCompleto());
        System.out.println("Valor do salario: " + novoFuncionario.calcularSalario());
        
        novoFuncionario.incrementarHoras(8);

        System.out.println("Valor do salario depois de alterar: " + novoFuncionario.calcularSalario());
    }
}