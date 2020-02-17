public class EightyNine{
    public static void main (String[] args){
        int[] mainArray = {1,8,1,8,3,9,8,9,9};
        int [] swappedArray = swapNumbers(mainArray);
        for (int x = 0; x<swappedArray.length; x++){
            System.out.print(mainArray[x]+" ");
        }
    }
    public static int[] swapNumbers(int[] mainArray){
        int indexOfEight = 0;
        int indexOfNine = 0;
        boolean run = false;
        int listLength = mainArray.length;
        for (int searchNumEight = 0; searchNumEight<listLength; searchNumEight++){
            if ((mainArray[searchNumEight] == 8) &&((searchNumEight == listLength-1) || (mainArray[searchNumEight+1] != 9))){
                indexOfEight = searchNumEight;
                run = true;
                while (run == true){
                    for (int searchNumNine = 0; searchNumNine<listLength; searchNumNine++){
                        if (mainArray[searchNumNine] == 9){
                            indexOfNine = searchNumNine; 
                            if ((indexOfNine<indexOfEight) && ((searchNumNine == 0)||(mainArray[indexOfNine-1] != 8))){ //
                                for (int startingNum = indexOfNine; startingNum<indexOfEight; startingNum++){
                                    int proceedingNum = startingNum+1;
                                    int originalValue = mainArray[startingNum];
                                    mainArray[startingNum] = mainArray[proceedingNum];
                                    mainArray[proceedingNum] = originalValue;
                                    if (startingNum == indexOfNine-1){
                                        break;
                                    }
                                }
                            }else if ((indexOfNine>indexOfEight) && ((searchNumNine == 0)||(mainArray[indexOfNine-1] != 8))){ //
                                for (int startingNum = indexOfNine; startingNum>indexOfEight; startingNum--){
                                    int preceedingNum = startingNum-1;
                                    int originalValue = mainArray[startingNum];
                                    mainArray[startingNum] = mainArray[preceedingNum];
                                    mainArray[preceedingNum] = originalValue;
                                    if (startingNum == indexOfNine-1){
                                        break;
                                    }
                                }
                            }else if(mainArray[indexOfNine]-1 == 8){/*do nothing*/}
                        }
                        run = false;
                    }
                }
            }
        }
        return mainArray;
    }
}