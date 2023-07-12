[33mcommit ed2efadffcee8d6011ea0b4830db23c75e9ce19b[m[33m ([m[1;36mHEAD -> [m[1;32mmaster[m[33m)[m
Author: I-WantYouSoBadly <jh040912@naver.com>
Date:   Wed Jul 12 01:13:49 2023 +0900

    New Files

[1mdiff --git a/.gitignore b/.gitignore[m
[1mnew file mode 100644[m
[1mindex 0000000..e69de29[m
[1mdiff --git a/Main.java b/Main.java[m
[1mnew file mode 100644[m
[1mindex 0000000..aedd9cd[m
[1m--- /dev/null[m
[1m+++ b/Main.java[m
[36m@@ -0,0 +1,17 @@[m
[32m+[m[32m// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,[m
[32m+[m[32m// then press Enter. You can now see whitespace characters in your code.[m
[32m+[m[32mpublic class Main {[m
[32m+[m[32m    public static void main(String[] args) {[m
[32m+[m[32m        // Press Alt+Enter with your caret at the highlighted text to see how[m
[32m+[m[32m        // IntelliJ IDEA suggests fixing it.[m
[32m+[m[32m        System.out.printf("Hello and welcome!");[m
[32m+[m
[32m+[m[32m        // Press Shift+F10 or click the green arrow button in the gutter to run the code.[m
[32m+[m[32m        for (int i = 1; i <= 5; i++) {[m
[32m+[m
[32m+[m[32m            // Press Shift+F9 to start debugging your code. We have set one breakpoint[m
[32m+[m[32m            // for you, but you can always add more by pressing Ctrl+F8.[m
[32m+[m[32m            System.out.println("i = " + i);[m
[32m+[m[32m        }[m
[32m+[m[32m    }[m
[32m+[m[32m}[m
\ No newline at end of file[m
[1mdiff --git a/_01_HelloWorld.java b/_01_HelloWorld.java[m
[1mnew file mode 100644[m
[1mindex 0000000..7cd7e18[m
[1m--- /dev/null[m
[1m+++ b/_01_HelloWorld.java[m
[36m@@ -0,0 +1,7 @@[m
[32m+[m[32mpackage Chapter01;[m
[32m+[m
[32m+[m[32mpublic class _01_HelloWorld {[m
[32m+[m[32m    public static void main(String[] args) {[m
[32m+[m[32m        System.out.println("Hello World!!!");[m
[32m+[m[32m    }[m
[32m+[m[32m}[m
[1mdiff --git a/_02_DataTypes.java b/_02_DataTypes.java[m
[1mnew file mode 100644[m
[1mindex 0000000..d58b29a[m
[1m--- /dev/null[m
[1m+++ b/_02_DataTypes.java[m
[36m@@ -0,0 +1,15 @@[m
[32m+[m[32mpackage Chapter01;[m
[32m+[m
[32m+[m[32mpublic class _02_DataTypes {[m
[32m+[m[32m    public static void main(String[] args) {[m
[32m+[m[32m        System.out.println("Hello World");[m
[32m+[m[32m        System.out.println("하이요");//문자열[m
[32m+[m[32m        System.out.println(12);[m
[32m+[m[32m        System.out.println(-12);[m
[32m+[m[32m        System.out.println(3.14);//숫자[m
[32m+[m[32m        System.out.println(true);[m
[32m+[m[32m        System.out.println(false);//분리형[m
[32m+[m
[32m+[m[32m        System.out.println(123+345);[m
[32m+[m[32m    }[m
[32m+[m[32m}[m
[1mdiff --git a/_03_variables.java b/_03_variables.java[m
[1mnew file mode 100644[m
[1mindex 0000000..df781f9[m
[1m--- /dev/null[m
[1m+++ b/_03_variables.java[m
[36m@@ -0,0 +1,11 @@[m
[32m+[m[32mpackage Chapter01.git-Java-01;[m
[32m+[m
[32m+[m[32mpublic class _03_variables {[m
[32m+[m[32m    public static void main(String[] args) {[m
[32m+[m[32m        String name = "코틀린";[m
[32m+[m[32m        int hour = 15;[m
[32m+[m
[32m+[m[32m        System.out.println(name+ " 배송이 시작됩니다. 15시에 방문 예정입니다.");[m
[32m+[m[32m        System.out.println(name+ " 배송이 완료되었습니다.");[m
[32m+[m[32m    }[m
[32m+[m[32m}[m
[1mdiff --git a/_04_Expressions.java b/_04_Expressions.java[m
[1mnew file mode 100644[m
[1mindex 0000000..f0f4c23[m
[1m--- /dev/null[m
[1m+++ b/_04_Expressions.java[m
[36m@@ -0,0 +1,15 @@[m
[32m+[m[32mpackage Chapter01;[m
[32m+[m
[32m+[m[32mpublic class _04_Expressions {[m
[32m+[m[32m    public static void main(String[] args) {[m
[32m+[m[32m        //expression = operations & operators[m
[32m+[m[32m        //operands  = values, variables, numbers, quantity[m
[32m+[m[32m        //operators = + - * / %[m
[32m+[m
[32m+[m[32m        double friends = 10;[m
[32m+[m
[32m+[m[32m        friends = (double) friends / 3; //자료형 선언후 a=a+b꼴 사용시 앞에 괄호로 달아줘야함[m
[32m+[m
[32m+[m[32m        System.out.println(friends);[m
[32m+[m[32m    }[m
[32m+[m[32m}[m
