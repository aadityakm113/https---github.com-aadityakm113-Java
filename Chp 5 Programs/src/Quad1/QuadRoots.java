package Quad1;

public interface QuadRoots {
    default float calculateDeterminant(int a, int b, int c){
        return b*b - 4*a*c;
    }
	void calculateRoots(float d, int a, int c);
}
