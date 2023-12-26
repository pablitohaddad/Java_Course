package model.entities;

import model.enums.Color;

public abstract class AbstractShape implements Shape{ // pois a área é implementada por Rect e Circle, pois isso essa classe é abstrata

    private Color color;

    public AbstractShape(){

    }

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


}
