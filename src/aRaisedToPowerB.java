import static java.lang.IO.print;

void main() {
    int pow= 4;
    int a = 2;

    print(power(a,pow));

}

int power(int num, int pow) {
    if(pow == 0) {
        return 1;

    }

    return num * power(num, pow - 1);
};

