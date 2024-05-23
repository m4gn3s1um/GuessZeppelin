package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public class Zeppelin {
    private Rectangle rectangle;
    private Texture texture;
    private boolean correctMaterial;

    public Zeppelin(float x, float y, float width, float height) {
        rectangle = new Rectangle(x, y, width, height);
        texture = new Texture("zepSkeleton.png"); // default image
        correctMaterial = false;
    }

    public void setTexture(Texture texture, boolean correctMaterial) {
        this.texture = texture;
        this.correctMaterial = correctMaterial;
    }

    public Texture getTexture() {
        return texture;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public boolean isCorrectMaterial() {
        return correctMaterial;
    }

    public void dispose() {
        texture.dispose();
    }
}
