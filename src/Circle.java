public class Circle extends Figure{
    int R;
    public Circle (int R){
        this.R=R;
    }
    public double getArea(){
        return 2*Math.PI*Math.abs(R);
    }
    public double getPerimetr(){
        return 2*Math.PI*R;
    }
}
