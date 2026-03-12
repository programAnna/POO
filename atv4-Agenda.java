public class Agenda {
    String data;
    String hora;
    String medico;
    String paciente;

    public void consultar(){}

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

    public String getHora() {
        return hora;
    }

    public void setHora(String hora){
        try{
            if(hora == null){
                throw new Exception();
            }
            this.hora = hora;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.hora = "";
            }
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        try {
            if (medico == null) {
                throw new Exception();
            }
            this.medico = medico;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.medico = "";
            }
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente){
        try{
            if(paciente == null){
                throw new Exception();
            }
            this.paciente = paciente;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.paciente = "";
        }
    }

    public Agenda(String data, String hora, String medico, String paciente) {
        try {
            if (data == null || hora == null || medico == null || paciente == null) {
                throw new Exception();
            }
            this.data = data;
            this.hora = hora;
            this.medico = medico;
            this.paciente = paciente;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.data = "";
            this.hora = "";
            this.medico = "";
            this.paciente = "";
        }
    }

    public Agenda() {
    }

    public void mostrar() {
        var s = "Agenda [getData()=" + getData() + ", getHora()=" + getHora() + ", getMedico()=" + getMedico()
                + ", getPaciente()=" + getPaciente() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
        System.out.println(s);
    }

}
