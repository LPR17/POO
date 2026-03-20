package Avion;

public class Ala {
    private double envergaduraEnMetros;
    private String color;
    private String material;
    private boolean estadoFlap;

    /*Constructor del Ala*/
    public Ala(double envergaduraEnMetros, String color, String material) {
        this.envergaduraEnMetros = envergaduraEnMetros;
        this.color = color;
        this.material = material;
        estadoFlap = false;
    }

    public void extenderFlap(){
        estadoFlap = true;
    }

    public void retraerFlap(){
        estadoFlap = false;
    }

    public double getEnvergadura(){
        return envergaduraEnMetros;
    }

    public String getColor(){
        return color;
    }

    public String getMaterial(){
        return material;
    }

    public boolean isFlapExtendido(){
        return estadoFlap;
    }

    @Override
    public String toString(){
        return "Ala {" +
                "envergadura = '" + envergaduraEnMetros + "' - "+
                " color = '"+ color + "' - "+
                " tipo de Material= '" + material +  "' - " +
                " flap Extendido = '" + estadoFlap + "' "+
                "}";
    }

}
