
public class GeoSolid {
   
    private final int CYLINDER = 0;
    private final int RECTANGULAR_PRISM = 1;
    private final int solidType;
    private double height;
    private double radius;
    private double width;
    private double length;
    private double volume;
    private double surfaceArea;
   
    /*******************************************************************/
    /*                                                                 */
    /*                           Constructor                           */
    /*                                                                 */
    /*******************************************************************/
   
    public GeoSolid(double inputHeightUpper, double inputHeightLower, double inputRadiusUpper, double inputRadiusLower, double inputWidthUpper, double inputWidthLower, double inputLengthUpper, double inputLengthLower) {
       
        int solidSelectionLower = 0;
        int solidSelectionUpper = 1;
       
        height = (Math.random()*(inputHeightUpper - inputHeightLower + 1) + inputHeightLower);
        radius = (Math.random()*(inputRadiusUpper - inputRadiusLower + 1) + inputRadiusLower);
        width = (Math.random()*(inputWidthUpper - inputWidthLower + 1) + inputWidthLower);
        length = (Math.random()*(inputLengthUpper - inputLengthLower + 1) + inputLengthLower);
       
        solidType = (int)(Math.random()*(solidSelectionUpper - solidSelectionLower + 1) + solidSelectionLower);
       
        findVolume();
        findSurfaceArea();
       
    }//end GeoSolids (constructor)
   
    /*******************************************************************/
    /*                                                                 */
    /*              Override of the toString method                    */
    /*                                                                 */
    /*******************************************************************/
   
    public String toString() {
       
        String message = "";
        String heightData = "";
        String radiusData = "";
        String volumeData = "";
        String surfaceAreaData = "";
        String lengthData = "";
        String widthData = "";
       
        heightData = String.format("%.2f", height);
        radiusData = String.format("%.2f", radius);
        volumeData = String.format("%.2f", volume);
        surfaceAreaData = String.format("%.2f", surfaceArea);
        lengthData = String.format("%.2f", length);
        widthData = String.format("%.2f", width);
       
        if (solidType == CYLINDER) {
           
            message = "Cylider - Radius: " + radiusData + "\nHeight: " + heightData + "   Volume: " + volumeData + "   Surface Area: " + surfaceAreaData + "\n";
        }//end if
       
        else if (solidType == RECTANGULAR_PRISM) {
           
            message = "Rectangular Prism - Base Length: " + lengthData + "   Base Width: " + widthData +
            "\nHeight: " + heightData + "   Volume: " + volumeData + "   Surface Area: " + surfaceAreaData + "\n";
        }//end else if
       
        return message;
    }//end toString
   
    /*******************************************************************/
    /*                                                                 */
    /*                           findVolume                            */
    /*                                                                 */
    /*******************************************************************/
   
    private void findVolume() {
       
        if(solidType == CYLINDER) {
           
            volume = Math.PI * Math.pow(radius, 2) * height;
        }//end if (CYLINDER - V)
       
        else if (solidType == RECTANGULAR_PRISM) {
           
            volume = (width * length * height);
        }//end else if (RECTANGULAR_PRISM - V)
    }//end findVolume
   
    /*******************************************************************/
    /*                                                                 */
    /*                         findSurfaceArea                         */
    /*                                                                 */
    /*******************************************************************/
   
    private void findSurfaceArea() {
       
        if(solidType == CYLINDER) {
           
            surfaceArea = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
        }//end if (CYLINDER - SA)
       
        else if(solidType == RECTANGULAR_PRISM) {
           
            surfaceArea = 2 * (width * length + height * length + height * width);
        }//end else if (RECTANGULAR_PRISM - SA)
    }//end findSurfaceArea
   
    /*******************************************************************/
    /*                                                                 */
    /*                             getArea                             */
    /*                                                                 */
    /*******************************************************************/
   
    public double getArea() {
       
        return surfaceArea;
    }//end getArea
   
    /*******************************************************************/
    /*                                                                 */
    /*                              getVolume                          */
    /*                                                                 */
    /*******************************************************************/
   
    public double getVolume() {
       
        return volume;
    }//end getVolume
}//end GeoSolid
