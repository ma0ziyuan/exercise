package com.migu.csdexercise.legacycode.chapter25.f;

import java.util.List;

public class PageLayout {
    private int id = 0;
    private List styles;
    private StyleTemplate template;

    protected void rebindStyles() {
        styles = fromStyles();
    }

    protected List fromStyles() {
        return StyleMaster.fromStyles(template, id);
    }


}
