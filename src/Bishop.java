public class Bishop extends Piece{
    public Bishop(int xPosition, int yPosition, boolean team) {
        super(xPosition, yPosition, team);

        if(team){
            setValue("B"); // White Bishop
        }else {
            setValue("b"); // Black Bishop
        }
    }
}
