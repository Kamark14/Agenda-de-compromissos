import java.util.Scanner;

public class main1 {
    String dia = "Dia do compromisso:";
    String mes = "Mês do compromisso:";
    String horario = "Horário do compromisso:";
    String compromisso = "Compromisso:";

    public static void main(String[] args) {
        System.out.println("Sistema de agenda de compromissos:");
        System.out.println();
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.print("Digite o dia do compromisso: ");
            String diaUsuario = scanner.nextLine();
            System.out.print("Digite o mes do compromisso: ");
            String mes = scanner.nextLine();
            System.out.print("Digite o horario do compromisso: ");
            String horario = scanner.nextLine();
            System.out.print("Digite o compromisso: ");
            String compromisso = scanner.nextLine();
            System.out.println();
            System.out.print("Compromisso agendado: " + compromisso + " no dia " + diaUsuario + " do mes " + mes + " as "+ horario);
            System.out.println();
        }
    }
}
