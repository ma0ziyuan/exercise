package com.migu.csdexercise.legacycode.chapter25;

import java.util.Vector;

public class Renderer {

    //private GDIBrush brush;
    private PointRenderer pointRenderer;
    private Vector<GDIBrush.Point> renderingRoots;
    private GDIBrush.ColorMatrix colors;
    private Vector<GDIBrush.Point> selection;



    /*public Renderer(GDIBrush brush, Vector<GDIBrush.Point> renderingRoots, GDIBrush.ColorMatrix colors, Vector<GDIBrush.Point> selection) {
        this.brush = brush;
        this.renderingRoots = renderingRoots;
        this.colors = colors;
        this.selection = selection;
    }*/

    public Renderer(PointRenderer pointRenderer, Vector<GDIBrush.Point> renderingRoots, GDIBrush.ColorMatrix colors, Vector<GDIBrush.Point> selection) {
        this.pointRenderer = pointRenderer;
        this.renderingRoots = renderingRoots;
        this.colors = colors;
        this.selection = selection;
    }


    public void draw() {
        for (GDIBrush.Point point : renderingRoots) {
            pointRenderer.drawPoint(point.x, point.y);
        }
    }
}
