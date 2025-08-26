 class Arrays_2d {
    public static void main(String args[]){
        int[] even={2,4,6,8,10};
        int[] odd={1,3,5,7,9,11};
        int[] prime={2,3,5,7,11};
        int numbers[][]={even,odd,prime};
        for(int[] numb:numbers){  // These loops only gives address of 'even' 'odd' 'prime'
            for(int n:numb){  // These loops will go inside the 'even[]' 'odd[]' 'prime[]'
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
