public class Receita {
    private String consulta;
    private String data;
    private String descritivo;

    public String getConsulta() {
        return consulta;
    }
    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getDescritivo() {
        return descritivo;
    }
    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }
    public void preescrever(){};
    public void consultar(){};

    public void mostrar(){
        System.out.println(">>>>>Receita<<<<<<<");
        System.out.println("consulta="+ getConsulta());
        System.out.println("data="+ getData());
        System.out.println("descritivo"+ getDescritivo());
    }

}
