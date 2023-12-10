import java.util.Scanner;

public class LoginAndCaptcha {
    private static final String USERNAME = "faiz";
    private static final String PASSWORD = "faiz123";
    private static final String CAPTCHA = "uwis";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Login
        System.out.println("=== Login ===");
        System.out.print("Masukan username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Masukan password: ");
        String passwordInput = scanner.nextLine();

        if (login(usernameInput, passwordInput)) {
            System.out.println("Login berhasil!");

            // CAPTCHA
            System.out.println("\n=== CAPTCHA ===");
            System.out.print("Enter CAPTCHA: ");
            String captchaInput = scanner.nextLine();

            if (validateCaptcha(captchaInput)) {
                System.out.println("Validasi CAPTCHA berhasil!");
                // Lanjutkan ke proses setelah login dan CAPTCHA benar
            } else {
                System.out.println("Validasi CAPTCHA gagal!");
            }
        } else {
            System.out.println("Login gagal. KAMU ditolak.");
        }

        scanner.close();
    }

    private static boolean login(String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }

    private static boolean validateCaptcha(String captcha) {
        return CAPTCHA.equalsIgnoreCase(captcha);
    }
}
