package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Train trainSA = new Train();
        trainSA.addWagon(new Wagon("EngineSA"));
        for (int i=1;i<6;i++){
            trainSA.addWagon(new Wagon("WagonSA"+i));
        }
        Train trainCD = new Train();
        trainCD.addWagon(new Wagon("EngineCD"));
        for (int i =1;i<8;i++) {
            trainCD.addWagon(new Wagon("WagonCD"+i));
        }
        System.out.println("SA train:");
        trainSA.printTrain();
        System.out.println("\nČD train:");
        trainCD.printTrain();
        Wagon engineSA = trainSA.getWagonAndRemove("EngineSA");
        Wagon engineCD = trainCD.getWagonAndRemove("EngineCD");
        trainCD.addFirst(engineSA);
        trainSA.addFirst(engineCD);
        System.out.println("\nTrains with switched engines:");
        trainSA.printTrain();
        System.out.println();
        trainCD.printTrain();

    }
}
