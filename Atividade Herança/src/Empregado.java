public class Empregado {
    protected String nome;
    protected String endereco;
    protected double salario;

    // Construtor
    public Empregado(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    public double calcularIrpf() {
        double irpf = 0.0;
        if (salario <= 1903.98) {
            irpf = 0; 
        } else if (salario <= 2826.65) {
            irpf = 0.075 * salario - 142.80; 
        } else if (salario <= 3751.05) {
            irpf = 0.15 * salario - 354.80; 
        } else if (salario <= 4664.68) {
            irpf = 0.225 * salario - 636.13; 
        } else {
            irpf = 0.275 * salario - 869.36;
        }
        return irpf;
    }

    
    public double calcularInss() {
        double inss = 0.0;
        if (salario <= 1302.00) {
            inss = 0.075 * salario;
        } else if (salario <= 2571.29) {
            inss = 0.09 * salario; 
        } else if (salario <= 3856.94) {
            inss = 0.12 * salario; 
        } else if (salario <= 7507.49) {
            inss = 0.14 * salario;
        } else {
            inss = 0.14 * 7507.49; 
        }
        return inss;
    }

    
    public double calcularSalarioMensalista() {
        return salario - calcularInss() - calcularIrpf();
    }

   
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Salário Bruto: R$ " + salario);
        System.out.println("INSS: R$ " + calcularInss());
        System.out.println("IRPF: R$ " + calcularIrpf());
        System.out.println("Salário Líquido: R$ " + calcularSalarioMensalista());
    }
}
