package oficinamecanica;

import oficinamecanica.telas.TelaPrincipal;

/**
 * @author Aline Ramos
 */
public class App {
    private static Sistema sys = new Sistema("Oficina");
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        TelaPrincipal tela = new TelaPrincipal();
        sys.addCliente("Joao", 123192, 12, 4, 1992);
        sys.addCliente("Ana", 34235, 12, 4, 1992);
        String[] k= {"A",",",","};
        for(int i=0;i<sys.getArrClientes().size();i++){
            k[i]="a";
        }
        tela.setVisible(true);
    }
}