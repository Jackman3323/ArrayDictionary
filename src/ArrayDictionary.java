import java.util.ArrayList;
import java.util.Collection;


/**
 * ArrayDictionary.java
 * Jack Hughes
 * This file is a dictionary class--you know, like ancient membean.
 * Not really! It's actually a data structure; there's a key and a
 * corrolated value. You can't repeat keys (unlike dictionaries in
 * real life where words have multiple meanings) and if you enter
 * a key already in use, that key's value is updated to the new one.
 * I am very familiar with these after using chrome.storage (cringes
 * and convulses uncontrollably)
 * Date:12-9-20
 * On My Honor: JH
 * @param <T>
 * @param <E>
 */
public class ArrayDictionary<E,T> {
    //INSTANCE-DATA
    //Arraylist of keys
    private ArrayList<E> keys;
    //Arraylist of values
    private ArrayList<T> values;
    //Size counter
    private int size;

    //CONSTRUCTORS
    //Default Constructor
    public ArrayDictionary(){
        this.keys = new ArrayList<E>();
        this.values = new ArrayList<T>();
        this.size = 0;
    }
    //Collection Input Constructor
    public ArrayDictionary(Collection<E> keys, Collection<T> values){
        //Ensure an equal amount of keys and values
        if(keys.size() != values.size()){
            throw new RuntimeException("There must be an equal number of keys and values. There are not.");
        }
        //rest of constructor
        this.keys = new ArrayList<E>(keys);
        this.values = new ArrayList<T>(values);
        this.size = values.size();
    }
    //One key + one value constructor
    public ArrayDictionary(E key, T value){
        this.keys = new ArrayList<E>();
        this.values = new ArrayList<T>();
        this.size = 0;
        this.put(key, value);
    }

    //METHODS
    //void put(E key, T value): put this pair into the dictionary
    public void put(E key, T value){
        //Add key to keys
        this.keys.add(key);
        //Add value to values
        this.values.add(value);
        //increment size
        this.size++;
    }
    //T get(E key): returns the value associated with said key
    public T get(E key){
        //Loop through all keys
        for(int i = 0; i < this.size; i++){
            if(this.keys.get(i).equals(key)){
                //MATCH FOUND, RETURN
                return this.values.get(i);
            }
        }
        //No match found, return null
        return null;
    }
    //T remove(E key): return AND remove the value and key asociated with the inputted key
    public T remove(E key){
        //Loop through all keys
        for(int i = 0; i < this.size; i++){
            if(this.keys.get(i).equals(key)){
                //MATCH FOUND, REMOVE AND RETURN
                //Store value to return
                T toReturn = this.values.get(i);
                //Remove key
                this.keys.remove(i);
                //Remove value
                this.values.remove(i);
                //Adjust size
                this.size--;
                //Return value
                return toReturn;
            }
        }
        //If here, no match was found. Return null.
        return null;
    }
    //boolean contains(E key): return whether or not there is an entry with that key
    public boolean contains(E key){
        //Loop through all keys
        for(int i = 0; i < this.size; i++){
            if(this.keys.get(i).equals(key)){
                //MATCH FOUND
                return true;
            }
        }
        //If here, no match was found. Return false.
        return false;
    }
    //boolean isEmpty(): returns a boolean based on whether or not the dictionary is empty
    public boolean isEmpty(){
        //If and only if size is 0, it's empty.
        return this.size == 0;
    }
    //int size(): return size
    public int size(){
        //Return size
        return this.size;
    }
    //Collection<E> getKeys(): returns the keys. Collection because it's abstract and inclusive
    //THIS WAS RENAMED. The new name makes more sense. (Formerly "keys")
    public Collection<E> getKeys(){
        //Works b/c ArrayList is a Collection
        return this.keys;
    }
    //Collection<T> getValues(): returns the values. Collection because it's abstract and inclusive
    //THIS WAS RENAMED. The new name makes more sense. (Formerly "values")
    public Collection<T> getValues(){
        //Works b/c ArrayList is a Collection
        return this.values;
    }
}
