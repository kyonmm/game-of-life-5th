package game.of.life;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Field {
  int width;
  int height;
  List<Cell> cells;
  public Field(int i, int i1) {
    width = i;
    height = i1;
    cells = new ArrayList<>();
    for (int x = 0; x < i; x++){
      for (int y = 0; y < i1; y++){
        cells.add(new Cell(x,y));
      }
    }

    setCellToLive(1,2);
    setCellToLive(2,2);
    setCellToLive(3,2);
  }

  public void setCellToLive(int x, int y) {
    var results = cells.stream().filter(cell -> cell.x == x && cell.y == y);
    results.findFirst().get().isAlive = true;
  }



  public boolean get(int x, int y) {
    var results = cells.stream().filter(cell -> cell.x == x && cell.y == y);
    return results.findFirst().get().isAlive;
  }

  public void time(int i) {
    for(int x = 0; x < 3; x++){
      for(int y = 0; y < 3; y++){
      }
    }
  }

}

