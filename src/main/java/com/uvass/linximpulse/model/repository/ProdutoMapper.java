package com.uvass.linximpulse.model.repository;

import com.uvass.linximpulse.model.entity.Produto;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoMapper implements RowMapper<Produto> {

    @Override
    public Produto mapRow(ResultSet result, int i) throws SQLException {
        Produto produto = new Produto();
        produto.setId(result.getInt("id"));
        produto.setNome(result.getString("nome"));
        produto.setFoto(result.getString("foto"));
        produto.setPreco_antigo(result.getFloat("preco_antigo"));
        produto.setPreco(result.getFloat("preco"));
        produto.setDescricao(result.getString("descricao"));
        produto.setParcela_id(result.getInt("parcela_id"));
        return produto;
    }
}
