package visao;

import javax.swing.JFrame;
import modelo.Tabuleiro;

/**
 *
 * @author Emerson Soares
 */
public class TelaPrincipal extends JFrame {

   
    public TelaPrincipal() {
        Tabuleiro tabuleiro = new Tabuleiro(13, 20, 25);
        add(new PainelTabuleiro(tabuleiro));

        setTitle("Campo Minado - do Mano");
        setSize(690, 438);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new TelaPrincipal();
    }
}
