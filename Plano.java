class Plano{
	private Circulo forms[];
	
	public Plano(int n){
		this.forms = new Circulo[n];
		int i;
		for(i = 0 ; i < forms.length; i++){
			this.forms[i] =  new Circulo();
		}
	}
	public void remove(Circulo c){
		int i;
		for(i = 0 ; i < forms.length ; i++){
			if(this.forms[i].getRaio() == c.getRaio() && this.forms[i].getP().getX() == c.getP().getX() && this.forms[i].getP().getY() == c.getP().getY() ){
				this.forms[i].setRaio(0); 
				this.forms[i].getP().setX(0);
				this.forms[i].getP().setY(0);
			}
		}
	}
	public void adiciona(Circulo c){
		int i;	
		for(i=0; i < forms.length; i++){
			if( this.forms[i].getRaio() == 0 &&  this.forms[i].getP().getX() == 0 && this.forms[i].getP().getY() == 0 ){
				this.forms[i] = c;
				break;
			}
		}
	}
	public boolean possui(Circulo c){
		int i;
		for(i = 0 ; i < forms.length ; i++){
			if(this.forms[i].getRaio() == c.getRaio() && this.forms[i].getP().getX() == c.getP().getX() && this.forms[i].getP().getY() == c.getP().getY() ){
				return true;
			}
		}
		return false;
	}
	
	public void imprime(){
		int i;
		for( i=0 ; i < forms.length ; i++){
				System.out.println("\nCirculo "+ i +"\nRAIO = "+this.forms[i].getRaio()+"\nX = "+ this.forms[i].getP().getX()+"\nY ="+ this.forms[i].getP().getY());	
		}	
	}
}