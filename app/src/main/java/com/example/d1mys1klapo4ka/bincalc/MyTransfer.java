package com.example.d1mys1klapo4ka.bincalc;

/**
 * Created by d1mys1klapo4ka on 19.04.2017.
 */
class MyTransfer {

    static String decimalToBinary(int decimal) {

        String bin = "";

        while (decimal > 1){

            bin = (decimal % 2) + bin;
            decimal = (decimal / 2);
        }

        bin = decimal + bin;

       while ((bin.length() % 4) != 0){

           bin = 0 + bin;
       }

        return bin;
    }

    static int binaryToDecimal(String bin){
        //check
        int dec = 0;
        StringBuffer bin1 = new StringBuffer(bin);
        bin1.reverse();
        //for (int i = bin.length() - 1; i >= 0; i--) {
        for (int i = 0; i < bin1.length(); i++) {
            dec += Integer.parseInt(String.valueOf(bin1.charAt(i))) * (int)Math.pow(2, i);
            // int x = Integer.parseInt(s);

        }
        return dec;
    }

    static String decimalToOctal(int decimal) {

        String bin = "";

        while (decimal > 1){

            bin = (decimal % 8) + bin;
            decimal = (decimal / 8);
        }

        //bin = decimal + bin;

        return bin;
    }

    static int octalToDecimal(String bin){
        //check
        int dec = 0;
        StringBuffer bin1 = new StringBuffer(bin);
        bin1.reverse();
        //for (int i = bin.length() - 1; i >= 0; i--) {
        for (int i = 0; i < bin1.length(); i++) {
            dec += Integer.parseInt(String.valueOf(bin1.charAt(i))) * (int)Math.pow(8, i);
            // int x = Integer.parseInt(s);

        }
        return dec;
    }

    static String decimalToHex(int decimal) {

        String bin = "";

        while (decimal > 1){

            if ((decimal % 16) == 10){
                bin = 'A' + bin;
            }
            else if ((decimal % 16) == 11){
                bin = 'B' + bin;
            }
            else if ((decimal % 16) == 12){
                bin = 'C' + bin;
            }
            else if ((decimal % 16) == 13){
                bin = 'D' + bin;
            }
            else if ((decimal % 16) == 14){
                bin = 'E' + bin;
            }
            else if ((decimal % 16) == 15){
                bin = 'F' + bin;
            }
            else {
                bin = (decimal % 16) + bin;
            }

            decimal = (decimal / 16);
        }

        //bin = decimal + bin;

        return bin;
    }

    static int hexToDecimal(String bin){

        int dec = 0;
        StringBuffer bin1 = new StringBuffer(bin);
        bin1.reverse();

        for (int i = 0; i < bin1.length(); i++) {
            if (bin1.charAt(i) == 'A') {
                dec += 10 * (int) Math.pow(16, i);
            } else if (bin1.charAt(i) == 'B') {
                dec += 11 * (int) Math.pow(16, i);
            } else if (bin1.charAt(i) == 'C') {
                dec += 12 * (int) Math.pow(16, i);
            } else if (bin1.charAt(i) == 'D') {
                dec += 13 * (int) Math.pow(16, i);
            } else if (bin1.charAt(i) == 'E') {
                dec += 14 * (int) Math.pow(16, i);
            } else if (bin1.charAt(i) == 'F') {
                dec += 15 * (int) Math.pow(16, i);
            } else {
                dec += Integer.parseInt(String.valueOf(bin1.charAt(i))) * (int) Math.pow(16, i);

            }
        }
        return dec;
    }
}


