package com.uvass.linximpulse.model.repository;

import com.uvass.linximpulse.model.entity.Parcela;
import org.springframework.jdbc.core.JdbcTemplate;

public class ParcelaRepository {
    private JdbcTemplate jdbcTemplate;

    public ParcelaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Parcela buscar(int id) {
        String sql = "SELECT * FROM parcela WHERE id = ?";

        return jdbcTemplate.queryForObject(sql, new ParcelaMapper(), id);
    }
}
