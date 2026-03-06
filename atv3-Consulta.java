public class Consulta {
    private String hora;
    private String data;
    private Medico medico;
    private Paciente paciente;
    private String motivo;
    private String historico;

    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public String getHistorico() {
        return historico;
    }
    public void setHistorico(String historico) {
        this.historico = historico;
    }
    public void marcar(){};
    public void cancelar(){};
    public void consultar(){};
    public void realizar(){};
    public void atualizar(){};

    public void mostrar(){
        System.out.println(">>>>>Consulta<<<<<<<");
        System.out.println("Hora="+ getHora());
        System.out.println("data="+ getData());
        System.out.println("medico="+ getMedico());
        System.out.println("paciente="+ getPaciente());
        System.out.println("motivo="+ getMotivo());
        System.out.println("historico"+ getHistorico());
    }

}
