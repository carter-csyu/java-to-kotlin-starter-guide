package com.carter.lec05;

public class Lec05Main {

    public static void main(String[] args) {
    }

    public String getPassOrFail(int score) {
        return score >= 50 ? "P" : "F";
    }

    public String getGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else {
            return "D";
        }
    }

    public String getGradeWithSwitch(int score) {
        switch (score / 10) {
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            default:
                return "D";
        }
    }

    public boolean startsWithA(Object obj) {
        if (obj instanceof String) {
            return ((String) obj).startsWith("A");
        } else {
            return false;
        }
    }

    private void judgeNumber(int number) {
        if (number == 1 || number == 0 || number == -1) {
            System.out.println("어디서 많이 본 숫자입니다.");
        } else {
            System.out.println("1, 0, -1이 아닙니다.");
        }
    }

    private void judgeNumber2(int number) {
        if (number == 0) {
            System.out.println("주어진 숫자는 0입니다");
            return;
        }

        if (number % 2 == 0) {
            System.out.println("주어진 숫자는 짝수입니다");
            return;
        }

        System.out.println("주어지는 숫자는 홀수입니다");
    }

}
