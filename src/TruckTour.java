import java.util.List;

/*
* Mock test Week 3
* */
public class TruckTour {

    public static int truckTour(List<List<Integer>> petrolPumps){
        int startPosition = 0;
        int myPetrol = 0;
        for(int i=0; i<petrolPumps.size(); i++){
            myPetrol+= petrolPumps.get(i).get(0) - petrolPumps.get(i).get(1);
            if(myPetrol <0){
                startPosition = i+1;
                myPetrol = 0;
            }
        }

        return startPosition;
    }
}
