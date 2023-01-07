public class exo4_1 extends exo4{
    public void bondir(){
	System.out.println("Youpi");
    }
    public void faireUneRoulade(){
	System.out.println("Hop");
    }

    public void jouer(){
	super.applaudir();
	this.bondir();
	this.faireUneRoulade();
	super.applaudir();
    }
}
