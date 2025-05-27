import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println();
            System.out.println("\"How are you feeling today?");
            System.out.println("\n1. Happy\n2. Sad\n3. Chill\n4. Exit");
            System.out.println();
            System.out.print("Choose Option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> {
                    PlayHappyMusic.play();
                    musicControl(scanner, PlayHappyMusic::pause, PlayHappyMusic::play, PlayHappyMusic::stop);
                }
                case 2 -> {
                    PlaySadMusic.play();
                    musicControl(scanner, PlaySadMusic::pause, PlaySadMusic::play, PlaySadMusic::stop);
                }
                case 3 -> {
                    PlayChillMusic.play();
                    musicControl(scanner, PlayChillMusic::pause, PlayChillMusic::play, PlayChillMusic::stop);
                }
                case 4 -> Exit.execute();
                default -> System.out.println("Invalid Option");
            }

        }
    }

    private static void musicControl(Scanner scanner, Runnable pauseFunc, Runnable playFunc, Runnable stopFunc) {
        while (true) {
            System.out.println("\nCommands: p=Pause, r=Resume, s=Stop, q=Quit to menu");
            System.out.print("Enter command: ");
            String cmd = scanner.nextLine().trim().toLowerCase();

            switch (cmd) {
                case "p" -> pauseFunc.run();
                case "r" -> playFunc.run();
                case "s" -> stopFunc.run();
                case "q" -> {
                    stopFunc.run();
                    System.out.println("Returning to main menu...");
                    return;
                }
                default -> System.out.println("Invalid command");
            }
        }
    }
}
