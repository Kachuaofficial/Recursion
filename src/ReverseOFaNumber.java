void  main() {

    Scanner sc = new Scanner(System.in);
    int reverse = 0;
    int num = sc.nextInt();
    System.out.println(reverse(reverse, num));
}
int reverse(int rev, int num) {

    if (num == 0) {
        return rev;
    }

    rev = rev * 10 + (num % 10);
    num = num / 10;
    return reverse(rev, num);

};