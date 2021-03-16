package SRP.problem;

import SRP.solution.OrdemDecompra;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrdemDeCompra {

    private List <Produto>  produtos = new ArrayList<> ();

    public void adicionarProduto(Produto produto) { produtos.add(produto); }

    public void removerProduto(Produto produto) { produtos.remove(produto); }

    public BigDecimal calcularTotal() {
        return produtos.stream()
                .map(Produto::getValor)
                .reduce(BigDecimal.Zero, BigDecimal::add);
    }

    public List<OrdemDecompra> buscarOrdensDeCompra() {
        //retorna a lista de ordens de compra da base de dados
        return  new ArrayList<>();
    }

    public void alterarOrdemCompra() {
        //alterar na base de dados
    }

    public void salvarOrdemCompra() {
        //salva lista de produtos na base de dados
    }

    public void enviarEmail(String email) {
        //envia email da ordem de compra
    }

    public void imprimirOrdemDeCompra() {
        //imprime a ordem de compra
    }
}
