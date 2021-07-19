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

    @Override
    public int updateAmount(Entry entry) {
        var sql = "UPDATE expenses SET amount = (?) where id = (?)";
        return jdbcTemplate.update(sql, entry.getAmount(), entry.getId());
    }

    @Override
    public int updateDescription(Entry entry) {
        var sql = "UPDATE expenses SET description = (?) where id = (?)";
        return jdbcTemplate.update(sql, entry.getDescription(), entry.getId());
    }

    @Override
    public int deleteEntry(int id) {
        var sql = "DELETE FROM expenses WHERE id = (?)";
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public double getavg() {
        var sql = "SELECT AVG(amount) FROM expenses";
        return jdbcTemplate.queryForObject(sql, Double.class);
    }
}
