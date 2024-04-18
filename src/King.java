public class King extends Piece{
    public King(int xPosition, int yPosition, boolean team) {
        super(xPosition, yPosition, team);

        if(team){
            setValue("K"); // White King
        }else {
            setValue("k"); // Black King
        }
    }
}
