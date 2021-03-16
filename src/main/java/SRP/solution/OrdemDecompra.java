package SRP.solution;

import SRP.problem.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * CLASSE OrdemDeCompra
 */

public class OrdemDecompra {

    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) { produtos.add(produto); }

    public void removerProduto(Produto produto) { produtos.remove(produto); }

    public BigDecimal calcularTotal() {
        return produtos.stream()
                .map(Produto::getValor)
                .reduce(BigDecimal.Zero, BigDecimal::add);
    }
}

/**
 * CLASSE OrdemDeCompraRepository
 */

class OrdemDeCompraRepository {
    public List<OrdemDecompra> buscarOrdensDeCompra() {
        //retorna a lista de ordens de compra da base de dados
        return  new ArrayList<>();
    }

    public void salvarOrdemCompra() {
        //salva lista de produtos na base de dados
    }

    public void alterarOrdemCompra() {
        //alterar na base de dados
    }
}

/**
 * CLASSE OrdemDeCompraMail
 */

class OrdemDeCompraMail {
    public void enviarEmail(OrdemDeCompra ordemDeCompra, String email) {
        //envia email da ordem de compra
    }
}

/**
 * CLASSE OrdemDeCompraMail
 */

class OrdemDeCompraprint {
    public void imprimirOrdemDeCompra() {
        //imprime a ordem de compra
    }
}