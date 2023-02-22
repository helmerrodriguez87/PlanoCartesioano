public class PlanoUbicacion {

    private int x = 0;
    private  int y = 0;

    public PlanoUbicacion() {
    }

    public PlanoUbicacion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "PlanoUbicacion{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int arriba (int x, int y){


    }

    public  int abajo (int x, int y){

    }

    public  int izquierda( int x, int y){

    }

    public  int derecha (int x, int y){


    }


}

