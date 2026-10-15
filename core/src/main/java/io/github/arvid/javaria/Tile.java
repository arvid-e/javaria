package io.github.arvid.javaria;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Tile {
  public static final int SIZE = 32;
  public final int col, row;
  public Color color;
  public boolean solid;

  public Tile(int col, int row, Color color, boolean solid) {
    this.col = col;
    this.row = row;
    this.color = color;
    this.solid = solid;
  }

  public Tile(Tile tile) {
    this.col = tile.col;
    this.row = tile.row;
    this.color = tile.color;
    this.solid = tile.solid;
  }

  public void draw(ShapeRenderer shapes) {
    shapes.setColor(color);
    shapes.rect(col * SIZE, row * SIZE, SIZE, SIZE);
  }
}
