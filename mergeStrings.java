public class mergeStrings {
    public static String Alternate(String str1,String str2){
        StringBuilder sb = new StringBuilder();
        int n = str1.length();
        int m = str2.length();
        int i=0;
        while(i<n || i<m){
            if(i<n){
                sb.append(str1.charAt(i));
            }
            if(i<m){
                sb.append(str2.charAt(i));
            }
            i++;
        }
        return sb.toString();
        


    }
    public static void main(String args[]){
        String str1 = "fit";
        String str2 = "beat";
        System.out.println(Alternate(str1,str2));
    }
    
}
