package be.inecbrussel.geometry;

public interface Scaleable {
    int QUARTER=25;
    int HALF=50;
    int DOUBLE=200;

    void scale (int s);
    void scaleDouble();
    void scaleHalf();

}
