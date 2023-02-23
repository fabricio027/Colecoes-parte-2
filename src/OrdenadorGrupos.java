import java.util.*;

public class OrdenadorGrupos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcao = 'N';
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();
        Map<String, List<String>> grupo = new HashMap<>();

        do {
            System.out.print("Informe o nome: ");
            String nome = sc.nextLine();
            System.out.print("Informe o sexo (M=Masculino/F=Feminino): ");
            char sexo = sc.next().toUpperCase().charAt(0);
            sc.nextLine();

            if (sexo != 'M' && sexo != 'F') {
                System.out.println("Sexo " + sexo + " é inválido.");
                continue;
            } else if (sexo == 'M') {
                masculino.add(nome);
            } else {
                feminino.add(nome);
            }

            System.out.print("Inserir outro nome? S/N: ");
            opcao = sc.next().toUpperCase().charAt(0);
            sc.nextLine();

        } while (opcao == 'S');

        grupo.put("masculino", masculino);
        grupo.put("feminino", feminino);

        System.out.println("HOMENS:");
        System.out.println(grupo.get("masculino"));


        System.out.println("MULHERES:");
        System.out.println(grupo.get("feminino"));
    }


}
