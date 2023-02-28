public class Programa {
    public static void main(String[] args){
        Conta minhaConta;
        minhaConta = new Conta();
        minhaConta.numero=1;
        minhaConta.titular= "Felipe Camargo";
        minhaConta.saldo= 78000;

        Conta minhaConta2;
        minhaConta2 = new Conta();

        minhaConta2.numero=2;
        minhaConta2.titular= "Gabriella Oliveira";
        minhaConta2.saldo= 80000;

 System.out.println(minhaConta.numero); 
 System.out.println(minhaConta.titular);
 System.out.println(minhaConta.saldo);

 System.out.println(" \n");

 System.out.println(minhaConta2.numero);
 System.out.println(minhaConta2.titular);
 System.out.println(minhaConta2.saldo);


    }
}
