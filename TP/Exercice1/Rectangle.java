class Rectangle {

    public Point  lePoint;
    public float  Longueur_1;
    public float  Longueur_2;
    public float  largeur_1;
    public float  largeur_2;

    public Rectangle(Point a, Point b){
        float L;
        float l;
        this.lePoint=a;
        L=Math.abs(a.x - b.x);
        l=Math.abs(a.y - b.y);
        this.Longueur_1 = L;
        this.largeur_1  = l; 
        this.Longueur_2 = L;
        this.largeur_2  = l; 
    }

    public Rectangle(Point a,float long1,float larg1,float long2,float larg2){

        this.lePoint=a;
        this.Longueur_1 = long1;
        this.largeur_1  = larg1; 
        this.Longueur_2 = long2;
        this.largeur_2  = larg2; 
    }

    public Rectangle(Point a,float longg,float largg){

        this.lePoint=a;
        this.Longueur_1 = longg;
        this.largeur_1  = largg; 
        this.Longueur_2 = longg;
        this.largeur_2  = largg; 
    }
    // Fin des Constructeurs du rectangle

} 