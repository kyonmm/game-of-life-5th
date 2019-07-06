package game.of.life;

/**
 *
 */
public class Cell {
  int x;
  int y;
  boolean isAlive = false;

  public Cell(int x, int y) {
    this.x = x;
    this.y = y;
  }
}
