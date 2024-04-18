import java.util.Arrays;

public class WriteMethods {

    public void writeBoard(Board board){
        for (int i = 0; i < board.getBoardArea().length; i++) {
            System.out.print(Math.abs(i+1-9)+" ");
            for (int j = 0; j < board.getBoardArea().length; j++) {
                if(board.getBoardArea()[i][j] == null){
                    System.out.print("_ ");
                }else{
                    System.out.print(board.getBoardArea()[i][j].getValue()+" ");
                }
            }
            System.out.println();
        }
        System.out.print("  ");
        for (int i = 0; i < 8; i++) {
            char a = 'A';
            System.out.print(String.valueOf(Character.toChars(a + i)) +" ");
        }
    }
}
