/**
 * @(#)Java8.java, May 19, 2019.
 * <p>
 * Copyright 2019 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */



import test.Converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author liushuaifei
 */
public class Java8 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        names.sort((String a, String b) -> {
            return 0;
        });
        names.sort((a,b) -> {
            return 0;
        });

        Converter<String, Integer> function = (form) -> Integer.valueOf(form);
        Integer convert = function.convert("123");
        System.out.println(convert);

        List<String> stringCollection = new ArrayList<>();
        // stringCollection.add("ddd2");
        // stringCollection.add("aaa2");
        // stringCollection.add("bbb1");
        // stringCollection.add("aaa1");
        // stringCollection.add("bbb3");
        // stringCollection.add("ccc");
        // stringCollection.add("bbb2");
        // stringCollection.add("ddd1");

        List<String> aaa = stringCollection.stream()
                .filter(s -> s.contains("aaa"))
                .sorted((a, b) -> a.compareTo(b))
                .collect(Collectors.toList());

        System.out.println(aaa);

        Optional<String> reduce = stringCollection.stream()
                .sorted()
                .reduce((a, b) -> a + "#" + b);

        System.out.println(reduce.isPresent());
        reduce.ifPresent(System.out::println);

    }
}