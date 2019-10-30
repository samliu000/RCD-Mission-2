/*
 * Proceed to main method for mission details
 */

package rcd.mission.pkg2;
import java.util.ArrayList;
import java.math.*;

/**
 * @author samuelliu
 */
public class RCDMission2 {
    
    public static void mutation0(SpecialInteger num, ArrayList<SpecialInteger> array){
        mutationEscalation(num, 2);
        mutationReduction(num, 2);
        num.simpleMutation(10030);
        array.add(num);
    }
    public static void mutationSpecial(SpecialInteger num, ArrayList<SpecialInteger> array){
        mutationEscalation(num, 2);
        mutationReduction(num, 2);
        array.add(num);
    }
    public static void mutationEscalation(SpecialInteger number, int i){
        if(i == 0){
            return;
        } else{
            number.manipulate(1);
            mutationEscalation(number, --i);
        }
    }
    public static void mutationReduction(SpecialInteger number, int i){
        if(i == 0){
            return;
        } else{
            number.reduction(2);
            mutationReduction(number, --i);
        }
    }    
    
    public static void mutation1(SpecialInteger num, ArrayList<SpecialInteger> array){
        if(statusChecker(num).equals("Goldilocks Zone")){
            array.add(num);
        } else if(statusChecker(num).compareTo("inflated") == 0){
            num.goodLuckWithThisOne(404, 0);
        } else {
            num.goodLuckWithThisOne(205, 0);
        }
    }
    
    
    
    
    
    
    
    
    public static String statusChecker(SpecialInteger num){
        if(num.getSpecInt() >= Math.sqrt(10404)){
            return "inflated";
        } else if(num.getSpecInt() <= Math.sqrt(10000)){
            return "inadequate";
        } else{
            return "Goldilocks Zone";
        }
    }
    
    public static void LogicGatesRoundOne(SpecialInteger num, ArrayList<SpecialInteger> array){
        boolean thisOneIsEasy = true&&false||false;
        LogicGatesRoundTwo(num, thisOneIsEasy, array);
    }
    
    public static void LogicGatesRoundTwo(SpecialInteger num, boolean previousResult, ArrayList<SpecialInteger> array){
        boolean var0 = true;
        boolean var1 = false;
        if(previousResult){
            var0 = !(var0&&var1)&&(var0&&var1||!var0); 
        } else{
            var0 = ((var0||!var1)&&var0)&&(var1||var0); 
        }
        LogicGatesRoundThree(num, var0, array);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void LogicGatesRoundThree(SpecialInteger num, boolean previousResult, ArrayList<SpecialInteger> array){
        //LAST ROUND!
        if(previousResult){
            boolean var0 = true;
            boolean var1 = false;
            for(int i = 0; i < 101; i++){
                var0 = !var0;
                var1 = !var1;
                var0 = var0&&var1;
                var1 = var0||var1;
            } 
            for(int j = 0; j < 434; j++){
                var0 = !var0;
            }
            if(var0&&var1){
                num.simpleMutation(-24);
                array.add(num);
            } else{
                num.simpleMutation(-20);
                array.add(num);
            }
        } else{
            boolean var0 = false;
            boolean var1 = true;
            for(int i = 0; i < 29; i++){
                var0 = !var0;
                var1 = !var1;
                var0 = var0&&var1;
                var1 = var0||var1;
            }
            for(int j = 0; j < 201; j++){
                var0 = !var0;
            }
            if(var0&&var1){
                num.simpleMutation(-24);
                array.add(num);
            } else{
                num.simpleMutation(-20);
                array.add(num);
            }
        }
    }
    
    public static void doNothing(SpecialInteger num, ArrayList<SpecialInteger> array){
        num.simpleMutation(99);
        array.add(num);
    }
    
    public static void printValues(ArrayList<SpecialInteger> array){
        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i).getSpecInt());
        }
        System.out.println("Extra hint: School!");
    }
    /**
     * Hi Kim! Find out what the printValues method prints for your next clue!
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initializations
        ArrayList<SpecialInteger> arrayOfSpecialIntegers = new ArrayList<SpecialInteger>();
        SpecialInteger specInt0 = new SpecialInteger(100);
        SpecialInteger specInt1 = new SpecialInteger(118);
        SpecialInteger specInt2 = new SpecialInteger(152);
        SpecialInteger specInt3 = new SpecialInteger(98);
        SpecialInteger specInt4 = new SpecialInteger(12);
        SpecialInteger specInt5 = new SpecialInteger(100);
        
        //The fun begins!
        mutation0(specInt0, arrayOfSpecialIntegers); //Arithmetic/Rescursion Challenge
        LogicGatesRoundOne(specInt1, arrayOfSpecialIntegers); //Logic Gates
        mutation0(specInt2, arrayOfSpecialIntegers); //Arithmetic/Recursion Challenge
        mutation1(specInt3, arrayOfSpecialIntegers); // Mind Challenge
        doNothing(specInt4, arrayOfSpecialIntegers); //Great Job Kimberly!! You Deserve A Break
        mutationSpecial(specInt5, arrayOfSpecialIntegers);
        
        //Print Array Values
        printValues(arrayOfSpecialIntegers);
    }
    
}
