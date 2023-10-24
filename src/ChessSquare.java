package src;
/*
Ход коня по шахматной доске. Вводится текущее положение коня и клетка в которую пробует его передвинуть
за 1 ход. Программа должна проверить, возможно ли это сделать.
 */


import java.util.Scanner;

public class ChessSquare {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the starting position of the knight");
        String start = scan.nextLine().toLowerCase();
        System.out.println("Enter the next position of the knight");
        String next = scan.nextLine().toLowerCase();
        String conclusion = (correctMove(start.charAt(0), Character.digit(start.charAt(1), 10),
                next.charAt(0), Character.digit(next.charAt(1), 10))) ? "Yes, it's possible" : "No, it's impossible";
        System.out.println(conclusion);
    }

    public static boolean withinChessBoard(char horizontal, int vertical) {
        return ((horizontal >= 'a' && horizontal <= 'h') && (vertical >= 1 && vertical <= 8));
    }

    public static boolean correctMove(char horStartPos, int vertStartPos, char horNextPos, int vertNextPos) {
        return withinChessBoard(horStartPos, vertStartPos) &&
                withinChessBoard(horNextPos, vertNextPos) &&
                ((horStartPos != horNextPos) && (vertStartPos != vertNextPos)) &&
                Math.abs(horStartPos - horNextPos) + Math.abs(vertStartPos - vertNextPos) == 3;
    }
}