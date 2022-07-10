public class Triangle extends Figure {
    int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getArea(){
        double p=(a+b+c)/2;
        double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }
    public double getPerimetr(){
        int P= a+b+c;
        return P;
    }

}
