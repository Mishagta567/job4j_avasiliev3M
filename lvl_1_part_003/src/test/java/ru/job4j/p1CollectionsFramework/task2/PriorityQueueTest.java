package ru.job4j.p1CollectionsFramework.task2;

import org.junit.Test;

import java.util.LinkedList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {

   @Test
   public void whenHigherPriority() {
      PriorityQueue queue = new PriorityQueue();
      queue.put(new Task("low", 5));
      queue.put(new Task("urgent", 1));
      queue.put(new Task("middle", 3));
      Task result = queue.take();
      assertThat(result.getDesc(), is("urgent"));
   }

   @Test
   public void checkPrioritySize() {
      PriorityQueue queue = new PriorityQueue();
      queue.put(new Task("low1", 5));
      queue.put(new Task("urgent1", 1));
      queue.put(new Task("middle1", 3));
      queue.put(new Task("low2", 5));
      int queueSize = queue.getTasksSize();
      assertThat(queueSize, is(4));
   }
}
