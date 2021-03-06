package classes.figuresAbstract;

public abstract class Vector extends Point{
    protected Vector(double x, double y) {
        super(x, y);
    }

    protected void sum(Vector anotherVector){
        this.x += anotherVector.x;
        this.y += anotherVector.y;
    }

    protected void minus(Vector anotherVector){
        this.x -= anotherVector.x;
        this.y -= anotherVector.y;
    }

    public void inverse(){
        this.x = -this.x;
        this.y = -this.y;
    }

    protected double dot(Vector anotherVector){
        return this.x*anotherVector.x + this.y*anotherVector.y;
    }

    protected String relation(Vector anotherVector) {
        if (this.equal(anotherVector)){
            return "co-directional";
        }
        else if(this.x == -anotherVector.x && this.y == -anotherVector.y){
            return "oppositely-directional";
        }
        else{
            return "have no relation";
        }
    }

    protected boolean equal(Vector anotherVector){
        return super.equals(anotherVector);
    }

    protected double length(){
        return  super.length();
    }
}
