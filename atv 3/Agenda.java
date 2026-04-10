public class Agenda {
    private String data;
    private String hora;
    private String medico;
    private String paciente;

    public void consultar(){}

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public void mostrar(){
       System.out.println(">>>>>Agenda<<<<<<<");
       System.out.println("data="+ getData());
       System.out.println("hora="+getHora());
       System.out.println("medico="+getMedico());3
       System.out.println("paciente="+ getPaciente()); 
   }

}
