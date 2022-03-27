package com.company;

public class Point3D  extends Point2D  {
    private float z=0.0f;

    public Point3D(){}

    public Point3D(float z){
        this.z=z;
    }

    public Point3D(float x,float y,float z){
        super(x,y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        float[] float2=new float[3];
        float2[0]=getX();
        float2[1]=getY();
        float2[2]=this.z;
        return float2;
    }

    public void setXYZ(float x,float y,float z){
        setXY(x,y);
        this.z=z;
    }

    @Override
    public String toString() {
        return "Point3D has " +super.toString()+" and"+
                "z=" + z ;
    }

}
