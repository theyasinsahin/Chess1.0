public class Board {
    private Piece[][] boardArea;

    public Board(){
        boardArea = new Piece[8][8];
        for (int i = 0; i < boardArea.length; i++) {
            for (int j = 0; j < boardArea.length; j++) {
                boardArea[i][j] = null;
            }
        }
    }

    public void createBoardDefault(){
        // Pawns
        for (int i = 0; i < boardArea.length; i++) {
            // White Pawns
            addPiece(new Pawn(6, i, true));

            //Black Pawns
            addPiece(new Pawn(1, i, false));

            //White Rooks
            addPiece(new Rook(7,0, true));
            addPiece(new Rook(7,7, true));

            //Black Rooks
            addPiece(new Rook(0,0, false));
            addPiece(new Rook(0,7, false));

            //White Knights
            addPiece(new Knight(7,1, true));
            addPiece(new Knight(7,6, true));

            //Black Knights
            addPiece(new Knight(0,1, false));
            addPiece(new Knight(0,6, false));

            //White Bishops
            addPiece(new Bishop(7,2, true));
            addPiece(new Bishop(7,5, true));

            //Black Bishops
            addPiece(new Bishop(0,2, false));
            addPiece(new Bishop(0,5, false));

            //White Queen
            addPiece(new Queen(7,3, true));

            //Black Queen
            addPiece(new Queen(0,3, false));

            //White King
            addPiece(new King(7,4, true));

            //Black King
            addPiece(new King(0,4, false));

        }

    }

    public void addPiece(Piece piece){
        boardArea[piece.getxPosition()][piece.getyPosition()] = piece;
    }

    public Piece[][] getBoardArea() {
        return boardArea;
    }

    public void setBoardArea(Piece[][] boardArea) {
        this.boardArea = boardArea;
    }

    public void setSquare(Piece piece, int x, int y){this.boardArea[x][y] = piece;}
}
