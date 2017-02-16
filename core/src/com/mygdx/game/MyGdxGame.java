package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class MyGdxGame extends ApplicationAdapter {

	private Texture img01, pinchos;
	private SpriteBatch batch;
	private TextureRegion regionImg01;
	private int x;

	@Override
	public void create() {
		Teclado p=new Teclado(this);
		Gdx.input.setInputProcessor(p);
		img01=new Texture("badlogic.jpg");
		pinchos=new Texture("pinchos.png");
		regionImg01=new TextureRegion(pinchos,0,30,128,34);
		batch=new SpriteBatch();
		x=0;

	}

	public void sumaX() {
		x++;
	}

	@Override
	public void dispose() {
		img01.dispose();
		batch.dispose();

	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(1,0.5f,0,0.5f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img01,x,0,80,80);
		batch.draw(img01,Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/2);
		batch.draw(regionImg01,0,123,90,90);
		batch.end();
	}
}
