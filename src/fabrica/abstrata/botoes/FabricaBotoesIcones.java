/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabrica.abstrata.botoes;

import javax.swing.JButton;
import fabrica.abstrata.botoes.ButtonOK;
import fabrica.abstrata.botoes.ButtonCancel;

/**
 *
 * @author Vinicius Corte
 */
public class FabricaBotoesIcones extends FabricaAbstrataBotoes {
    
    @Override
    public JButton criaBotaoOK() {
        return new ButtonOK();
    }
    @Override
    public JButton criaBotaoCancel() {
        return new ButtonCancel();
    }
}
