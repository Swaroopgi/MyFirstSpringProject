package com.gvs.test;

import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaOperations {

    public static void main(String[] a){


        Predicate<String> testPredicate= (s)->!"testcat".equalsIgnoreCase(s);

        System.out.println(TestData.forest);
            System.out.println(TestData.forest.stream().flatMap(Collection::stream)
                    .map(s -> "test"+s)
                    .filter( testPredicate)
                    .collect(Collectors.toList()) );


    }
}
