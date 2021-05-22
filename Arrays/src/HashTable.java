import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class HashTable {


    public static void main(String[] args)  {

        LinkedList<String>[] hashTable = new LinkedList[10000];
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String string = null;
            System.out.println("Enter 5 names for storing in hashTable");
            int counter = 0;
            while ((string = reader.readLine()) != null && counter < 2) {

                System.out.println("The value of String is " + string);
                hashTableStorage(string, hashTable);
                counter++;

            }
            System.out.println("enter a name for searching in hashTable");
            while ((string = reader.readLine()) != null) {

                System.out.println("The value of String is " + string);
                System.out.println("The result is " + hashTableSearch(string, hashTable));
               // counter++;

            }

        }
        catch(Exception e){
            System.out.println(e);
        }


    }

    private static void hashTableStorage(String string, LinkedList<String>[] hashTable) {

        int hashCode = string.hashCode();
        System.out.println("The hashcode is " + hashCode);

        int key = Math.abs(hashCode % 10);

        System.out.println("The key is " +  key);

        if(hashTable[key] == null){
            hashTable[key] = new LinkedList<>();
        }
        hashTable[key].add(string);


    }

    private static boolean hashTableSearch (String string, LinkedList<String>[] hashTable){

       // boolean result = false;

        int hashCode = string.hashCode();
        int key = Math.abs(hashCode % 10);
        System.out.println("the key is " + key);
        if(hashTable[key] != null && hashTable[key].contains(string)){
            return true;

        }


        return false;
    }

}
