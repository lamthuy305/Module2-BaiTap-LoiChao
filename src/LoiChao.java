import java.util.Scanner;
public class LoiChao {
    public static void main(String[] args) {
        System.out.println("Nhập tên: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
