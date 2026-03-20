public class Medico {
    private String nome;
    private String crm;
    private String telefone;
    private String especialidade;
    private String senha;

    public void acessar(){
        Receita artrose = new Receita();
        artrose.setConsulta("ortopedista");
        artrose.setData("20/03/2026");
        private.setDescritivo("dor no joelho por artrose");
        
        Exame ressonancia = new Exame()
        ressonancia.setData("01/02/2026");
        ressonancia.setConsulta("ortopedista");
        ressonancia.setDescritivo("investigar dor no joelho");
    }
 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) throws Exception{
        if(crm==null || crm.length()<7) throw new Exception("Crm obrigatorio !");
        this.crm = crm;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Medico(String nome, String crm, String telefone, String especialidade, String senha) {
        this.nome = nome;
        this.crm = crm;
        this.telefone = telefone;
        this.especialidade = especialidade;
        this.senha = senha;
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
