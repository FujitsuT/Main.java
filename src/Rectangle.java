public class Rectangle extends Figure {
    int k,i;

    public Rectangle(int i, int k) {
        this.k = k;
        this.i = i;
    }
    public double getArea(){
        return i*k;
    }
    public double getPerimetr(){
        return (k+i)*2;
    }
}
