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
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = new histo.getistogram();
        
    for(int key : histogr.keySet()){
            System.out.println(key + " -->" + histogr.get(key));
        }
    }
}
