public class MirrorInverse {

    static boolean isMirrorInverse(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            if (arr[arr[i]] != i)
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 0 };
        if (isMirrorInverse(arr))
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}