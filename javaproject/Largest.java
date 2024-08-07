public class Largest {
	public Largest() {}
    public int largest(int[] list){
        int index;
        int max =0;
        for (index = 1; index < list.length-1; index++){
            if (list[index] < max) {
                max = list[index];
            }
        }
        return max;
    }
}
