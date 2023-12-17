package com.mycompany.rangers;

public abstract class PowerRangers {
    
    private String cor;
    private String armamento;
    private String zord;
    
    public abstract void morfar();
    public abstract String chamarZord();
    
    public void setCor(String x){
    
        this.cor = x;
    }
    
    public void setArmamento(String x) {
        this.armamento = x;
    }
    
    public void setZord(String x) {
        this.zord = x;
    }

    public String getCor() {
        return cor;
    }

    public String getArmamento() {
        return armamento;
    }

    public String getZord() {
        return zord;
    }
}
