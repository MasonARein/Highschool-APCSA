package apcs.hanoi;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many discs are there?");
        int discs = reader.nextInt();
        char item = (char)('A'+(discs-1));
        move (discs, 1, 3, 2, item);

    }
    public static void move (int num, int from, int to, int other, char stat){

        if(num == 1)
            System.out.println("Moving disk " + stat +" from " + from + " to " + to);
        else{
            move (num -1, from, other, to, (char)(stat-1));
            move (1, from, to, other, stat);
            move (num-1, other, to, from, (char)(stat-1));
        }
    }
}
