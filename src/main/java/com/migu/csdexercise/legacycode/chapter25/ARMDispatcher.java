package com.migu.csdexercise.legacycode.chapter25;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class ARMDispatcher {
    private Map<String, String> marketBindings = new HashMap<String, String>();
    public static String pageStateName = "OPEN";

    public void populate(HttpServletRequest request) {

        String[] values = request.getParameterValues(pageStateName);
        if (values != null && values.length > 0) {
            marketBindings.put(pageStateName + getDateStamp(), values[0]);
        }
    }

    public void populate(String pageStateNameValue) {
        if (pageStateNameValue != null && pageStateNameValue.length() > 0) {
            marketBindings.put(pageStateName + getDateStamp(), pageStateNameValue);
        }
    }

    public void populate(ParameterSource parameterSource) {
        String value = parameterSource.getParameterForName(pageStateName);
        if (value != null) {
            marketBindings.put(pageStateName + getDateStamp(), value);
        }
    }

    public Map<String, String> getMarketBindings() {
        return marketBindings;
    }

    String getDateStamp() {
        return "";
    }
}
