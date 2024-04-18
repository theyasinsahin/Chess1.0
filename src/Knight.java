public class Knight extends Piece{
    public Knight(int xPosition, int yPosition, boolean team) {
        super(xPosition, yPosition, team);

        if(team){
            setValue("N"); // White Knight
        }else {
            setValue("n"); // Black Knight
        }
    }
}
