public abstract class Personaje {

    protected String nombre;
    protected int fuerza;
    protected int velocidad;
    protected int vida;

    public Personaje (String nombre, int fuerza, int velocidad,int vida)
    {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.vida = vida;
    }

    public Personaje(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAttackValue(){
        int value=0;
        return value;
    }

    protected abstract Arma getArma();

    protected abstract void setArma(Arma arma);

}
