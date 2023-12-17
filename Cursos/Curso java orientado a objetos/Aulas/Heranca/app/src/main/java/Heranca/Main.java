package Heranca;

public class Main {

    public static void main(String[] args) {
        
        Vendedor v = new Vendedor();
        v.setNome("Marcio");
        v.setSalario(1000.0f);
        v.setCpf("12345678900");
        v.setDataNascimento(10/10/1956);
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);
        
        System.out.println("O salario do vendedor é: " + v.calcularSalario());
               
        Motorista m = new Motorista();
        
    }
}
