package com.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Factory that creates each flyweight only once and then reuses it.
 */
public class TreeTypeFactory {

    private final Map<String, TreeType> types = new HashMap<String, TreeType>();

    public TreeType getTreeType(String name, String color) {
        String key = name + ":" + color;
        TreeType type = types.get(key);

        if (type == null) {
            type = new TreeType(name, color);
            types.put(key, type);
        }

        return type;
    }

    public int getCreatedTypeCount() {
        return types.size();
    }
}
