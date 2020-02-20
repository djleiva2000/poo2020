package arregloPOO;

public class Array {
    private int[] vectorA = new int [10];
    private int[] vectorB = new int [10];
    private int sumatoria;

    public Array(int[] vectorA, int[] vectorB){
       this.vectorA=vectorA;
       this.vectorB=vectorA;

    }

    public int[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(int[] vectorA) {
        this.vectorA = vectorA;
    }

    public int[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(int[] vectorB) {
        this.vectorB = vectorB;
    }

    public int getSumatoria() {
        return sumatoria;
    }

    public void setSumatoria(int sumatoria) {
        this.sumatoria = sumatoria;
    }

    public int total(int vectorA[],int vectorB[]){
        sumatoria=0;
        for (int i = 0; i < vectorA.length; i++) {
            sumatoria=(vectorA[i] * vectorB[i])+sumatoria;




        }
return sumatoria;
    }

}
