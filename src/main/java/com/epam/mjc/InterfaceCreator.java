package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterfaceCreator {

    public static void main(String[] args) {
        List <Integer> integerList = new ArrayList<>(List.of(3, 6, 9));

        InterfaceCreator interfaceCreator = new InterfaceCreator();
        System.out.println(interfaceCreator.divideBy(3).apply(integerList));

    }

//    First solution

    public Operation<Integer> divideBy(Integer divider) {
//        Function<Integer, Integer> devide = integer -> integer / divider;
        return operation -> operation.stream()
//                .map(devide)
                .map(e -> e/divider)
                .collect(Collectors.toList());
    }

       /*

//       Second solution

        public Operation<Integer> divideBy(Integer divider) {
            return arg -> {
                List<Integer> list = new ArrayList<>();
                for (Integer integer : arg) {
                    list.add(integer / divider);
                }
//                System.out.println(list);
                return list;
            };
        }
       */



//        Operation operation
//
//        return () -> intValue.s
//
//        List <Integer> integerList = new ArrayList<>(List.of(3, 6, 9));
//
//        Operation operation = () -> {
//            List<Integer> modifiedIntegerList = new ArrayList<>();
//            integerList.forEach(e : e/divider
//                e / divider;
//
//
//            });
//        } return
//        throw new UnsupportedOperationException("You should implement this method.");
    }

