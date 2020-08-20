package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters
{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        //String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        System.out.print("Enter a string: ");
        String userString = input.nextLine();
        HashMap<Character, Integer> map;
        map = countCharacters(userString);
        for(Map.Entry<Character, Integer> character : map.entrySet()){
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }

    public static HashMap<Character, Integer> countCharacters(String str){

        HashMap<Character, Integer> countMap = new HashMap<>();

        char[] charactersInString = str.toLowerCase().toCharArray();

        for(char character: charactersInString){
            if(countMap.containsKey(character)){
                countMap.replace(character, countMap.get(character), countMap.get(character) + 1);
            }else{
                countMap.put(character, 1);
            }
        }

        return countMap;
    }
}
