import java.util.Scanner;

public class GuessTheNumber {
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 1 + (int) (Math.random() * 100);
        int maxAttempts = 5;
        int attempts, guess;
        System.out.println("Bienvenido a GuessTheNumber");
        System.out.println("La maquina ha elegido un numero entre el 1 al 100, debes de encontrarlo, \n " +
                "pero solo tienes 5 intentos para encontrarlo");

        for (attempts = 0; attempts < maxAttempts; attempts++) {
            System.out.println("Attempts: " + (attempts + 1) + " Te toca divinar: ");
            guess = scanner.nextInt();
            if (secretNumber == guess) {
                System.out.println("Lo has encontrado ;)");
                break;
            } else if (secretNumber > guess && attempts != maxAttempts - 1) {
                System.out.println("El numero es mayor al que has proporcionado");
            } else if (secretNumber < guess && attempts != maxAttempts - 1) {
                System.out.println("El numero es menor al que has proporcionado");
            }
        }
        if (attempts == maxAttempts) {
            System.out.println("Has gastado los " + maxAttempts + " intentos");
            System.out.println("Y el numero secreto era " + secretNumber + " *pongase las pilar papi*");
        }
    }

    public static void main(String[] args) {
        playGame();
    }
}