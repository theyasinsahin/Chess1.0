public class Piece {
    private int xPosition;
    private int yPosition;
    boolean team;
    String value;

    public Piece(int xPosition, int yPosition, boolean team){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.team = team;
    }

    public void moveTo(int to, Board board){
        board.setSquare(null, xPosition, yPosition);
        xPosition = to%10;
        yPosition = to/10;
        switch (value){
            case "B":
            case "b":
                board.addPiece(new Bishop(xPosition, yPosition, team));
                break;
            case "K":
            case "k":
                board.addPiece(new King(xPosition, yPosition, team));
                break;
            case "N":
            case "n":
                board.addPiece(new Knight(xPosition, yPosition, team));
                break;
            case "P":
            case "p":
                board.addPiece(new Pawn(xPosition, yPosition, team));
                break;
            case "Q":
            case "q":
                board.addPiece(new Queen(xPosition, yPosition, team));
                break;
            case "R":
            case "r":
                board.addPiece(new Rook(xPosition, yPosition, team));
                break;
            default:
                System.out.println("error");
        }
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }
}
