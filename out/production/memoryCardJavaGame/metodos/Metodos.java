package metodos;

import frame.Pantalla;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Metodos {
    private List<Emparejar> pareja = new ArrayList<>();
    private List<Emparejar> parejaEncontrada = new ArrayList<>();

    // Cargar numers aleatorios en la fila
    public static List<Integer> filaTabla() {
        List<Integer> lista = new ArrayList<>();
        Random r = new Random();
        int aumentar = 1;
        for (int i = 0; i < aumentar; i++) {
            if (lista.size() != 4) {
                aumentar++;
            }
            int valor = r.nextInt(5);
            if (!lista.contains(valor) && lista.size() != 5 && valor != 0) {
                lista.add(valor);
            }

        }
        return lista;
    }

    // Ingresar las dos filas
    public static List<Integer> filasTablaAll() {
        List<Integer> all = new ArrayList<>();
        all.addAll(filaTabla());
        all.addAll(filaTabla());
        return all;
    }
    // Ingresar imagen
    public void ingresarImg(JButton btn, int valor){
        try{
            btn.setIcon(new ImageIcon(getClass().getResource("/Images/0"+ valor +".png")));
            btn.setHorizontalAlignment(SwingConstants.CENTER);
            btn.setVerticalAlignment(SwingConstants.CENTER);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
    // Inicializar la imagen
    public void  startImage(){
        ingresarImg(Pantalla.btn01,9);
        ingresarImg(Pantalla.btn02,9);
        ingresarImg(Pantalla.btn03,9);
        ingresarImg(Pantalla.btn04,9);
        ingresarImg(Pantalla.btn05,9);
        ingresarImg(Pantalla.btn06,9);
        ingresarImg(Pantalla.btn07,9);
        ingresarImg(Pantalla.btn08,9);
    }
    // Dos valores iguales
    public void emparejado(){
        System.out.println(getPareja().size());
        if (getPareja().size() == 1){
            ingresarImg(getPareja().get(0).getBtn(), getPareja().get(0).getValor());
        }else if(getPareja().size()==2){
            ingresarImg(getPareja().get(1).getBtn(), getPareja().get(1).getValor());
        }
    }
    // Imagenes emparejadas
    public void imgStartEmparejar(){
        if(parejaEncontrada.size()==8){
            JOptionPane.showMessageDialog(null, "VICTORIA!!!!");

            for (int i = 0; i < parejaEncontrada.size(); i++){
                ingresarImg(parejaEncontrada.get(i).getBtn(), parejaEncontrada.get(i).getValor());
                parejaEncontrada.get(i).getBtn().setEnabled(true);
            }
            parejaEncontrada.clear();
            startImage();
        }
        for (int i = 0; i<parejaEncontrada.size();i++) {
            System.out.println(parejaEncontrada.get(i).getNumBtn()+" - "+parejaEncontrada.get(i).getValor());
            ingresarImg(parejaEncontrada.get(i).getBtn(), parejaEncontrada.get(i).getValor());
            parejaEncontrada.get(i).getBtn().setEnabled(false);
        }
    }
    // Controlar la ejecuacion
    public void reset(){
        startImage();
        imgStartEmparejar();
    }
    // Emparejar
    public void emparejar(){
        if (getPareja().size() == 2){
            if (getPareja().get(0).getNumBtn() != 0 && getPareja().get(1).getNumBtn() !=0){
                if (getPareja().get(0).getValor() == getPareja().get(1).getValor()) {
                    parejaEncontrada.add(getPareja().get(0));
                    parejaEncontrada.add(getPareja().get(1));
                    getPareja().clear();
                    reset();
                }else {
                    Runnable mx = new Runnable() {
                        @Override
                        public void run() {
                            getPareja().clear();
                            reset();
                        }
                    };
                    setTimeout(mx, 200);
                }
            }
        }
    }
    public void setTimeout( Runnable runnable, int delay) {
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                runnable.run();
            } catch (Exception e) {
                System.err.println();
            }
        }).start();
    }
    public List<Emparejar> getPareja() {
        return pareja;
    }
}