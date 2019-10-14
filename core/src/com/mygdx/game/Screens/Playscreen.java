package com.mygdx.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.Doodle;
import com.mygdx.game.Scenes.Hud;

import java.awt.TextArea;

import static com.badlogic.gdx.graphics.GL20.GL_COLOR_BUFFER_BIT;

public class Playscreen implements Screen {
    private Doodle game;
    Texture texture;
    private OrthographicCamera gamecam;
    private Viewport gamePort;
    private Hud hud;

   public Playscreen(Doodle game){
        this.game = game;
        gamecam = new OrthographicCamera();
        gamePort = new FitViewport(Doodle.V_WIDTH,Doodle.V_HEIGHT, gamecam);
        hud = new Hud(game.batch);
   }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
       Gdx.gl.glClearColor(0,0,0,1);
       Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
       game.batch.setProjectionMatrix(gamecam.combined);
       game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
       hud.stage.draw();

    }

    @Override
    public void resize(int width, int height) {
       gamePort.update(width,height);

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
