package com.company;

public class Main {

    public static void main(String[] args) {
	Point2D point2D=new Point2D(2,3);
        System.out.println(point2D);
        Point3D point3D=new Point3D(1,2,3);
        System.out.println(point3D);
        point3D.setXYZ(2,5,6);

    }
}
