package baitap;

public class BaiTapHamVaMang1 {
	public class MangCoBan {

	    // 1. Tổng mảng
	    public static int sumArray(int[] arr) {
	        int sum = 0;
	        for(int i=0;i<arr.length;i++)
	            sum += arr[i];
	        return sum;
	    }

	    // 2. Max
	    public static int maxValue(int[] arr) {
	        int max = arr[0];
	        for(int i=1;i<arr.length;i++)
	            if(arr[i] > max)
	                max = arr[i];
	        return max;
	    }

	    // 3. Min
	    public static int minValue(int[] arr) {
	        int min = arr[0];
	        for(int i=1;i<arr.length;i++)
	            if(arr[i] < min)
	                min = arr[i];
	        return min;
	    }

	    // 4. Đếm chẵn lẻ
	    public static void countEvenOdd(int[] arr) {
	        int chan = 0, le = 0;
	        for(int i=0;i<arr.length;i++){
	            if(arr[i] % 2 == 0) chan++;
	            else le++;
	        }
	        System.out.println("Chan: " + chan);
	        System.out.println("Le: " + le);
	    }

	    // 5. In ngược
	    public static void reverseArray(int[] arr) {
	        for(int i=arr.length-1;i>=0;i--)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }

	    // 6. Kiểm tra tồn tại
	    public static boolean isExist(int[] arr, int x) {
	        for(int i=0;i<arr.length;i++)
	            if(arr[i] == x)
	                return true;
	        return false;
	    }

	    // 7. Trung bình
	    public static double average(int[] arr) {
	        return (double) sumArray(arr) / arr.length;
	    }

	    // 8. Đếm số lần xuất hiện
	    public static int countOccurrences(int[] arr, int x) {
	        int count = 0;
	        for(int i=0;i<arr.length;i++)
	            if(arr[i] == x)
	                count++;
	        return count;
	    }

	    // 9. Nối 2 mảng
	    public static int[] mergeArrays(int[] a, int[] b) {
	        int[] c = new int[a.length + b.length];
	        for(int i=0;i<a.length;i++)
	            c[i] = a[i];
	        for(int i=0;i<b.length;i++)
	            c[a.length + i] = b[i];
	        return c;
	    }

	    // 10. Sắp xếp tăng dần (bubble sort)
	    public static void sortAscending(int[] arr) {
	        for(int i=0;i<arr.length-1;i++){
	            for(int j=0;j<arr.length-1;j++){
	                if(arr[j] > arr[j+1]){
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	            }
	        }
	    }
	}
	// 11. Xóa phần tử
	public static int[] removeElement(int[] arr, int x) {
	    int count = 0;
	    for(int i=0;i<arr.length;i++)
	        if(arr[i] != x)
	            count++;

	    int[] newArr = new int[count];
	    int index = 0;

	    for(int i=0;i<arr.length;i++)
	        if(arr[i] != x)
	            newArr[index++] = arr[i];

	    return newArr;
	}

	// 12. Thêm phần tử vào vị trí pos
	public static int[] insertElement(int[] arr, int pos, int value) {
	    int[] newArr = new int[arr.length + 1];

	    for(int i=0;i<pos;i++)
	        newArr[i] = arr[i];

	    newArr[pos] = value;

	    for(int i=pos;i<arr.length;i++)
	        newArr[i+1] = arr[i];

	    return newArr;
	}

	// 13. In số nguyên tố
	public static void printPrimeNumbers(int[] arr) {
	    for(int i=0;i<arr.length;i++)
	        if(isPrime(arr[i]))
	            System.out.print(arr[i] + " ");
	}

	public static boolean isPrime(int n) {
	    if(n < 2) return false;
	    for(int i=2;i<n;i++)
	        if(n % i == 0)
	            return false;
	    return true;
	}

	// 14. Phần tử xuất hiện nhiều nhất
	public static int mostFrequentElement(int[] arr) {
	    int maxCount = 0;
	    int result = arr[0];

	    for(int i=0;i<arr.length;i++){
	        int count = 0;
	        for(int j=0;j<arr.length;j++)
	            if(arr[i] == arr[j])
	                count++;

	        if(count > maxCount){
	            maxCount = count;
	            result = arr[i];
	        }
	    }
	    return result;
	}

	// 15. Tách chẵn lẻ
	public static void splitEvenOdd(int[] arr) {
	    System.out.print("Chan: ");
	    for(int i=0;i<arr.length;i++)
	        if(arr[i] % 2 == 0)
	            System.out.print(arr[i] + " ");

	    System.out.print("\nLe: ");
	    for(int i=0;i<arr.length;i++)
	        if(arr[i] % 2 != 0)
	            System.out.print(arr[i] + " ");
	}
	// 16. Xoay phải k lần
	public static void rotateRight(int[] arr, int k) {
	    for(int r=0;r<k;r++){
	        int last = arr[arr.length-1];
	        for(int i=arr.length-1;i>0;i--)
	            arr[i] = arr[i-1];
	        arr[0] = last;
	    }
	}

	// 17. Kiểm tra đối xứng
	public static boolean isSymmetric(int[] arr) {
	    for(int i=0;i<arr.length/2;i++)
	        if(arr[i] != arr[arr.length-1-i])
	            return false;
	    return true;
	}

	// 19. Max subarray (đơn giản)
	public static int maxSubArraySum(int[] arr) {
	    int max = arr[0];
	    int current = arr[0];

	    for(int i=1;i<arr.length;i++){
	        if(current + arr[i] > arr[i])
	            current = current + arr[i];
	        else
	            current = arr[i];

	        if(current > max)
	            max = current;
	    }
	    return max;
	}

	// 20. Ma trận
	public static int sumMatrix(int[][] m) {
	    int sum = 0;
	    for(int i=0;i<m.length;i++)
	        for(int j=0;j<m[i].length;j++)
	            sum += m[i][j];
	    return sum;
	}

	public static int sumMainDiagonal(int[][] m) {
	    int sum = 0;
	    for(int i=0;i<m.length;i++)
	        sum += m[i][i];
	    return sum;
	}

	public static int findMaxInMatrix(int[][] m) {
	    int max = m[0][0];
	    for(int i=0;i<m.length;i++)
	        for(int j=0;j<m[i].length;j++)
	            if(m[i][j] > max)
	                max = m[i][j];
	    return max;
	}
}
