package io.github.arvid.javaria.world;

import java.util.HashMap;

public enum TileType {
  GRASS(1, true, "grass"),
  DIRT(2, true, "dirt"),
  STONE(3, true, "stone"),
  LAVA(4, true, "lava"),
  CLOUD(5, false, "cloud"),
  SKY(6, true, "sky");

  private int id;
  private boolean collidable;
  private String name;
  private float damage; 

  public static final int TILE_SIZE = 16;

  private TileType(int id, boolean collidable, String name) {
    this(id, collidable, name, id);
  }

  private TileType(int id, boolean collidable, String name, float damage) {
    this.id = id;
    this.collidable = collidable;
    this.name = name;
    this.damage = damage; 

  }

  private static HashMap<Integer, TileType> tileMap;

  public int getId() {
    return id;
  }

  public float getDamage() {
    return damage;
  }

  public String getName() {
    return name;
  }

  public boolean getCollidable() {
    return collidable;
  }

  public static TileType getTypeById(int id) {
    return tileMap.get(id);
  }

  static {
    for (TileType tileType : TileType.values()) {
      tileMap.put(tileType.getId(), tileType);
    }
  }

}
