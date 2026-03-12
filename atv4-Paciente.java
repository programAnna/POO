public class Paciente {
    private Int codigo;
    private String nome;
    private String email;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(Int codigo) {
        try {
            if (codigo == null) {
                throw new Exception();
            }
            this.codigo = codigo;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.codigo = "";
            }
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if(email==null || email.length()<6 || !email.contains("@")){
            throw new Exception("Email completo Obrigatorio !");
        } else {
            this.email = email;
        }
    }

    public Paciente(){
        this.codigo=0;
        this.nome="";
        this.email="";
    }

    public Paciente(int pCodigo, String pNome, String pEmail) throws Exception{
        setCodigo(pCodigo);
        setEmail(pEmail);
        setNome(pNome);
    }


    public void mostrar() {
        var s = "Paciente [getCodigo()=" + getCodigo() + ", getNome()=" + getNome() + ", getEmail()=" + getEmail()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
        System.out.println(s);        
    }

   
   
}
