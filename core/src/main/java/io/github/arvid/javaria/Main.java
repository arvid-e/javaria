package io.github.arvid.javaria;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

/**
 * {@link com.badlogic.gdx.ApplicationListener} implementation shared by all
 * platforms.
 */
public class Main extends ApplicationAdapter {
    private ShapeRenderer shapes;

    private Player player;
    private Tile tile;
    private TileGrid tileGrid;
    private KeyHandler keyHandler;

    @Override
    public void create() {
        shapes = new ShapeRenderer();
        player = new Player(100, 100);
        tile = new Tile(0, 0, Color.BLUE, true);
        tileGrid = new TileGrid(3, 3, tile);
        keyHandler = new KeyHandler(player);
    }

    @Override
    public void render() {
        keyHandler.listen();
        draw();
    }

    @Override
    public void dispose() {
    }

    private void draw() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        shapes.begin(ShapeRenderer.ShapeType.Filled);
        player.render(shapes);
        tileGrid.draw(shapes);
        shapes.end();
    }
}
