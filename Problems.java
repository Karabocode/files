import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Collections;
public class Problems {
	public ArrayList<Integer> pfunc(int number){
		ArrayList<Integer> num =new ArrayList<Integer>();
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				num.add(i);
			}
		}
		return num;
		
	}
	public ArrayList<Integer> dup(int arr[]) {
		HashSet<Integer> set= new HashSet<>();
		ArrayList<Integer> t =new ArrayList<Integer>(); 
		for(int num:arr) {
			if (!set.add(num)) {
				t.add(num); 
			}
		}
		return t;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.star program
		for(int i=5;i>=1;i--) {
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		}
		//2.
		String[] names;
		String sentence;
		String word;
		HashMap<String,String> s =new HashMap<String, String>();
		
		names =new String[4];
		ArrayList<String> marks =new ArrayList<String>();
		Scanner obj =new Scanner(System.in);
		for(int i=0;i<4;i++){
		word =obj.nextLine();
			String[] p =word.split("#");
			String mark;
			mark =p[1];
			marks.add(mark);
			s.put(p[0],mark);	
		}
		Collections.sort(marks);
		for(String j:s.keySet()) {
			
			System.out.println(j+"-"+s.get(j));	
		}
		//anagram;
		String word1,word2;
		word1 =obj.nextLine();
		word2 =obj.nextLine();
		 if (word1.length()!=word2.length()) {
			 System.out.println("false");
		 }else {
			 char[] ar1 =word1.toCharArray();
			 char[]ar2 =word2.toCharArray();
			 Arrays.sort(ar1);
			 Arrays.sort(ar2);
			 if (Arrays.equals(ar1,ar2)){
				 System.out.println("True");				 
			 }
			 else {
				 System.out.println("false");
			 }
			     }
		 
		 
		
		
		
		
		
	}
}
