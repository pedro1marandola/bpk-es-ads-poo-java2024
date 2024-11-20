public class Computador {
    private String processador;
    private String memoriaRam;
    private String armazenamento;
    private boolean ligado;

    public Computador(String processador, String memoriaRam, String armazenamento){
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.ligado = false;
    }
    public void ligar(){
        if(!ligado){
            ligado = true;
            System.out.println("PC Ligado.");
        }
        else{
            System.out.println("PC já está ligado.");
        }
    }
    public void desligar(){
        if(ligado){
            ligado = false;
            System.out.println("PC Desligado.");
        }
        else{
            System.out.println("PC já está desligado.");
        }
    }
    public String getProcessador() {
        return processador;
    }
    public void setProcessador(String processador) {
        this.processador = processador;
    }
    public String getMemoriaRam() {
        return memoriaRam;
    }
    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
    public String getArmazenamento() {
        return armazenamento;
    }
    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }
}
