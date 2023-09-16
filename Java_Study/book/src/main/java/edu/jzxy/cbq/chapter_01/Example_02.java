package edu.jzxy.cbq.chapter_01;

import java.applet.Applet;
import java.awt.*;

public class Example_02 extends Applet {
    String text;

    @Override
    public void init() {
        text = new String("Welcome to Learn Java !");
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(text,5,20);
    }
}
