package contasbanco;

public class Conta {
    private String nomeTitular;
    private double saldo;
    private Integer numConta;

    public Conta(){
        this.saldo = 0;
    }
    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }
    
    
    public void extrato() {
		System.out.println("------------------------");
		System.out.println("Extrato");
		System.out.println("------------------------");
        System.out.println("Numero da Conta: " + this.numConta);
		System.out.println("Nome: " + this.nomeTitular);
		System.out.println("Saldo: R$" + this.saldo);
		System.out.println("------------------------");
    }

    public void depositar(double i) {
	if (i > 0) {
            this.saldo += i;
	} else {
            System.out.println("Numero invalido.");
	}
    }

    public void sacar(double i) {
	if (i > 0) {
		if (i <= this.saldo) {
                    this.saldo -= i;
		} else {
                    System.out.println("Fundos Insuficientes.");
		}
	} else {
            System.out.println("Valor negativo.");
	}
    }
}
