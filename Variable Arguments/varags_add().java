
class Variable_Arguements {
    public static void main(String args[]){

            add(1,2,3,4);
    }
    static void add(int... numbers){  // Takes 'n' arguements into aarray.So no need of overloading methods.
        int sum=0;
        for(int num:numbers){
            sum+=num;
        }
        System.out.println(sum);
    }
}
