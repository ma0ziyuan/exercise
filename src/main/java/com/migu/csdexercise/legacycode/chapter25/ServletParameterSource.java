package com.migu.csdexercise.legacycode.chapter25;

import javax.servlet.http.HttpServletRequest;

public class ServletParameterSource implements ParameterSource {
    private HttpServletRequest httpServletRequest;

    public void setHttpServletRequest(HttpServletRequest httpServletRequest) {
        this.httpServletRequest = httpServletRequest;
    }

    @Override
    public String getParameterForName(String name) {
        String[] values = httpServletRequest.getParameterValues(name);
        if (values != null && values.length > 0) {
            return values[0];
        } else {
            return null;
        }
    }
}
