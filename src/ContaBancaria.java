public class ContaBancaria {

    String nome;
    String banco;
    double valorParaDepositar;
    double saldoAtual = 0.0;
    double sacarValor;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        if (nome.matches(".*\\d.*")) {
            System.out.println("ERRO: Nome invalido");
        } else {
            System.out.println("Nome cadatrado com susseso " + nome);
            this.nome = nome;
        }
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        if (banco.matches(".*\\d.*")) {
            System.out.println("ERRO: banco invalido");
        } else {
            System.out.println("banco cadastrado com susseso");
            this.banco = banco;
        }
    }

    public double getValorParaDepositar() {
        return valorParaDepositar;
    }

    public void setValorParaDepositar(double valorParaDepositar) {
        if (valorParaDepositar > 3000) {
            System.out.println("Limite para depositar foi atingido");
        } else{
            saldoAtual += valorParaDepositar;
            System.out.println("Deposito realizado com susseso");
        }
    }

    public void setSacarValor(double sacarValor) {
        if (valorParaDepositar < sacarValor){
            System.out.println("ERRO: valor insuficiente");
        }else{
            saldoAtual -= sacarValor;
            System.out.println("Saque realizado com susseso");
        }
    }

}

