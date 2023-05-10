import java.util.Random;
import java.util.Scanner;

public class Mine {
    int mineCount;
    int row,column;
    String[][] board;
    String[][] mineMap;
    boolean gameStat=true;

    Mine(int row,int column){
        this.row=row;
        this.column=column;
        board=new String[row][column];
        mineMap=new String[row][column];
        createMineMap();
        printMap();
        gameLoop();
    }

    public void gameLoop() {
        while(gameStat) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Select the row: ");
            int pickenRow= scan.nextInt();
            System.out.print("Select the column: ");
            int pickenColumn= scan.nextInt();
            if(pickenRow<0 || pickenRow >row-1 || pickenColumn <0 || pickenColumn>column-1) {
                System.out.println("Choose an area within the bounds of the array!");
                continue;
            }
            if(checkMap(pickenRow,pickenColumn)) {
                checkAndPrint(pickenRow,pickenColumn);
            }else {
                System.out.println("Game Over");
                gameStat=false;
            }
        }
    }
    public void createMineMap() {
        int mineCount=(row*column)/4;
        int i=0;
        while(i<mineCount) {
            Random rnd=new Random();
            int randRow=rnd.nextInt(row);
            int randColumn=rnd.nextInt(column);
            if(checkMap(randRow,randColumn)) {
                mineMap[randRow][randColumn]="M";
            }else {
                i--;
            }

            i++;
        }
    }
    public boolean checkMap(int rowNumber,int columnNumber) {
        if(mineMap[rowNumber][columnNumber]=="M")
            return false;
        else
            return true;
    }
    public void printMap() {
        for(int i=0;i<row;i++) {
            for(int k=0;k<column;k++) {
                if(mineMap[i][k]!="M") {
                    System.out.print("-");
                    mineMap[i][k]="-";
                }
                else
                    System.out.print(mineMap[i][k]);
            }
            System.out.println();
        }
    }
    public void checkAndPrint(int pickenRow,int pickenColumn) {
        int temp=0;
        int tempCont=0;
        for(int i=pickenRow-1;i<=pickenRow+1;i++) {
            if(i<0 || i>row-1) continue;
            for(int k=pickenColumn-1;k<=pickenColumn+1;k++) {
                if(k<0 || k>column-1) continue;
                if(mineMap[i][k]=="M") {
                    temp++;
                }
            }
        }
        mineMap[pickenRow][pickenColumn]=Integer.toString(temp);
        for(int i=0;i<row;i++) {
            for(int k=0;k<column;k++) {
                if(Character.isDigit(mineMap[i][k].charAt(0)))
                    System.out.print(mineMap[i][k]);
                else if(mineMap[i][k]=="M")
                    System.out.print("-");
                else {
                    tempCont++;
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        if(tempCont<1) {
            gameStat=false;
            System.out.println("YOU WON!!!!");
        }
    }

}