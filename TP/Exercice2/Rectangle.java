class Rectangle {

    public  Point  pointBase;
    private float  Longueur_1;
    private float  Longueur_2;
    private float  largeur_1;
    private float  largeur_2;

    public Rectangle(Point a, Point b){
        float L;
        float l;
        this.pointBase=a;
        L=Math.abs(a.x - b.x);
        l=Math.abs(a.y - b.y);
        this.Longueur_1 = L;
        this.largeur_1  = l; 
        this.Longueur_2 = L;
        this.largeur_2  = l; 
    }

    public Rectangle(Point a,float long1,float larg1,float long2,float larg2){

        this.pointBase=a;
        this.Longueur_1 = long1;
        this.largeur_1  = larg1; 
        this.Longueur_2 = long2;
        this.largeur_2  = larg2; 
    }

    public Rectangle(Point a,float longg,float largg){

        this.pointBase=a;
        this.Longueur_1 = longg;
        this.largeur_1  = largg; 
        this.Longueur_2 = longg;
        this.largeur_2  = largg; 
    }
    // Fin des Constructeurs du rectangle


    // Debut methode

    public float Surface()
    {
        float surface=0;
        surface = this.Longueur_1 * this.largeur_1;
        return surface;
    }

    public void Deplace(float x , float y)// coordonnées du point finale de translation
    {
        this.pointBase.x += x;
        this.pointBase.y += y;
        //si plusieurs rectangles partagent le même point.Alors tous ces rectangles subiront la mème translation
    }
    
} 