package digimon;

public class Ikkakumon2 extends Gomamon{
    /*
On démarre tjrs par le constructeur !
    */
    public Ikkakumon2(int energieMax, long pointsMax){
	super(energieMax,pointsMax);
	//pas de retour si pas de retour dans l'origine.
    }

    /* 
et on passe ensuite aux méthodes qui changent, qui vont être ajoutés,etc...
    */
    
    public int griffes(){
	return super.griffes()+super.griffes();
    }
}
    
    
    
