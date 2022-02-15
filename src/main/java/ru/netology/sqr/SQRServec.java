package ru.netology.sqr;

public class SQRServec {
    public int sqrAreaQuantity(int ferst, int last) {
        int reckon = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= ferst && i * i <= last) {
                reckon++;
            }
        }
        return reckon;
    }
}
