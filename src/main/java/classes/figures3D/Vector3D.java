package classes.figures3D;

import classes.figuresAbstract.Vector;

public class Vector3D extends Vector{
    private double z;
    public Vector3D(double x, double y, double z) {
        super(x, y);
        this.z += z;
    }

    public void sum(Vector3D another){
        super.sum(another);
        this.z += another.z;
    }
    public void minus(Vector3D another){
        super.minus(another);
        this.z -= another.z;
    }

    public void inverse(Vector3D another){
        super.inverse();
        this.z = -another.z;
    }
    public double dot(Vector3D another){
        return super.dot(another) + z*another.z;
    }

    public boolean equal(Vector3D another){
        return super.equal(another) && this.z == z;
    }

    public double length(){
        return Math.sqrt(x*x + y*y + z*z);
    }

}
