public class Consulta {
    String hora;
    String data;
    Medico medico;
    Paciente paciente;
    String motivo;
    String historico;

    public void marcar(){};
    public void cancelar(){};
    public void consultar(){};
    public void realizar(){};
    public void atualizar(){}
    public String getHora() {
        return hora;
    }

    public String getHora() {
        return hora;

    public void setHora(String hora) {
        try{
            if(hora == null){
                throw new Exception();
            }
            this.hora = hora;
        } catch{
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.hora = "";
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

    public Medico getMedico() {
        return medico;
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

    public Paciente getPaciente() {
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

    public String getMotivo() {
        return motivo;
    }

    
    public void setMotivo(String motivo){
        try{
            if(motivo == null){
                throw new Exception();
            }
            this.motivo = motivo;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.motivo = "";
        }
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico){
        try{
            if(historico == null){
                throw new Exception();
            }
            this.historico = historico;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.historico = "";
        }
    }

    public Consulta(String hora, String data, Medico medico, Paciente paciente, String motivo, String historico) {
        try {
            if (hora == null || data == null || medico == null || paciente == null || motivo == null || historico == null) {
                throw new Exception();
            }
            this.hora = hora;
            this.data = data;
            this.medico = medico;
            this.paciente = paciente;
            this.motivo = motivo;
            this.historico = historico;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção – Valores padrões definidos");
            this.hora = "";
            this.data = "";
            this.medico = "";
            this.paciente = "";
            this.motivo = "";
            this.historico = "";
        }
    }

    public Consulta() {
    }

    public void mostrar() {
        var s = "Consulta [getHora()=" + getHora() + ", getData()=" + getData() + ", getMedico()=" + getMedico()
                + ", getPaciente()=" + getPaciente() + ", getMotivo()=" + getMotivo() + ", getHistorico()="
                + getHistorico() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
        System.out.println(s);
    };

    

}
