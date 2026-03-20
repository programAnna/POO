public class Recepcionista {
    private String nome;
    private String cpf;
    private String telefone;
    private String senha;

    public void acessar(){}
    public void acessarPaciente(){
        Paciente josefa = new Paciente();
        josefa.setCodigo("123123");
        josefa.setNome("Josefa Almeida");
        josefa.setEmail(email: "josefa@almeida.com.br");
        josefa.acessar();
        
        Consulta ortopedista = new Consulta();
        ortopedista.setData("20/03/2026");
        ortopedista.setHora("13h30");
        ortopedista.setMedico("Sueli");
        ortopedista.setPaciente(josefa);
        ortopedista.setMotivo("dor no joelho");
        ortopedista.setAgenda("vazia");
        ortopedista.setReceita("repouso");
        ortopedista.setExame("ressonancia");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
         if(nome==null || nome.length()<=0)
            throw new Exception("Informe o nome!");
     
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

    public Recepcionista(String nome, String cpf, String telefone, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.senha = senha;
    }

    public Recepcionista() {
    }

   
    public void mostrar() {
        var s = "Recepcionista [getNome()=" + getNome() + ", getCpf()=" + getCpf() + ", getTelefone()=" + getTelefone()
                + ", getSenha()=" + getSenha() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
        System.out.println(s);
    };


    
}
