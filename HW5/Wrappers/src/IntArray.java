public class IntArray {

    private Integer[] array; //массив для хранения чисел
    private int nums; //число элементов в массиве
    private int N; //значение элемента массива (число)

    public IntArray() { //массив по умолчанию на 10 элементов
    }

    public IntArray(Integer[] array, int N) {//к-р с готовым массивом
        this.array = array;
        this.N = N;
    }

    public IntArray(int nums) { //к-р, в кот. передается кол-во эл-тов массива
        this.nums = nums;
        array = new Integer[nums];
    }
    
    public void setArray (Integer[]array){
        this.array = array;
    }

    public Integer[] getArray () {
        return array;
    }
}



