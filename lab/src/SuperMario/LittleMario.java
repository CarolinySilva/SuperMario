package SuperMario;

public class LittleMario implements MarioState{

    @Override
    public MarioState pegarCogumelo() {
        System.out.println("Mario Grande");
        return new BigMario();
    }

    @Override
    public MarioState levarDano() {
       return null;
    }

    @Override
    public MarioState pegarFlor() {
        System.out.println("Mario com Fogo");
        return new FireMario();
    }

}