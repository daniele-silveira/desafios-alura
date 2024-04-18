import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class DesafioCalculoDesconto {
    public static void main(String[] args) {
        double precoOriginal = 100.00;
        double percentualDesconto = 10.0;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;

        System.out.println("Preco Original: R$ " + precoOriginal);
        System.out.println("Desconto: R$: " + valorDesconto);
        System.out.println("Preço Final: R$ " + novoPreco);
    }
}
