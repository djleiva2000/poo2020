package deber_seleccion;

public class Numero_mayor {
   private int num1;
   private int num2;
    private int num3;
    private int num4;
   private int num_mayor;

    /**
     * Metodo constructor
     * @param num1
     * @param num2
     * @param num3
     * @param num4
     */
    public Numero_mayor(int num1,int num2,int num3,int num4){
        this.setNum1(num1);
        this.setNum2(num2);
        this.setNum3(num3);
        this.setNum4(num4);
    }

    /**
     * metodo para obtener num1
     * @return
     */
    public int getNum1() {
        return num1;
    }
    /**
     * metodo para actualizar num1
     * @return
     */
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    /**
     * metodo para obtener num2
     * @return
     */
    public int getNum2() {
        return num2;
    }
    /**
     * metodo para actualizar num2
     * @return
     */
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    /**
     * metodo para obtener num3
     * @return
     */
    public int getNum3() {
        return num3;
    }
    /**
     * metodo para actualizar num3
     * @return
     */
    public void setNum3(int num3) {
        this.num3 = num3;
    }
    /**
     * metodo para obtener num4
     * @return
     */
    public int getNum4() {
        return num4;
    }
    /**
     * metodo para actualizar num4
     * @return
     */
    public void setNum4(int num4) {
        this.num4 = num4;
    }
    /**
     * metodo para obtener numero mayor
     * @return
     */
    public int getNum_mayor() {
        return num_mayor;
    }
    /**
     * metodo para actualizar numero mayor
     * @return
     */
    public void setNum_mayor(int num_mayor) {
        this.num_mayor = num_mayor;
    }

    /**
     * Método para calcular cual es el numero mayor
     */
    public void Calcular() {
        if ((num1 > num2) && (num1 > num3) && (num1 > num4)) {
            num_mayor = num1;
        } else {
            if ((num2 > num3) && (num2 > num4)) {
                num_mayor = num2;
            } else {
                if (num3 > num4) {
                    num_mayor = num3;
                } else {
                    num_mayor = num4;
                }
            }
        }
    }
    /**
     * Método  para obtener el numero mayorz
     * @return
     */
    public int Obtener_mayor(){
        return num_mayor;
    }
}
