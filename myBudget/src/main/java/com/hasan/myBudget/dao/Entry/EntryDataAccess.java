package com.hasan.myBudget.dao.Entry;

import com.hasan.myBudget.model.Entry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("EntryDao")
public class EntryDataAccess implements EntryDao{

    @Autowired
    private final JdbcTemplate jdbcTemplate;

    public EntryDataAccess(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Entry> getAll() {
        var sql = "SELECT * FROM expenses";
        return jdbcTemplate.query(sql, new EntryMapper());
    }

    @Override
    public int addEntry(Entry entry) {
        var sql = "INSERT INTO expenses (type, amount, description)" +
                "VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql, entry.getType(), entry.getAmount(), entry.getDescription());
    }
}
