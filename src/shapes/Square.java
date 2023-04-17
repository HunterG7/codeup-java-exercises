package shapes;

public class Square extends Rectangle{

    protected int sideLength;

    public Square(int sideLength) {
        super(sideLength, sideLength);
        this.sideLength = sideLength;
    }

    public int getArea(){
        return sideLength * sideLength;
    }

    public int getPerimeter(){
        return 4 * sideLength;
    }

}
