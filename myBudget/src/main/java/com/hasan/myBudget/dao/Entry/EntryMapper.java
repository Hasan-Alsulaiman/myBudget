package com.hasan.myBudget.dao.Entry;

import com.hasan.myBudget.model.Entry;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EntryMapper implements RowMapper<Entry> {
    @Override
    public Entry mapRow(ResultSet resultSet, int i) throws SQLException {
        var id = resultSet.getInt("id");
        var amount = resultSet.getInt("amount");
        var type = resultSet.getString("type");
        var date = resultSet.getString("date");
        var description = resultSet.getString("description");

        return new Entry(id, amount, type, description, date);
    }
}
