public class Recepcionista {
    private String nome;
    private String cpf;
    private String telefone;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void acessar(){};

    public void mostrar(){
        System.out.println(">>>>>Recepcionista<<<<<<<");
        System.out.println("nome="+ getNome());
        System.out.println("CPF="+ getCpf());
        System.out.println("telefone="+ getTelefone());
        System.out.println("senha="+ getSenha());
    }
}
