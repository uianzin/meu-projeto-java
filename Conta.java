public class Conta {
    int numero;
    String titular;
    double saldo;

 /*   void saca(double quantidade){
        double novoSaldo = this.saldo = quantidade;
        this.saldo = novoSaldo;
    }
    void deposita(double quantidade){
        this.saldo += quantidade;
    }*/
     boolean saca( double quantidade){
        if(this.saldo<quantidade){
            return false;
        }else{
            double novoSaldo = this.saldo = quantidade;
            this.saldo = novoSaldo;
            return true;
        }
    }
}
