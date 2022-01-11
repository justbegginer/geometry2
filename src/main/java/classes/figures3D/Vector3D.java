package classes.figures3D;

import classes.figuresAbstract.Vector;

import java.util.Objects;

public class Vector3D extends Vector{
    private double z;
    public Vector3D(double x, double y, double z) {
        super(x, y);
        this.z += z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
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

    public String relation(Vector3D another){
        String resultFor2DVersion = super.relation(another);
        if (Objects.equals(resultFor2DVersion, "co-directional") && this.getZ() == another.getZ()){
            return resultFor2DVersion;
        }
        else if (Objects.equals(resultFor2DVersion, "oppositely-directional") && this.getZ() == -another.getZ()){
            return resultFor2DVersion;
        }
        else{
            return "have no relation";
        }
    }

    public boolean equal(Vector3D another){
        return super.equal(another) && this.z == z;
    }

    public double length(){
        return Math.sqrt(x*x + y*y + z*z);
    }

    @Override
    public String toString() {
        return "Vector3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
