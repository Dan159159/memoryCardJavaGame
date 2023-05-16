import javax.swing.*;

public class Emparejar {
    // Declaracionde varibles
    private int numBtn;
    private JButton btn;
    private int valor;
    public Emparejar(){

    }
    // Contructor
    public Emparejar(int numBtn, JButton btn, int valor) {
        this.numBtn = numBtn;
        this.btn = btn;
        this.valor = valor;
    }

    //Setter and Getter
    public int getNumBtn() {
        return numBtn;
    }

    public void setNumBtn(int numBtn) {
        this.numBtn = numBtn;
    }

    public JButton getBtn() {
        return btn;
    }

    public void setBtn(JButton btn) {
        this.btn = btn;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String toString(){
        return "Emparejar numeroBoton: "+numBtn+" boton "+btn+" con el valor "+valor;
    }
}
