package com.sbuslab.utils.db;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

import com.sbuslab.utils.filters.Field;

@Data
@AllArgsConstructor
public class EntitySqlFields {
    private Map<String, Field> fieldsByName = new HashMap<>();
    private Map<String, Field> fieldsBySqlColumn = new HashMap<>();
    private String allSqlColumns;
    private String tableName;
    private String className;

    public Field byName(String name) {
        return fieldsByName.get(name);
    }
}
