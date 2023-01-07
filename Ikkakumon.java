package digimon;

public class Ikkakumon{
    private Gomamon gmn;
    /*
lien a-un, pas d'autres précisions.
    */
    public Ikkakumon(int energieMax, long pointsMax){
	gmn=new Gomamon(energieMax, pointsMax);
    }
    /*
constructeur qui va forcément initialiser gmn
    */

    /*
après instaciation, on dispose de cet attribut qui potentiellement peut etre modifie, qu'est ce qu'on fera ?
=>on reprend ses méthodes avec le respect des règles d'appel du lien a-un.
    */
    private void blessure(int nb){
	gmn.blessure(nb);
    }
    public int griffes(){
	return gmn.griffes()+gmn.griffes();
    }
}
