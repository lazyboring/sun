package com.niec.mall.test;

/**
 * @author : niec
 * @description
 * @date : 2020-03-26 09:13
 */
public class Demo {
    public static void main(String[] args) {
//        Random random = new Random();
//        random.ints().limit(10).sorted().forEach(System.out::println);
//
//        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
//        System.out.println(filtered);

//
//        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
//        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
//
//        System.out.println("筛选列表: " + filtered);
//        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
//        System.out.println("合并字符串: " + mergedString);

//        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//        // 获取对应的平方数
//        List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
//        System.out.println(squaresList);

//        new Thread((new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("匿名内部类 实现线程");
//            }
//        })).start();
        //lambda
        new Thread( () -> System.out.println("java8 lambda实现线程")).start();


    }
}
