package org.example;

import java.util.List;

public class Mixta implements Topografia {

    private List<Topografia> topografias;

    public Mixta(List<Topografia> topografias){
        this.topografias = topografias;
    }

    @Override
    public double calcularProporcionAgua() {
        double proporcion = this.topografias.stream()
                .mapToDouble(Topografia::calcularProporcionAgua)
                .sum();
        return proporcion/4;
    }

    @Override
    public double calcularProporcionTierra() {
        double proporcion = this.topografias.stream()
                .mapToDouble(Topografia::calcularProporcionTierra)
                .sum();
        return proporcion/4;
    }

    @Override
    public boolean compararTopografias(Topografia topografia) {
        if (topografia instanceof Mixta) {
            return this.calcularProporcionTierra() == topografia.calcularProporcionTierra()
                    && this.calcularProporcionAgua() == topografia.calcularProporcionAgua();
        }
        return false;
    }

    public List<Topografia> getTopografias() {
        return topografias;
    }

    
    
    
    
    
    
    
    
    