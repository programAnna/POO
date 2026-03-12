public class Medico {
    String nome;
    String crm;
    String telefone;
    String especialidade;
    String senha;

    public void acessar(){
        //TODO
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        try{
            if(nome == null){
                throw new Exception();
            }
            this.nome = nome;
        } catch {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.nome = "";
        }
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        try{
            if(crm == null || crm.length()>9){
                throw new Exception();
            }
            this.crm = crm;
        } catch{
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.crm = "";
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        try{
            if(telefone == null){
                throw new Exception();
            }
            this.telefone = telefone;
        } catch{
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.telefone = "";
        }
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        try{
            if(especialidade == null){
                throw new Exception();
            }
            this.especialidade = especialidade;
        } catch{
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.especialidade = "";
        }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        try{
            if(senha == null){
                throw new Exception();
            }
            this.senha = senha;
        } catch{
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.senha = "";
        }
    }

    public Medico(String nome, String crm, String telefone, String especialidade, String senha) {
        this.nome = nome;
        this.crm = crm;
        this.telefone = telefone;
        this.especialidade = especialidade;
        this.senha = senha;
    }

    public Medico(String nome, String crm, String telefone, String especialidade, String senha) {
        try {
            if (nome == null || (crm == null || crm.length()>9 )|| telefone == null || especialidade == null || senha == null) {
                throw new Exception();
            }
            this.nome = nome;
            this.crm = crm;
            this.telefone = telefone;
            this.especialidade = especialidade;
            this.senha = senha;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.nome = "";
            this.crm = "";
            this.telefone = "";
            this.especialidade = "";
            this.senha = "";
        }
    }

    public Medico() {
    }

   
    public void mostrar() {
       var s =  "Medico [getNome()=" + getNome() + ", getCrm()=" + getCrm() + ", getTelefone()=" + getTelefone()
                + ", getEspecialidade()=" + getEspecialidade() + ", getSenha()=" + getSenha() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
        System.out.println(s);
    }


    
}
