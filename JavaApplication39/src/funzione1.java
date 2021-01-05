/**
 *It finds the charging time timing the capacity with the efficiency of the battery and then dividing them by the current from which consumption was subtracted
 * @author busso
 * @version 1
 */
public class funzione1 {
    /**
     * It finds the charging time timing the capacity with the efficiency of the battery and then dividing them by the current from which consumption was subtracted
     * @param capacità battery capacity
     * @param efficienza battery efficiency
     * @param corrente battery current
     * @param consumo battery consumption
     * @param tcarica battery charging time
     * @return charging time of the battery
     */
    public double carica(double capacità,double efficienza, double corrente, double consumo, double tcarica){
        /**
         * It times capacity and efficiency and then divides them by the current from which consumption was subtracted
         */
        tcarica=(capacità*efficienza)/(corrente-consumo);
        /**
         * It 
         */
        tcarica=Math.abs(tcarica);
        /** 
         * Finally make the absolute value of it because maybe the consumption could be major than the current 
         */
        return tcarica;
    }
    /**
     * it transform decimals number to minutes
     * @param tcar it is the variable of the time but not expressed in hours and minutes
     * @return the charging time only for the minutes and not the hour
     */
    public int FDTM(double tcar){
        /**
         * Represent the minutes time
         */
         int hm;
         /**
          * cast time in int
          */
         hm=(int) tcar;
         /**
          * subtract the time in int with the decimal's one to find only the decimal
          */
         tcar=hm-tcar;
         /**
          * Times the decimal number with 60 to finally find the minutes 
         */
         tcar=tcar*60;
         /**
          * Then cast it to int
          */
         hm=(int) tcar;
         /**
          * Finally make the absolute value of it because if it makes a negative approximation
          */
         hm=Math.abs((int) hm);
         /**
          * return minutes
          */
         return hm;
    }
    /**
     * it return the hours without the minutes
     * @param tcar it is the variable of the time but not expressed in hours and minutes
     * @return the charging time only for the hours and not for minutes
     */
    public int FDTH(double tcar){
        /**
         * Represents the time in hour
         */
        int ht;
        /**
         * cast time to int for putting away decimals number and so to find the number of hours
         */
        ht=(int) tcar;
        
        ht=Math.abs((int) ht);
        return ht;
    }
}
