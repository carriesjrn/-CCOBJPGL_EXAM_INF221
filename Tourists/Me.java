package Tourists;


import Locations.*;

public class Me implements Tourist {

    static int budget = 1000;
    

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        System.out.println("Ang pera ko lang is " + getBudget());

        if ( budget > boracay.airFare  ){
            System.out.println("Nice Boracay" );
            budget -= boracay.airFare;
            
        }else{
            System.out.println("Bilis naman maubos ng budget ");
        }

      checkBudget();
        
    }

    public void visit(Bohol bohol) {

        if(budget >bohol.airFare){
            System.out.println("I'm going to bohol na");
            budget -= bohol.airFare;
        }else{
            System.out.println("Omg di na kaya ng wallet ko");
        }

        checkBudget();
    }
    public void visit(Cebu cebu) {
        if(budget >cebu.airFare){
            System.out.println("Let's go to cebu para unwind");
            budget -= cebu.airFare;
        }else{
            System.out.println("Omg di na kaya ng wallet ko");
        }

        checkBudget();
    }

    public void visit(Palawan palawan) {
        if(budget >palawan.airFare){
            System.out.println("Let's go to palawan kahit no money");
            budget -= palawan.airFare;
        }else{
            System.out.println("Omg di na kaya ng wallet ko");
        }

        checkBudget();
    }

    public void visit(Siargao siargao) {
        if(budget >siargao.airFare){
            System.out.println("Siargao let's go  ");
            budget -= siargao.airFare;
        }else{
            System.out.println("Omg di na kaya ng wallet ko");
        }

        checkBudget();
    }

    public void visit(Vigan vigan) {
        if(budget >vigan.airFare){
            System.out.println("Vigan is our new destination");
            budget -= vigan.airFare;
        }else{
            System.out.println("Omg di na kaya ng wallet ko");
        }

        checkBudget();
    }

    public void checkBudget() {
        System.out.println("my pera is " + budget);
    }

    public static int getBudget() {
        return budget;
    }


}