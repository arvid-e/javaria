package io.github.arvid.javaria;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class KeyHandler {
  Player player;

  public KeyHandler(Player player) {
    this.player = player;
  }
  
  public void listen() {
    if (Gdx.input.isKeyPressed(Keys.A)) {
      this.player.x -= this.player.getSpeed();
    } else if (Gdx.input.isKeyPressed(Keys.D)) {
      this.player.x += this.player.getSpeed();
    } else if (Gdx.input.isKeyPressed(Keys.W)) {
      this.player.y += this.player.getSpeed();
    } else if (Gdx.input.isKeyPressed(Keys.S)) {
      this.player.y -= this.player.getSpeed();
    }

  }
}
