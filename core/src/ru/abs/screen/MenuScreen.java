package ru.abs.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;

import ru.abs.base.BaseScreen;

public class MenuScreen extends BaseScreen {

    private Texture img;
    private Vector2 pos;
    private Vector2 v;
    private Vector2 movePosition;
    private Vector2 tmp;
    private static final float LEN = 3F;

    @Override
    public void show() {
        super.show();
        img = new Texture("badlogic.jpg");
        pos = new Vector2();
        movePosition = new Vector2();
        v = new Vector2();
        tmp = new Vector2();
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        ScreenUtils.clear(0.33f, 0.45f, 0.68f, 1);
        batch.begin();
        batch.draw(img, pos.x, pos.y);
        batch.end();
        tmp.set(movePosition);
        if (tmp.sub(pos).len() <= v.len()) {
            pos.set(movePosition);
            v.setZero();
        } else {
            pos.add(v);
        }
    }

    @Override
    public void dispose() {
        super.dispose();
        img.dispose();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        movePosition.set(screenX, Gdx.graphics.getHeight() - screenY);
        v.set(movePosition.cpy().sub(pos)).setLength(LEN);
        return false;
    }
}
