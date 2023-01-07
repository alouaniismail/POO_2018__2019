package digimon;

public class Gomamon{
    private long pointsDeVie;
    private int energie;
    final int ENERGIE_MAX;
    final long POINT_MAX;
    /*
final au constructeur et point.
aucune modification ultèrieur n'est possible.
    */
    public Gomamon(int energieMax, long pointsMax){
	ENERGIE_MAX=energie=energieMax;
	POINT_MAX=pointsDeVie=pointsMax;
    }
    public void blessure(int nb){
	pointsDeVie-=(nb/energie);
    }
    public int griffes(){
	int blessureInfligee=(int)pointsDeVie/10;
	energie-=blessureInfligee;
	return blessureInfligee;
    }
    /*
espace de stockage pour l'objet instancié puis appelle le constructeur 
pour initialiser ses attributs.
    */
}
