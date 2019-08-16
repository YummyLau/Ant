package com.plugin.component.asm;

import java.util.ArrayList;
import java.util.List;

public class ScanComponentInfo {

    public String className;
    public List<Object> impl;

    public ScanComponentInfo(String className) {
        this.className = className;
        this.impl = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "ComponentInject ==> " +  className  + "impl" + getString(impl);
    }

    public String getString(List<Object> objects) {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (Object object : objects) {
            stringBuilder.append(object);
            stringBuilder.append(",");
        }
        if (stringBuilder.toString().length() > 1) {
            stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
