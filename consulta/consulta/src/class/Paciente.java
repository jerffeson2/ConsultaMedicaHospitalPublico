

class Paciente {
    private String nome;
    private int cpf;
    private String endereco;
    private int telefone;
    private String email;

    public Paciente(String nome, int cpf, String endereco, int telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public void agendamento() {
        // Lógica para agendar a consulta
    }

    public void imprimirAgendamento() {
        // Lógica para imprimir o agendamento
    }

    public void cancelarConsulta() {
        // Lógica para cancelar a consulta
    }
}

class Medico {
    private String nome;
    private int cpf;
    private int telefone;
    private String email;

    public Medico(String nome, int cpf, int telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }
}

class GestorSistema {
    private String nomeHospital;
    private int endereco;
    private int data;
    private int hora;
    private String nomeMedico;
    private String especialidade;

    public GestorSistema(String nomeHospital, int endereco, int data, int hora, String nomeMedico, String especialidade) {
        this.nomeHospital = nomeHospital;
        this.endereco = endereco;
        this.data = data;
        this.hora = hora;
        this.nomeMedico = nomeMedico;
        this.especialidade = especialidade;
    }

    public int imprimirAgendamento() {
        // Lógica para imprimir o agendamento
        return 0;
    }

    public void chat() {
        // Lógica para chat
    }

    public void notificacoesEmail() {
        // Lógica para notificações por e-mail
    }

    public void atualizarDados() {
        // Lógica para atualizar dados
    }
}

public class SistemaMarcacaoConsulta {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("João", 123456789, "Rua A, 123", 987654321, "joao@example.com");
        paciente.agendamento();
        paciente.imprimirAgendamento();
        paciente.cancelarConsulta();

        Medico medico = new Medico("Dr. Pedro", 987654321, 123456789, "pedro@example.com");

        GestorSistema gestor = new GestorSistema("Hospital XYZ", 456, 20230610, 1000, "Dr. Pedro", "Cardiologia");
        gestor.imprimirAgendamento();
        gestor.chat();
        gestor.notificacoesEmail();
        gestor.atualizarDados();
    }
}