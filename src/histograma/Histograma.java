/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package histograma;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class Histograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] data = {1,2,-3,7,7,7,2};
        Map<Integer,Integer> histogram = new HashMap<>();
    

    for (int i = 0; i < data.length; i++) {
    if(histogram.containsKey(data[i])) {
        histogram.put(data[i], histogram.get(data[i]) + 1);
        
    }else{
        histogram.put (data[i], 1);        
    }
   
    }
    for(int key : histogram.keySet()){
        System.out.println(key + " -->" + histogram.get(key));
    }
}}
