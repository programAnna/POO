public class Exame {
    String consulta;
    String data;
    String descritivo;

    public void solicitar(){}
    public void consultar(){}

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        try {
            if (consulta == null) {
                throw new Exception();
            }
            this.consulta = consulta;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.consulta = "";
            }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        try {
            if (data == null) {
                throw new Exception();
            }
            this.data = data;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.data = "";
            }
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        try {
            if (descritivo == null) {
                throw new Exception();
            }
            this.descritivo = descritivo;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.descritivo = "";
            }
    }

    public Exame(String consulta, String data, String descritivo) {
        this.consulta = consulta;
        this.data = data;
        this.descritivo = descritivo;
    }

    public Exame() {
    }
   
    public void mostrar() {
        var s = "Exame [getConsulta()=" + getConsulta() + ", getData()=" + getData() + ", getDescritivo()="
                + getDescritivo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
        System.out.println(s);
    }
 
}
