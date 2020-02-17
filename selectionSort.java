public class selectionSort{
    public static void main(String[] args){
        int[] mainArray = {2,3,2,1,0,3,4,22,3,0,5};
        // change name of method vvv (HERE!)
        int[] sortedArray = insertSort(mainArray);
        for (int x = 0; x<sortedArray.length; x++){
            System.out.print(sortedArray[x]+",");
        }
        //System.out.println("Sum of 3 smallest integers: " + (sortedArray[0]+sortedArray[1]+sortedArray[2]));
    }
    
    // This method should be called SelectionSort but I made a mistake while naming the file
    public static int[] sort(int[] mainArray){
        int listLength = mainArray.length;
        for (int startingNum = 0; startingNum<listLength; startingNum++){
            for (int proceedingNums = startingNum+1; proceedingNums<listLength; proceedingNums++){
                if (mainArray[proceedingNums]<mainArray[startingNum]){
                    int originalValue = mainArray[startingNum];
                    mainArray[startingNum] = mainArray[proceedingNums];
                    mainArray[proceedingNums] = originalValue;
                }else if (mainArray[proceedingNums] == mainArray[startingNum]){
                    int originalValue = mainArray[startingNum+1];
                    mainArray[startingNum+1] = mainArray[proceedingNums];
                    mainArray[proceedingNums] = originalValue;
                }else{

                }
            }
        }
        return mainArray;
    }

    //Bubble Sort
    public static int[] bubbleSort(int[] mainArray){
        int listLength = mainArray.length;
        boolean run = true;
        while (run == true){
            int counter = 0;
            for (int startingNum = 0; startingNum<listLength-1; startingNum++){
                int proceedingNum = startingNum+1;
                if (mainArray[proceedingNum]<mainArray[startingNum]){
                    int originalValue = mainArray[startingNum];
                    mainArray[startingNum] = mainArray[proceedingNum];
                    mainArray[proceedingNum] = originalValue;
                    counter+=1;
                }
            }
            if (counter!=0){
                run = true;
            }else{
                run = false;
            }
        }
        return mainArray;
    }

    //Simple Sort
    public static int[] simpleSort(int[] mainArray){
        int listLength = mainArray.length;
        int[] sortedArray = new int [listLength];
        int indexForSorted = 0;
        int max = 0;
        Boolean run = true;
        for (int x = 0; x<listLength; x++){
            if (mainArray[x] > max){max = mainArray[x];}
        }
        while (run == true){
            run = false;
            int startingNum = mainArray[0];
            int indexForMain = 0;
            for (int proceedingNum = 1; proceedingNum<listLength; proceedingNum++){
                if (mainArray[proceedingNum]<startingNum){
                    startingNum = mainArray[proceedingNum];
                    indexForMain = proceedingNum;
                    run = true;
                }else if ((proceedingNum == listLength-1)&&(indexForMain == 0)){
                    run = true;
                }
            }
            sortedArray[indexForSorted] = mainArray[indexForMain];
            mainArray[indexForMain] = max;
            indexForSorted+=1;
            if (indexForSorted == sortedArray.length-1){
                sortedArray[indexForSorted] = max;
                run = false;
            }
        }
        return sortedArray; 
    }

    // Insert Sort
    public static int[] insertSort(int[] mainArray){
        int listLength = mainArray.length;
        for (int startingNum = 0; startingNum<listLength; startingNum++){
            int proceedingNum = startingNum+1;
            if ((startingNum == listLength-1) && (proceedingNum == listLength)){
                break;
            }
            if (mainArray[startingNum]>mainArray[proceedingNum]){
                int originalValue = mainArray[startingNum];
                mainArray[startingNum] = mainArray[proceedingNum];
                mainArray[proceedingNum] = originalValue;
            }
            for (int startCheck = 0; startCheck<proceedingNum; startCheck++){
                for (int nextNums = startCheck+1; nextNums<=proceedingNum; nextNums++){
                    if (mainArray[nextNums]<mainArray[startCheck]){
                        int originalValue = mainArray[startCheck];
                        mainArray[startCheck] = mainArray[nextNums];
                        mainArray[nextNums] = originalValue;
                    }
                }
            }
        }
        return mainArray;
    }
}
