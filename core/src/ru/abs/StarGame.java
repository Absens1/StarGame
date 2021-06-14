package ru.abs;

import com.badlogic.gdx.Game;

import ru.abs.screen.MenuScreen;

public class StarGame extends Game {

    @Override
    public void create() {
    	setScreen(new MenuScreen(this));
    }

}
