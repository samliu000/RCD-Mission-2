/*
 * Mission 2
 * Hi Kim! I created this class to make things harder for you <3 
 * GOOD LUCK!!
 */
package rcd.mission.pkg2;
import java.util.Random;
/**
 *
 * @author samuelliu
 */
public class SpecialInteger {
    
    private int numberValue;
    
    public SpecialInteger(int number){
        numberValue = number + 3;
    }
    
    public void manipulate(int number){
        for(int i = 0; i < number; i++){
            numberValue *= 3;
            numberValue--;
        }
    }
    
    public void reduction(int number){
        for(int i = 0; i < number; i++){
            numberValue /= 2;
        }
    }

    public void simpleMutation(int number){
        if(number > 10000){
            simpleMutation(number%10000);
        } else if(number > 1000){
            simpleMutation(number%1000);
        } else if(number > 100){
            simpleMutation(number%100);
        } else{
            numberValue += number;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    public void goodLuckWithThisOne(int number, int iterations){
        Random rand = new Random();
        if(iterations > 100){
            return;
        } else if(iterations < 25){
            int num = rand.nextInt(50); 
            numberValue += num;
            numberValue -= number;
            goodLuckWithThisOne(number, iterations + 2);
        } else if(iterations < 50){
            int num = rand.nextInt(50); 
            numberValue += num;
            numberValue -= 2 * number;
            goodLuckWithThisOne(number, iterations + 2);
        } else{
            int num = rand.nextInt(50); 
            numberValue += num;
            numberValue -= 3 * number;
            goodLuckWithThisOne(number, iterations + 2);
        }
    }
    
    public int getSpecInt(){
        return numberValue;
    }
}
