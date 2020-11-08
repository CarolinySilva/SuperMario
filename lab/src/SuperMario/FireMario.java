package SuperMario;

public class FireMario implements MarioState{

    @Override
    public MarioState pegarCogumelo() {
        System.out.println("+ 1000 pontos");
        return this;
    }

    @Override
    public MarioState levarDano() {
        System.out.println("Mario Grande");
        return new BigMario();
    }

    @Override
    public MarioState pegarFlor() {
        System.out.println("+ 1000 pontos");
        return this;
    }

}