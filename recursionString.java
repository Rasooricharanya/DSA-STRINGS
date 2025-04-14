public class recursionString {
    public static void revStr(String s,int index){
        if(index==0){
            System.out.println(s.charAt(index));
            return;
        }
        System.out.print(s.charAt(index));
        revStr(s,index-1);
    }
    public static void main(String[] args){
        String s = "cream";
        revStr(s,s.length()-1);

    }
    
}
