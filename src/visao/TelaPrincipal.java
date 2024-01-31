package visao;

import javax.swing.JFrame;
import modelo.Tabuleiro;

/**
 *
 * @author Emerson Soares
 */
public class TelaPrincipal extends JFrame {

    public TelaPrincipal() {
        Tabuleiro tabuleiro = new Tabuleiro(13, 13, 25);
        add(new PainelTabuleiro(tabuleiro));
        setTitle("Campo Minado");
        setSize(690, 438);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new TelaPrincipal();
    }
}
