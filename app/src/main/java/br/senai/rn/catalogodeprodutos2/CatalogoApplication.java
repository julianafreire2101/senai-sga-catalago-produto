package br.senai.rn.catalogodeprodutos2;

import android.app.Application;

import br.senai.rn.catalogodeprodutos2.dao.ProdutoDAO;
import br.senai.rn.catalogodeprodutos2.model.Produto;

public class CatalogoApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        CriarProdutosDeTeste();
    }

    private void CriarProdutosDeTeste() {
        ProdutoDAO dao = new ProdutoDAO();

        dao.salvar(new Produto("Chocolate", "1122", "Iel"));
    }
}
