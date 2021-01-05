/**
 *It finds the time for low battery and return the results in hours and minutes
 * @author busso
 * @version 1
 */
public class funzione {
    /**
     * It finds the time for low battery dividing the capacity of the battery for the consumption
     * @param cap battery capacity
     * @param con battery consumption
     * @return time for low battery
     */
    public double scarica(double cap, double con){
        /**
         * It divides the capacity for the consumption to find the time for low battery
         */
        double lt=cap/con;
        /** 
         * Finally return the time for low battery but in form of decimals number and not in hours and minutes
         */
        return lt;
    }
    /**
     * it transform decimals number to minutes
     * @param ltm it is the variable of the time but not expressed in hours and minutes
     * @return the time for low battery only for the minutes and not the hour
     */
    public int FDTM(double ltm){
        /**
         * Represent the minutes time
         */
         int hm;
         /**
          * cast time in int
          */
         hm=(int) ltm;
         /**
          * subtract the time in int with the decimal's one to find only the decimal
          */
         ltm=hm-ltm;
         /**
          * Times the decimal number with 60 to finally find the minutes 
         */
         ltm=ltm*60;
         /**
          * Then cast it to int
          */
         hm=(int) ltm;
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
     * @param lth it is the variable of the time but not expressed in hours and minutes
     * @return the time for low battery only for the hours and not for minutes
     */
    public int FDTH(double lth){
        /**
         * Represents the time in hour
         */
        int ht;
        /**
         * cast time to int for putting away decimals number and so to find the number of hours
         */
        ht=(int) lth;
        return ht;
    }
}
