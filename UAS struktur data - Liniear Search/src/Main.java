public class Main {
    public static void main(String[] args) {
        int[] intArray = {22,36,-5,7,55,1,-22,10,30,-40,29,12,5,-99};

        //System.out.println(linierSearch(intArray, -99));

        if(liniearSearch(intArray,10) == -1){
            System.out.println("Data tidak ditemukan");
        } else{
            System.out.println("Data ditemukan pada index ke " + liniearSearch(intArray, 10));
        }

    }

    public static int liniearSearch(int[] input, int value){
        for(int i=0; i < input.length; i++){
            if(input[i] == value) {
                return i;
            }
        }
        return -1;
    }
}