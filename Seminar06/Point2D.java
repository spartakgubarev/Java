package Seminar06;



class Point2D {
    int x, y;
  
    public Point2D(int x, int y) {
      this.x = x;
      this.y = y;
    }
  
    public int getX() {
      return x;
    }
  
    public int getY() {
      return y;
    }
  
    @Override
    public String toString() {
      return String.format("x: %d  y: %d", x, y);
    }
  }
  
  
  