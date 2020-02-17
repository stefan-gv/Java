public class Directions{
    public static void main(String[] args){
        //Calculated using true bearing compass directions
        //Clockwise = +degrees while CounterClockwise = -degrees
        int[] compassDirections = {180,-270,+45, /*reverse direction*/ 180, -135 , /*robots left is always counterclockwise*/ -45, 180, -90};
        int[] test  = {130, -573, 90, -394, 190, -221};
        int sumOfAllDirections = 0;
        for (int currentDirection : compassDirections){
            sumOfAllDirections = sumOfAllDirections + currentDirection;
        }
        if (sumOfAllDirections<0){
            System.out.println(360 + (sumOfAllDirections%360));
        }else{
        System.out.println((sumOfAllDirections%360)); 
        }
    }
}