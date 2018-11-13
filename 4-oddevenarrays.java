//kendrick and cray

package arrays;
public class Arrays {
    public static void main(String[] args) {
        //the Integer of the array
    int o[] = {3,9,15,20,63,23,18,4,2,14,21,}, even[]= new int [5], odd[]=new int [5];
        //elements are indexed from 0 to n-1
    System.out.print("Array { ");
    // find 0 in the array using for loop
    for(int displaycounter = 0; displaycounter<o.length;displaycounter++){
        System.out.print(o[displaycounter] + " ");
    }
        // \n creates a space in the output
        System.out.println("} \n");
    // find 0 in the array using for loop
    for(int arrangecounter = 0, ecount = 0, ocount = 0; arrangecounter < 10; arrangecounter++){
            switch (o[arrangecounter]%2){
                case 1: odd[ocount]=o[arrangecounter];
                    ocount++;
                    //break the loop as we found what we are looking for
                    break;
                default: even[ecount]=o[arrangecounter];
                    ecount++;
                    //break the loop as we found what we are looking for
                    break;
    }            
    }
        // prints the arrays of odd and even
        System.out.println("Odd\tEven");
    for(int lastdisplaycounter = 0; lastdisplaycounter<5; lastdisplaycounter++){
         // \t is used to seperate the odd and the even
            System.out.println(odd[lastdisplaycounter] + "\t" + even[lastdisplaycounter]);}
       
    }
    }  
