
public class Conversor {

    private int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int converterMeses() {
        return this.ano * 12;
    }
    public int converterSemanas(){
        return this.ano * 52;
    }
    public int converterDias(){
        return this.ano*365;
    }
    public String converterTudo(){
        return this.ano+" ano(s) tem "+this.converterMeses()+" meses, "+this.converterSemanas()+" semanas e "+this.converterDias()+" dias";
    }
    
}
