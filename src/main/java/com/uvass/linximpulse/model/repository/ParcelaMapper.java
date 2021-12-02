package com.uvass.linximpulse.model.repository;

import com.uvass.linximpulse.model.entity.Parcela;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ParcelaMapper implements RowMapper<Parcela> {

    @Override
    public Parcela mapRow(ResultSet result, int i) throws SQLException {
        Parcela parcela = new Parcela();
        parcela.setId(result.getInt("id"));
        parcela.setQuantidade(result.getInt("quantidade"));
        parcela.setValor(result.getFloat("valor"));
        return parcela;
    }
}
