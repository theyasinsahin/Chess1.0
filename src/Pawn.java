public class Pawn extends Piece{
    boolean isFirstMove;

    public Pawn(int xPosition, int yPosition, boolean team) {
        super(xPosition, yPosition, team);
        if(team){
            setValue("P"); // White Pawn
        }else {
            setValue("p"); // Black Pawn
        }

        isFirstMove = true;
    }

    public void move(int x, int y, Board board){
        if(isMoveLegal(x, y, board)){
            setxPosition(x);
            setyPosition(y);
        }else{
            System.out.println("The move is illegal");
        }
    }

    public boolean isMoveLegal(int x, int y, Board board){
        boolean flag = true;
        if(isFirstMove){
            if(team){
                if(!((x-getxPosition() <= 2 && x-getxPosition()>0) && (y-getyPosition() == 0))){
                    flag = false;
                }
            }else{
                if(!((getxPosition()-x <= 2 && getxPosition()-x>0) && (y-getyPosition() == 0))){
                    flag = false;
                }
            }
        }else{
            if(team){
                if(!(x-getxPosition() == 1 && y-getyPosition() == 0)){
                    flag = false;
                }
            }else{
                if(!(getxPosition()-x == 1 && y-getyPosition() == 0)){
                    flag = false;
                }
            }
        }
        return flag;
    }
}
