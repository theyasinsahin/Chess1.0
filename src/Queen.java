public class Queen extends Piece{
    public Queen(int xPosition, int yPosition, boolean team) {
        super(xPosition, yPosition, team);
        if(team){
            setValue("Q"); // White Queen
        }else {
            setValue("q"); // Black Queen
        }
    }
}
