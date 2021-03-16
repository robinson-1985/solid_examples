package DIP.problem;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    private MySqlConnection mySqlConnection;

    public ProdutoRepository(MySqlConnection mySqlConnection) {
        this.mySqlConnection = new MySqlConnection();
    }

    public List<Produto> buscarPrdodutos() {
        //retorna a lista de produto da base de dados
        return new ArrayList<>();
    }

    public void salvarProduto(Produto produto) {
        //salva lista de produtos na base de dados
    }
}
