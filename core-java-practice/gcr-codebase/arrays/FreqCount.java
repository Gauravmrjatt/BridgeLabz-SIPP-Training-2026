import java.util.*;
public class FreqCount {

public static void twoSum() {
 int arr[] = {1,6,9,7,4,3,5,2,8};
int len = arr.length;

for(int i = 0;i < len-1;i++) {

for(int j = i+1; j < len ;j++) {

if(arr[i] + arr[j] == 9) {
System.out.println(arr[i]+ " + " +arr[j] + "= 9" );
}
}
}

}
public static void main(String args[]) {
twoSum();
int dig = 1233457;

HashMap<Integer, Integer> h = new HashMap<>();

while(dig != 0) {
 
int last = dig % 10;
dig /= 10;
 
h.put(last , h.getOrDefault(last, 1) + 1);
}

System.out.print(h);

}
}

