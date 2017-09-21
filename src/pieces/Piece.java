package pieces;

public abstract class Piece {
  private final Colour colour;

  public Piece(Colour color){
    this.colour = color;
  }

  public Colour getColour() {
    return colour;
  }
}
