public class Rectangle {
    private double length;
    private double width;

    public Rectangle (double Width, double length){
        this.length = (Width < 0)? 0 : Width;
        this.width = (length < 0)? 0 : length;
    }

    public double getWidth (){
        return width;
    }

    public double getLength (){
        return length;
    }

    public double getArea (){
        return width * length;
    }
}
