package javaclass2;

public class pro2 {

	public static void main(String[] args) {
		String str="appa";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
         if(str.contains(rev)){
            System.out.println(str+" palindrom");
        }else{
            System.out.println(str+" not palindrom");
        }

	}

}
