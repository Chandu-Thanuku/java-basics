
class Variable_Arguements {
    public static void main(String args[]){

            average(1,2,3,4);
    }
    static void average(int... numbers){  // Takes 'n' arguements into aarray.So no need of overloading methods.
        double sum=0;
        for(int num:numbers){
            sum+=num;
        }
        System.out.println("Average: "+(sum/numbers.length));
    }
}
