package _06_inheritance.baitap.LopPoint2DVaLopPoint3D;

class Point3D extends Point2D {
    private float z;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXY(){
        float arr2[]={super.getX(),super.getY(),this.z};
        return arr2;
    }
    public void setXYZ(float x,float y, float z){
        super.setXY(x,y);
        this.z=z;
    }
    @Override
    public String toString(){
        return "("+super.getX()+","+super.getY()+","+this.z+")";
    }
}
