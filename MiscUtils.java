import java.util.ArrayList;

public class MiscUtils {
    
    /*******************************************************************/
    /*                                                                 */
    /*                            FindAvgs                             */
    /*                                                                 */
    /*******************************************************************/
    
    public static double FindAvgs(ArrayList<Double> a) {
        
        ArrayList<Double> b = a;
        
        double Avg = 0;
        
        for(int i = 0; i < b.size(); i++) {
          
          Avg = (Avg + b.get(i));
      }//end for
      
      Avg = (Avg / b.size());
        
        return Avg;
    }//end FindAvgs
    
    /*******************************************************************/
    /*                                                                 */
    /*                           FindSTDDev                            */
    /*                                                                 */
    /*******************************************************************/
    
    public static double FindSTDDev(ArrayList<Double> a) {
        
        double masterMean = 0;
        double STD = 0;
        
        double Avg = 0;
        
        ArrayList<Double> b = a;
        
        for(int i = 0; i < b.size(); i++) {
          
          Avg = (Avg + b.get(i));
      }//end for
      
      Avg = (Avg / b.size());
        
        for(int i = 0; i < b.size(); i++) {
          
          masterMean = (masterMean + Math.pow((b.get(i) - Avg), 2) / b.size());
      }//end for
      
       STD = Math.sqrt(masterMean);
      
      return STD;
    }//end FindSTDDev
}//end MiscUtil