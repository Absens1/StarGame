package ru.abs.sprite;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import ru.abs.base.Sprite;
import ru.abs.math.Rect;

public class Spaceship extends Sprite {

    private static final float HEIGHT = 0.18f;

    public Spaceship(TextureAtlas atlas) {
        super(atlas.findRegion("main_ship"), 1, 2, 2);
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(HEIGHT);
    }
}
