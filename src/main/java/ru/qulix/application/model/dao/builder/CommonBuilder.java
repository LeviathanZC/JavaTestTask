package ru.qulix.application.model.dao.builder;

import ru.qulix.application.model.entity.Identifiable;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface CommonBuilder<T extends Identifiable> {

    T build(ResultSet resultSet) throws SQLException;

}
