package com.hasan.myBudget.dao;

import com.hasan.myBudget.model.Entry;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EntryMapper implements RowMapper<Entry> {
    @Override
    public Entry mapRow(ResultSet resultSet, int i) throws SQLException {
        var amount = resultSet.getInt("amount");
        var type = resultSet.getString("type");

        return new Entry(amount, type);
    }
}
