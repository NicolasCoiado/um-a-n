import java.util.Scanner;
public class UmAN {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int linhas = sc.nextInt();

        imprimir(linhas);

        sc.close();

    }
    public static void imprimir(int linhas) {
        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
}