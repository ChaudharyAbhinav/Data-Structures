```
class printdigits {

    public static void main(String args[]) {
        int n = 342;
        display(n);
    }

    static void display(int n) {
        // count digits
        int count = (int) Math.floor(Math.log10(n) + 1);

        int div = (int) Math.pow(10, count - 1);
        while (n > 0) {
            int quo = n / div;
            System.out.println(quo);
            n = n % div;
            div = div / 10;
        }
    }
}
```

#### `TC` O(n)

