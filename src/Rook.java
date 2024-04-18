public class Rook extends Piece{
    public Rook(int xPosition, int yPosition, boolean team) {
        super(xPosition, yPosition, team);
        if(team){
            setValue("R"); // White Rook
        }else {
            setValue("r"); // Black Rook
        }
    }
}
