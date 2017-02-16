package com.mygdx.game;

import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputProcessor;

/**
 * Created by luissancar on 16/2/17.
 */

public class Teclado extends InputAdapter {
    MyGdxGame ga;

    public Teclado(MyGdxGame g){
        ga=g;
    }
            ;
    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        System.out.println("pulsado");
        ga.sumaX();
        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }
}
