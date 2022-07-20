import java.util.Random;
import java.util.Scanner;

/**
 * rock_paper_ scissors
 */
public class rock_paper_scissors {

    public static void main(String[] args) {

        Random random = new Random();
        int i_win = 0;
        int c_win = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("The rock is 1");
        System.out.println("The paper is 2");
        System.out.println("The scissor is 3");
        System.out.print("How many times i want to play? ");
        int t = input.nextInt();
        while (t > 0) {
            int x = random.nextInt(1, 4);
            System.out.println("The Computer says: " + x);
            System.out.print("Enter the my value: ");
            int y = input.nextInt();

            switch (y) {
                case 0:
                    y = 0;
                    System.out.println("Out of order sequence");
                    break;

                case 1:
                    y = 1;
                    switch (x) {
                        case 0:
                            x = 0;
                            System.out.println("Out of order sequence");
                            break;
                        case 1:
                            x = 1;
                            System.out.println("No one win");
                            break;
                        case 2:
                            x = 2;
                            System.out.println("Computer win");
                            c_win++;
                            break;
                        case 3:
                            x = 3;
                            System.out.println("i win ");
                            i_win++;
                            break;

                    }
                    break;

                case 2:
                    y = 2;
                    switch (x) {
                        case 0:
                            x = 0;
                            System.out.println("Out of order sequence");
                            break;
                        case 1:
                            x = 1;
                            System.out.println("i win");
                            i_win++;
                            break;
                        case 2:
                            x = 2;
                            System.out.println("No one win");
                            break;
                        case 3:
                            x = 3;
                            System.out.println("Computer win");
                            c_win++;
                            break;

                    }
                    break;

                case 3:
                    y = 3;
                    switch (x) {
                        case 0:
                            x = 0;
                            System.out.println("Out of order sequence");
                            break;
                        case 1:
                            x = 1;
                            System.out.println("Computer win");
                            c_win++;
                            break;
                        case 2:
                            x = 2;
                            System.out.println("I win");
                            i_win++;
                            break;
                        case 3:
                            x = 3;
                            System.out.println("No one win");
                            break;
                    }
                    break;
                case 4:
                    if (y > 3) {
                        System.out.println("You are out of limit");
                        break;

                    }
                    break;

                default:
                    System.out.println("Good playing");

            }
            t--;

        }
        System.out.println("The final result:");
        if (c_win > i_win) {
            System.out.println("Cmputer win this match");

        } else if (c_win == i_win) {
            System.out.println("Draw match");

        } else {
            System.out.println("I win this match");

        }

        input.close();

    }
}