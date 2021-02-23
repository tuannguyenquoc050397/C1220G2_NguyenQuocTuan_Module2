package _06_inheritance.baitap.lop_point_lop_movablepoint;

 class Point {
    private float x;
    private float y;

    public Point() {
    }

    public Point(float x, float y) {
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
