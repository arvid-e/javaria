package io.github.arvid.javaria;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class TileGrid {
  private Tile tile;
  private Tile[][] grid;

  public TileGrid(int x, int y, Tile tile) {
    setTile(tile);
    setGrid(x, y);
  }

  public void draw(ShapeRenderer shapes) {
    for (Tile[] tileRow : grid) {
      for (Tile tile : tileRow) {
        tile.draw(shapes);
      }
    }
  }

  public void setTile(int col, int row, Color color, boolean solid) {
    this.tile = new Tile(col, row, color, solid);
  }

  public void setTile(Tile tile) {
    this.tile = tile;
  }

  public void setGrid(int x, int y) {
    this.grid = createGrid(x, y);
  }

  private Tile[][] createGrid(int x, int y) {
    Tile[][] grid = new Tile[x][y];

    for (int col = 0; col < x; col++) {
      for (int row = 0; row < y; row++) {
        grid[col][row] = new Tile(col, row, tile.color, tile.solid);
      }
    }

    return grid;
  }

  public Tile[][] getGrid() {
    return grid;
  }

  public Tile getTile() {
    return tile;
  }
}
