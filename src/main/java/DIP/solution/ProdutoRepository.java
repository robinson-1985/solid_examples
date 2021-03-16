package DIP.solution;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    private MySqlConnection mySqlConnection;

    public ProdutoRepository(DbConnection dbConnection) {
        this.dbConnection = new dbConnection();
    }

    public List<DIP.problem.Produto> buscarPrdodutos() {
        //retorna a lista de produto da base de dados
        return new ArrayList<>();
    }

    public void salvarProduto(Produto produto) {
        //salva lista de produtos na base de dados
    }
}
