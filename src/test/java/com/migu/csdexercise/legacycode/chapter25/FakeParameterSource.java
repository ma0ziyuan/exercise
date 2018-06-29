package com.migu.csdexercise.legacycode.chapter25;

import javax.servlet.http.HttpServletRequest;

public class FakeParameterSource implements ParameterSource {

    @Override
    public String getParameterForName(String name) {
        return "FakeParameterSource";
    }
}
