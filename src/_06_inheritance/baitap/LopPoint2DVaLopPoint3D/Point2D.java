package _06_inheritance.baitap.LopPoint2DVaLopPoint3D;

 class Point2D {
    private float x;
    private float y;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float arr1[]={this.x,this.y};
        return arr1;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
}
