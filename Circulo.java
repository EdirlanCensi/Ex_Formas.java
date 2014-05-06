class Circulo{
	private int raio;
	private Posicao p;

	public Circulo(){
		this.raio = 0;
		p = new Posicao();
		this.p.setX(0);
		this.p.setY(0);
	}
	
	public int getRaio(){
		return this.raio;
	}
	public void setRaio(int r){
		this.raio = r;
	}

	public Posicao getP(){
		return this.p;
	}
	public void setP(Posicao pos){
		this.p = pos; 
	}
	
		
}