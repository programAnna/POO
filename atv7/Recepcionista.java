public class Recepcionista extends Funcionario {
    public String cpf;

    public void acessar(){
        //TODO
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Recepcionista() {
    }
    public Recepcionista(String pNome, String pCpf, String pTelefone, String pSenha) throws Exception{
        setNome(pNome);
        setCpf(pCpf);
        setTelefone(pTelefone);
        setSenha(pSenha);
    }
    public void mostrar(){
        System.out.println(">>>>>>Recepcionista<<<<<<<");
        System.out.println("nome:"+getNome());
        System.out.println("cpf:"+getCpf());
        System.out.println("telefone:"+getTelefone());
        System.out.println("senha:"+getSenha());
    }
}
