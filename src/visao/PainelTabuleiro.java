package visao;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import modelo.BotaoCampo;
import modelo.Tabuleiro;

/**
 *
 * @author emers
 */
public class PainelTabuleiro extends JPanel{
    
    public PainelTabuleiro(Tabuleiro tabuleiro){
        setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
        tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
        tabuleiro.registrarObservador(e -> {
          // TODO Mostrar resultado para o usuario
        });
        
    }
    
}
