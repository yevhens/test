public class Junittesting {

    public int square(int x){
        return x*x;
    }

    public int counta(String st){
        int count=0;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='a'||st.charAt(i)=='A'){
                count++;
            }
        }
        return count;
    }

}
