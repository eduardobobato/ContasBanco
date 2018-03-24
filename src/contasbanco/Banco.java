package contasbanco;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Banco {
    private ArrayList<Conta> contas;
    private Integer setNum;
    
    
    public Banco() {
    	contas = new ArrayList<Conta>();
    	setNum = 0;
    }
    private Conta getConta(int num) {
    	for(Conta contaAtual:contas) {
    		if(contaAtual.getNumConta().equals(num)) {
    			return contaAtual;
    		}
    	}
    	return null;
    }
	public void criarConta(String nomeTitular){
        Conta conta = new Conta();
        conta.setNomeTitular(nomeTitular);
        conta.setNumConta(setNum);
        contas.add(conta);
        setNum++;
	}
    public void removerConta(int dig){
        Iterator<Conta> iterator = contas.iterator();
        while (iterator.hasNext()) {
        	Conta contaAtual = iterator.next();
        	if (contaAtual.getNumConta() == dig) {
        		iterator.remove();
        	}
        }
    }
    public void listarContas(){
        for(int i=0;i<contas.size();i++) {
        	System.out.println("Nome: "+ contas.get(i).getNomeTitular());
        	System.out.println("Numero da conta: "+ contas.get(i).getNumConta());
        	System.out.println("--------------------------------------------------");
        }
    }
    public void pesquisarContas(String nome) {
    	for(int i=0;i<contas.size();i++) {
    		if(nome.equals(contas.get(i).getNomeTitular())) {
    			System.out.println("Nome: "+ contas.get(i).getNomeTitular());
            	System.out.println("Numero da conta: "+ contas.get(i).getNumConta());
            	System.out.println("--------------------------------------------------");
    		}
    	}
    }
    public void efetuaExtrato(Integer numConta){
        for(int i=0;i<this.contas.size();i++) {
        	if (this.contas.get(i).getNumConta().equals(numConta)) {
        		this.contas.get(i).extrato();
        	}
        }
    }
    public void sacar(double j, int numConta){
    	Scanner ler = new Scanner(System.in);
    	
        for(int i=0;i<contas.size();i++){
            if(contas.get(i).getNumConta() == numConta){
                this.contas.get(i).sacar(j);
            }
        }
    }
    public void depositar(double j, int numConta){
    	Scanner ler = new Scanner(System.in);
        for(int i=0;i<contas.size();i++){
            if(this.contas.get(i).getNumConta() == numConta){
                this.contas.get(i).depositar(j);
            }
        }
    }
}
