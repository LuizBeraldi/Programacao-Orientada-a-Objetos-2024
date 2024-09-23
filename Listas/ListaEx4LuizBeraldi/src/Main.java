import java.util.*;

public class Main {
    private static List<Curso> cursos = new ArrayList<>();
    private static Map<String, Aluno> alunos = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarCurso();
                    break;
                case 2:
                    atualizarCurso();
                    break;
                case 3:
                    inscreverAluno();
                    break;
                case 4:
                    personalizarNotificacao();
                    break;
                case 5:
                    listarCursos();
                    break;
                case 6:
                    System.out.println("Fechando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }
        } while (opcao != 6);
    }

    private static void exibirMenu() {
        System.out.println("\n---- Menu ----");
        System.out.println("1. Cadastrar um novo curso");
        System.out.println("2. Atualizar informações de um curso");
        System.out.println("3. Inscrever aluno em notificações de um curso");
        System.out.println("4. Personalizar notificações de um aluno");
        System.out.println("5. Listar cursos cadastrados");
        System.out.println("6. Sair");
        System.out.println("Escolha uma opção");
        System.out.print("-> ");
    }

    private static void cadastrarCurso() {
        System.out.print("Digite o nome do curso: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a descrição do curso: ");
        String descricao = scanner.nextLine();

        cursos.add(new Curso(nome, descricao));
        System.out.println("Curso cadastrado com sucesso!");
    }

    private static void atualizarCurso() {
        Curso curso = selecionarCurso();
        if (curso != null) {
            System.out.print("Digite a nova descrição do curso: ");
            String descricao = scanner.nextLine();
            curso.setDescricao(descricao);
        }
    }

    private static void inscreverAluno() {
        Curso curso = selecionarCurso();
        if (curso != null) {
            System.out.print("Digite o nome do aluno: ");
            String nome = scanner.nextLine();

            Aluno aluno = alunos.computeIfAbsent(nome, Aluno::new);
            curso.registrarObserver(aluno);
            System.out.println("Aluno inscrito no curso com sucesso!");
        }
    }

    private static void personalizarNotificacao() {
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        Aluno aluno = alunos.get(nome);
        if (aluno != null) {
            System.out.println("Opções de personalização:");
            System.out.println("1. Adicionar prefixo URGENTE");
            System.out.println("2. Colocar notificação em maiúsculas");
            System.out.println("3. Incluir data de atualização");
            System.out.println("Escolha uma opção: ");
            System.out.print("-> ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            Notificacao notificacao = new NotificacaoSimples();

            switch (escolha) {
                case 1:
                    notificacao = new NotificacaoUrgente(notificacao);
                    break;
                case 2:
                    notificacao = new NotificacaoMaiuscula(notificacao);
                    break;
                case 3:
                    notificacao = new NotificacaoComData(notificacao);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
                    return;
            }
            aluno.setNotificacao(notificacao);
            System.out.println("Personalização aplicada com sucesso!");
        } else {
            System.out.println("Aluno não encontrado no sistema!");
        }
    }

    private static void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso cadastrado no sistema!");
        } else {
            System.out.println("Cursos cadastrados:");
            for (Curso curso : cursos) {
                System.out.println("- " + curso.getNome() + ": " + curso.getDescricao());
            }
        }
    }

    private static Curso selecionarCurso() {
        listarCursos();
        if (cursos.isEmpty()){
            return null;
        }

        System.out.print("Digite o nome do curso: ");
        String nomeCurso = scanner.nextLine();

        for (Curso curso : cursos) {
            if (curso.getNome().equalsIgnoreCase(nomeCurso)) {
                return curso;
            }
        }

        System.out.println("Curso não encontrado no sistema!");
        return null;
    }
}
