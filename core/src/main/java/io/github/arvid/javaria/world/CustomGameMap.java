package io.github.arvid.javaria.world;

import com.badlogic.gdx.graphics.OrthographicCamera;

public class CustomGameMap extends GameMap {
  @Override
  public void render(OrthographicCamera camera) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void update(float delta) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void dispose() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public TileType getTileTypeByLocation(int layer, float x, float y) {
    // TODO Auto-generated method stub
    return super.getTileTypeByLocation(layer, x, y);
  }

  @Override
  public TileType getTileTypeByCoordinate(int layer, float x, float y) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int getWidth() {
    // TODO Auto-generated method stub
    return 0;
  }
  
  @Override
  public int getHeight() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int getLayers() {
    // TODO Auto-generated method stub
    return 0;
  }
}
