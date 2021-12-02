package com.uvass.linximpulse.model.repository;

import com.uvass.linximpulse.model.entity.Parcela;
import com.uvass.linximpulse.model.entity.Produto;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ProdutoRepository {
    private JdbcTemplate jdbcTemplate;
    private ParcelaRepository parcelaRepository;

    public ProdutoRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
        this.parcelaRepository = new ParcelaRepository(jdbcTemplate);
    }

    public List<Produto> buscar() throws Exception {
        String sql = "SELECT * FROM produto";
        List<Produto> buscar = (List<Produto>) jdbcTemplate.query(sql, new ProdutoMapper());

        buscar.forEach(produto -> {
            Parcela parcela = parcelaRepository.buscar(produto.getParcela_id());
            produto.setParcela(parcela);
        });

        if (buscar.size() > 0) {
            return buscar;
        }

        throw new Exception("Produto inexistente.");
    }
}
