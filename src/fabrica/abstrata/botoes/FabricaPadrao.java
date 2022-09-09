/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabrica.abstrata.botoes;

import javax.swing.JButton;

/**
 *
 * @author Vinicius Corte
 */
public class FabricaPadrao extends FabricaAbstrataBotoes {
    
    @Override
    public JButton criaBotaoOK () {
        JButton ok = new JButton();
        ok.setText("Ok");
        return ok;
    }
    @Override
    public JButton criaBotaoCancel() {
        JButton cancel = new JButton();
        cancel.setText("Cancel");
        return cancel;
    }
}
