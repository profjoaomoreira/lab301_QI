
public class Conversor {

    private int ano;

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return this.ano;
    }

    public int corverterMeses() {
        return this.ano * 12;
    }

    public int convereterSemanas() {
        return this.ano * 52;
    }

    public int convereterDias() {
        return this.ano * 365;
    }

    public String mostrarTodos() {
        return this.ano + " ano(s) tem " + this.corverterMeses() + " meses, " + this.convereterSemanas() + " semanas e " + this.convereterDias() + " dias";
    }

}
