package netology.hw222cross;



public class Main {
    public static final int SIZE = 5;                   //матрицы д.б. нечетные
    public static final char EMPTY = '-';
    public static final char CROSS = 'X';
    public static final char ZERO = 'O';

    public static void main(String[] args) {

        char[][] field = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = EMPTY;

                // для 5х5
                //разкоментировать один из след. вариантов для проверки:

                //нолики победили по 1ой строке
//                if (i == 0 && j == 0 || i == 0 && j == 1 || i == 0 && j == 2|| i == 0 && j == 3|| i == 0 && j == 4) field[i][j] = ZERO;
                //нолики победили по 2ому столбцу
//                if (i == 0 && j == 1 || i == 1 && j == 1 || i == 2 && j == 1|| i == 3 && j == 1|| i == 4 && j == 1) field[i][j] = ZERO;
                //нолики победили по левой диагонали
//                if (i == 0 && j == 0 || i == 1 && j == 1 || i == 2 && j == 2|| i == 3 && j == 3|| i == 4 && j == 4) field[i][j] = ZERO;
                //нолики победили по правой диагонали
                if (i == 4 && j == 0 || i == 3 && j == 1 || i == 2 && j == 2|| i == 1 && j == 3|| i == 0 && j == 4) field[i][j] = ZERO;
                //ничья
//                if (i == 4 && j == 0 || i == 3 && j == 1 || i == 2 && j == 2 ) field[i][j] = ZERO;
            }
        }

        printField(field);

        boolean isCrossTurn = true; //hm gist trein
        int turnMax=0;

        while (true) {
            if (isWin(field, isCrossTurn ? CROSS : ZERO)) {
                System.out.println("Победили " + (isCrossTurn ? "крестики" : "нолики"));
                break;
            } else if (turnMax<2) {
                isCrossTurn = !isCrossTurn;
                turnMax++;
            } else{
                System.out.println("Ничья");
                break;
                //по хорошему д.б. 3 условия: нет победы, нет пустых выгрышных линий(в кажд победной д.б и Х и 0) или осталась одна но хода два(хотя ктото может тупить?), доп: нет перебора кол-ва ходв

            }
        }
        System.out.println("Игра закончена!");
    }


    public static boolean isWin(char[][] field, char player) {

        int strCntMaxRaw = 0;
        int strCntMaxClmn = 0;
        int strCnt1Diag = 0;
        int strCnt2Diag = 0;
        for (int i = 0; i < field.length; i++) {
            int strCntRaw = 0;
            int strCntClmn = 0;
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j] == player) {                             //по строкам
                    strCntRaw++;
                    strCntMaxRaw = Math.max(strCntMaxRaw, strCntRaw);
                }
                if (field[j][i] == player) {                             //по столбцам
                    strCntClmn++;
                    strCntMaxClmn = Math.max(strCntMaxClmn, strCntClmn);
                }
                if (i == j && field[i][j] == player) strCnt1Diag++;                 //по лев диагонали
                if ((i + j)==(SIZE-1) && field[i][j] == player) strCnt2Diag++;     //по прав диагонали
            }
        }
        if (strCntMaxRaw == field[0].length) return true;
        if (strCntMaxClmn == field.length) return true;
        if (strCnt1Diag == SIZE) return true;
        if (strCnt2Diag == SIZE) return true;

        return false;
    }


    public static void printField(char[][] field) {
        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }


}