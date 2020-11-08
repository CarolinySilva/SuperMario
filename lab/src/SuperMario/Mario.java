package SuperMario;
	
public class Mario {

	protected MarioState estado;
	protected long pontuacao;	

	public Mario(){
		this.estado = new LittleMario();
	}

	public void pegarCogumelo(){
		if(this.estado instanceof BigMario || this.estado instanceof FireMario){
			this.pontuacao += 1000;
		}
		estado = estado.pegarCogumelo();
	}

	public void pegarFlor(){
		if(this.estado instanceof FireMario){
			this.pontuacao += 1000;
		}
		estado = estado.pegarFlor();
	}

	public void levarDano(){
		estado = estado.levarDano();
	}

	public long getPontuacao() {
		return pontuacao;
	}
}