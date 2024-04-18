import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        WriteMethods writeMethods = new WriteMethods();
        Board board = new Board();

        board.createBoardDefault();
        writeMethods.writeBoard(board);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println();
            System.out.print("Move: ");


            String[] theMove = scanner.nextLine().split(" ");
            if (theMove.length == 2 && theMove[0].length() == 2 && theMove[1].length() == 2) {
                char file = theMove[0].charAt(0);
                char rank = theMove[0].charAt(1);

                if (file >= 'A' && file <= 'H' && rank >= '1' && rank <= '8') {
                    int fileValue = file - 'A';
                    int rankValue = rank - '0';

                    // Convert algebraic notation to numerical notation
                    int fromCoordinate = fileValue*10 + (Math.abs(rankValue-9)) - 1;

                    // Repeat the process for the second coordinate
                    file = theMove[1].charAt(0);
                    rank = theMove[1].charAt(1);
                    if (file >= 'A' && file <= 'H' && rank >= '1' && rank <= '8') {
                        {
                            fileValue = file - 'A';
                            rankValue = rank - '0';
                            int toCoordinate = fileValue * 10 + (Math.abs(rankValue - 9)) - 1;

                            // Perform the move using the numerical coordinates
                            // Check for null before accessing board.getBoardArea()
                            if (board.getBoardArea() != null) {
                                int fromRank = fromCoordinate / 10;
                                int fromFile = fromCoordinate % 10;
                                int toRank = toCoordinate / 10;
                                int toFile = toCoordinate % 10;
                                board.getBoardArea()[fromFile][fromRank].moveTo(toCoordinate, board);
                                System.out.println();
                            } else {
                                System.out.println("Error: Board is not properly initialized.");
                            }
                        }
                    }
                }
            } else {
                System.out.println("Try Again");
            }
            writeMethods.writeBoard(board);

        }






    }
}