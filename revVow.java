public class revVow {
    public static  String reverse(String str){
        char[] s = str.toCharArray(); 
        int n = str.length()-1;
        int start = 0;
        int end = n;
        while(start<end){
            if(!isVow(s[start])){
                start++;
            }
            if(!isVow(s[end])){
                end--;
            }
            else{
                char temp = s[start];
                s[start ] = s[end];
                s[end] = temp;
                start++;
                end--;

            }
        }
            return String.valueOf(s);
        
    }
    public static boolean isVow(char s){
         if( s== 'a' || s == 'e' || s == 'i' || s=='o' || s=='u' || s=='A' || s=='E' ||  s== 'I' || s=='O' || s=='U'){
            return true;
         }
         return false;
    }
    public static void main(String[] args) {
        String str = "morning";
        System.out.println(reverse(str));
    }}
    

