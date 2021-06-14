package ru.abs.pool;

import ru.abs.base.SpritesPool;
import ru.abs.sprite.Bullet;

public class BulletPool extends SpritesPool<Bullet> {

    @Override
    protected Bullet newObject() {
        return new Bullet();
    }
}
