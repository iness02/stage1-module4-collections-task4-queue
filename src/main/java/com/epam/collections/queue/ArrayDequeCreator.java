package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(List.of(Objects.requireNonNull(firstQueue.poll()),
                Objects.requireNonNull(firstQueue.poll()), Objects.requireNonNull(secondQueue.poll()),
                Objects.requireNonNull(secondQueue.poll())));
        System.out.println(arrayDeque);

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            firstQueue.add(arrayDeque.pollLast());
            arrayDeque.addLast(Objects.requireNonNull(firstQueue.poll()));
            arrayDeque.addLast(Objects.requireNonNull(firstQueue.poll()));

            secondQueue.add(arrayDeque.pollLast());
            arrayDeque.addLast(Objects.requireNonNull(secondQueue.poll()));
            arrayDeque.addLast(Objects.requireNonNull(secondQueue.poll()));
        }
        System.out.println(arrayDeque);
        return arrayDeque;
    }


}
