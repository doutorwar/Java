package com.mycompany.rangers;

import java.awt.Component;
import javax.swing.JOptionPane;

public class RangerVermelho extends PowerRangers {
    
    @Override
    public void morfar() {
        this.setCor("Vermelho");
        this.setArmamento("Faca");
        this.setZord("Rex");
    }
    
    @Override
    public String chamarZord() {
        Component nulll = null;
        JOptionPane.showMessageDialog(nulll, this.getZord());
        return this.getZord();
    }
}