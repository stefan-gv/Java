public class GaussJordan{
    public static void main (String[] args){
        //Arrays are in form 2x+3y+7z = 9 and so on and so forth
        double mainArray[][] = {{2,3,7,9}
                            ,{1,8,2,1}
                            ,{2,7,2,6}};
        double [] finalArray = variableSolve(mainArray);
        for (int x = 0; x<finalArray.length; x++){
            switch (x){
                case 0:
                System.out.println("x = " + finalArray[x]);
                break;
                case 1:
                System.out.println("y = " + finalArray[x]);
                break;
                case 2:
                System.out.println("z = " +finalArray[x]);
                break;
            }
        }  
    }
    public static double[] variableSolve (double[][] mainArray){
        double[] firstArray = mainArray[0];
        double[] secondArray = mainArray[1];
        double[] thirdArray = mainArray[2];
        double multiplier;
        double x,y,z;
        double [] finalArray = new double[3];
        multiplier = firstArray[0]/secondArray[0];
        for (int arrayValue = 0; arrayValue<secondArray.length; arrayValue++){
            secondArray[arrayValue] = (secondArray[arrayValue]*multiplier - firstArray[arrayValue]);
        }
        multiplier = firstArray[0]/thirdArray[0];
        for (int arrayValue = 0; arrayValue<thirdArray.length; arrayValue++){
            thirdArray[arrayValue] = (thirdArray[arrayValue]*multiplier - firstArray[arrayValue]);
        }
        multiplier = secondArray[1]/thirdArray[1];
        for (int arrayValue = 0; arrayValue<thirdArray.length; arrayValue++){
            thirdArray[arrayValue] = (thirdArray[arrayValue]*multiplier - secondArray[arrayValue]);
        }
        z = thirdArray[3]/thirdArray[2];
        y = ((secondArray[3]-(secondArray[2]*z))/secondArray[1]);
        x = ((firstArray[3]-(firstArray[2]*z)-(firstArray[1]*y))/firstArray[0]);
        finalArray[0] = x;
        finalArray[1] = y;
        finalArray[2] = z;
        return finalArray;   
    }
}