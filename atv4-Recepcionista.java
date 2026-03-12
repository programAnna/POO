public class Recepcionista {
    String nome;
    String cpf;
    String telefone;
    String senha;

    public void acessar(){}

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        try{
            if(cpf == null || cpf.length()<14){
                throw new Exception();
            }
            this.cpf = cpf;
        } catch {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.cpf = "";
        }
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

    public Recepcionista(String nome, String cpf, String telefone, String senha) {
        try {
            if (nome == null || (cpf == null || cpf.length()<14) || telefone == null || senha == null) {
                throw new Exception();
            }
            this.nome = nome;
            this.cpf = cpf;
            this.telefone = telefone;
            this.senha = senha;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.nome = "";
            this.cpf = "";
            this.telefone = "";
            this.senha = "";
        }
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
