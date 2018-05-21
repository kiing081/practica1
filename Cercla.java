public class Cercle {
    private float x;
    private float y;
    /constructor buit*/
    public Cercle(){

    }

      /constructor per parametres/
   public Cercle(float x, float y){
    this.x= x;
    this.y=y;
}

/**constructor copiador/
    public Cercle(Cercle Cercle){
        this.x= Cercle.x;
        this.y= Cercle.y;
    }

      public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Cercle{" + "x=" + x + ", y=" + y + '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cercle other = (Cercle) obj;
        if (Float.floatToIntBits(this.x) != Float.floatToIntBits(other.x)) {
            return false;
        }
        if (Float.floatToIntBits(this.y) != Float.floatToIntBits(other.y)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Float.floatToIntBits(this.x);
        hash = 53 * hash + Float.floatToIntBits(this.y);
        return hash;
    }
 }
