class Rectangle {

    public Point  pointBase;
    public float  Longueur_1;
    public float  Longueur_2;
    public float  largeur_1;
    public float  largeur_2;

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

    
    //--------------------------------------- Debut des methodes

    //Methode surface
    public float Surface()
    {
        float surface=0;
        surface = this.Longueur_1 * this.largeur_1;
        return surface;
    }


    //Methode Translate
    public void Translate(float x , float y)// coordonnées du point finale de translation
    {
        this.pointBase.x += x;
        this.pointBase.y += y;
        // Note:si plusieurs rectangles partagent le même point.Alors tous ces rectangles subiront la mème translation
    }


    //Methode contain pour verfication de point
    public void contain(Point A)
    {
        float a;
        float b;
        if( (A.x > pointBase.x) && (A.y > pointBase.y))
        { 
            a= this.pointBase.x+this.Longueur_1;
            b= this.pointBase.y+this.largeur_1;
            if ( (a>A.x) && (b > A.y) )
            {
                System.out.println("Le point  est a l'interieur du rectangle");
            }
            else
            {
                System.out.println("Le point n'est pas a l'interieur du rectangle"); 
            }
            
        }
        else
        {
           System.out.println("Le rectangle  n'est pas a l'interieur");  
        }
    }  

    //Methode contain pour verfication de rectangle
    public void contain(Rectangle A)
    {
        float a;
        float b;
        float c;
        float d;
        if( (A.pointBase.x > this.pointBase.x) && (A.pointBase.y > this.pointBase.y))
        { 
            a= this.pointBase.x+this.Longueur_1;
            b= this.pointBase.y+this.largeur_1;
            c= A.pointBase.x + A.Longueur_1;
            d= A.pointBase.y + A.largeur_1;

            if ( (c<a) && (d<b) )
            {
                System.out.println("Le rectangle  est a l'interieur");
            }
            else
            {
                System.out.println("Le rectangle  n'est pas a l'interieur"); 
            }
            
        }
        else
        {
           System.out.println("Le rectangle  n'est pas a l'interieur");  
        }
    }  
    

   // Methode sameAS
    public void sameAS(Rectangle A,Rectangle B)
    {
        if(A.Longueur_1 == B.Longueur_1)
        {
             if (A.largeur_1 == B.largeur_1)
             {
                 System.out.println("Les deux rectangles  egaux"); 
             }
             else{
                 System.out.println("Les deux rectangles ne sont pas  egaux");
             }
        }
        else
        {
             System.out.println("Les deux rectangles ne sont pas  egaux");
        }
    }
    

} 