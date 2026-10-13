package io.github.arvid.javaria;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    private ShapeRenderer shapes;
    private Texture image;
    private Player player;
    private KeyHandler keyHandler;

    @Override
    public void create() {
        shapes = new ShapeRenderer();
        player = new Player(100, 100);
        keyHandler = new KeyHandler(player);
    }

    @Override
    public void render() {
        keyHandler.listen();
        draw();
    }

    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
    }
    
    private void draw() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        shapes.begin(ShapeRenderer.ShapeType.Filled);
        player.render(shapes);
        shapes.end();
    }
}
