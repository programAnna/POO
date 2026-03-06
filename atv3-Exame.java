public class Exame {
    private String consulta;
    private String data;
    private String descritivo;

    public void solicitar(){}
    public void consultar(){}

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

    public void mostrar(){
        System.out.println(">>>>>Exame<<<<<<<");
        System.out.println("consulta="+ getConsulta());
        System.out.println("data="+ getData());
        System.out.println("descritivo="+ getDescritivo());
    }

}
