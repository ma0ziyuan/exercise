package com.migu.csdexercise.legacycode.chapter25;

import java.util.Vector;

public class GDIBrush implements PointRenderer {

    protected class ColorMatrix {

    }

    protected class Point {
        public int x,y;
    }


    public void draw(Vector<Point> renderingRoots, ColorMatrix colors, Vector<Point> selection) {
        /*for (Point point:renderingRoots) {
            drawPoint(point.x,point.y);
        }*/
        Renderer renderer = new Renderer(this,renderingRoots,colors,selection);
        renderer.draw();
    }

    @Override
    public void drawPoint(int x, int y) {
    }

}
