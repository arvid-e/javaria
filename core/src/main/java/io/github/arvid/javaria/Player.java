package io.github.arvid.javaria;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Player {
  float x;
  float y;
  float height = 50;
  float width = 50;
  float speed = 4f;

  public Player(float x, float y) {
    this.x = x;
    this.y = y;
  }

  public void render(ShapeRenderer shapes) {
    shapes.setColor(Color.SKY);
    shapes.rect(x, y, width, height);
  }

  public float getSpeed() {
    return speed;
  }

  public float getX() {
    return x;
  }

  public float getY() {
    return y;
  }
}
