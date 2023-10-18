public class Calendario {
    private int ano;
    private int mes;
    private int dia;

    public Calendario() {
    }

    public Calendario(int ano, int mes, int dia) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void exibirData() {
        System.out.println("Data: " + dia + "/" + mes + "/" + ano);
    }

    public static void main(String[] args) {
        Calendario hoje = new Calendario(2023, 10, 17);
        hoje.exibirData();
    }
}

