public class Humano extends Personaje{

    protected Arma arma;

    public Humano (String nombre,int fuerza,int velocidad,int vida, Arma arma)
    {
        super(nombre,fuerza,velocidad,vida);
        this.arma = arma;
    }

    public Humano (){

    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override public int getAttackValue(){
        int attack = ((fuerza*velocidad)+(arma.daño-arma.peso));
        return attack;
    }





}
