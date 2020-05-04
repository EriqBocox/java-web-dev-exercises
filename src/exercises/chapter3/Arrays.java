package exercises.chapter3;



public class Arrays {
    public static void main(String[] args) {
        int[] values = {1,1,2,3,5,8};
        String sentance = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them " +
                "in a house. I will not eat them with a mouse.";

        for(int i=0; i<values.length; i++){
            if(values[i] % 2 != 0) {
                System.out.println(values[i]);
            }
        }

        String[] tempArray = sentance.split("\\.");
        System.out.println(java.util.Arrays.toString(tempArray));
    }
}
