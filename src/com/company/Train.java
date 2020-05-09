package com.company;

public class Train {
    public Wagon first = null;
    public Wagon last = null;

    public void addWagon(Wagon wagonToAdd){
        if (first == null){
            first=wagonToAdd;
            last=wagonToAdd;
        }
        else {
            wagonToAdd.previousWagon=last;
            last.nextWagon=wagonToAdd;
            last=wagonToAdd;
        }

    }
    public Wagon getWagonAndRemove (String nameOfWagon){
        Wagon temp = first;
        if(temp==null){
            System.out.println("\nThis train doesn't have any wagons.");
            return null;
        }
        else {
            while (temp!=null && !temp.nameOfWagon.equals(nameOfWagon)) {
                temp = temp.nextWagon;
            }
            if (temp==null){
                System.out.println("\nThis train doesn't have wagon named "+nameOfWagon+".");
                return null;
            }
            else if (temp==last) {
                Wagon output = temp;
                temp.previousWagon.nextWagon = null;
                last = temp.previousWagon;
                return output;
            }
            else if (temp==first) {
                Wagon output = temp;
                first=temp.nextWagon;
                temp.nextWagon.previousWagon=null;
                return output;

            }
            else{
                Wagon output = temp;
                temp.previousWagon.nextWagon=temp.nextWagon;
                temp.nextWagon.previousWagon=temp.previousWagon;
                return output;

            }
        }
    }

    public void addFirst(Wagon wagonToAdd) {
        wagonToAdd.nextWagon=first;
        first.nextWagon.previousWagon=wagonToAdd;
        first=wagonToAdd;

    }

    public void printTrain(){
        Wagon temp = first;
        if (temp==null){
            System.out.println("\nThis train doesn't have any wagons.");
        }
        else{
            while (temp!=null) {
                System.out.print(temp.nameOfWagon + " ");
                temp=temp.nextWagon;

            }
        }

    }

}
